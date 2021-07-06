package com.atkandroid.atk_wallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import dmax.dialog.SpotsDialog;

import android.Manifest;
import android.app.WallpaperManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;
import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

public class ViewActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView fullImage;
    private FloatingActionMenu floatMenu;
    private FloatingActionButton btn_set,btn_share,btn_download;

    private final static int PERMISSION_REQUEST_CODE = 1000;

    public void onRequestPermissionResult(int resultCode, @NonNull String[] permission, @NonNull int[] grantResults){
        super.onRequestPermissionsResult(resultCode,permission,grantResults);
        switch (resultCode){
            case PERMISSION_REQUEST_CODE:
            {
                if(grantResults.length>0 && grantResults[0]== PackageManager.PERMISSION_GRANTED)
                    Toast.makeText(this,"Permission Granted",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(this,"Permission Denied",Toast.LENGTH_SHORT).show();
            }
            break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED)
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                requestPermissions(new String[]{
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                },PERMISSION_REQUEST_CODE);
            }





        fullImage = findViewById(R.id.fullImage);
        Picasso.get().load(getIntent().getStringExtra("images")).into(fullImage);

        floatMenu = findViewById(R.id.floatMenu);
        btn_set = findViewById(R.id.setWallpaper);
        btn_share = findViewById(R.id.shareWallpaper);
        btn_download = findViewById(R.id.downloadWallpaper);

        btn_set.setOnClickListener(this);
        btn_share.setOnClickListener(this);
        btn_download.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.setWallpaper:
                loadWallpaper();
                floatMenu.close(true);
                break;
            case R.id.shareWallpaper:
                shareImage();
                Toast.makeText(this,"Share Wallpaper",Toast.LENGTH_SHORT).show();
                floatMenu.close(true);
                break;
            case R.id.downloadWallpaper:
                saveImage();
                floatMenu.close(true);
                break;
        }
    }

    private void shareImage() {
        Bitmap bitmap = getBitmapFromView(fullImage);
        try{
            File file = new File(this.getExternalCacheDir(),"wallpaper.png");
            FileOutputStream fos = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,fos);
            fos.flush();
            fos.close();
            file.setReadable(true,false);
            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(Intent.EXTRA_STREAM, FileProvider.getUriForFile(ViewActivity.this, BuildConfig.APPLICATION_ID+".provider",file));
            intent.setType("image/*");
            startActivity(Intent.createChooser(intent,"To Share Image"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private Bitmap getBitmapFromView(View view) {
        Bitmap returnBitmap = Bitmap.createBitmap(view.getWidth(),view.getHeight(),Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(returnBitmap);
        Drawable bgDrawable = view.getBackground();
        if(bgDrawable != null){
            bgDrawable.draw(canvas);
        }else{
            canvas.drawColor(Color.WHITE);
        }
        view.draw(canvas);
        return returnBitmap;
    }

    public void loadWallpaper(){
        Bitmap bitmap = ((BitmapDrawable)fullImage.getDrawable()).getBitmap();
        WallpaperManager manager = WallpaperManager.getInstance(getApplicationContext());

        try {
            manager.setBitmap(bitmap);
            Toast.makeText(this,"Set Wallpaper Successfully",Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this,"Something Went Wrong",Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }

    public void saveImage(){
        if(ActivityCompat.checkSelfPermission(ViewActivity.this,Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this,"You should Grant Permissio",Toast.LENGTH_SHORT).show();
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                requestPermissions(new String[]{
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                },PERMISSION_REQUEST_CODE);
            }
            return;
        }
        else{

            String filename = UUID.randomUUID().toString()+".jpg";
            Picasso.get().load(getIntent().getStringExtra("images")).into(new SaveImageHelper(getBaseContext(),getApplicationContext().getContentResolver(), filename, "Image Description"));
        }
    }

}