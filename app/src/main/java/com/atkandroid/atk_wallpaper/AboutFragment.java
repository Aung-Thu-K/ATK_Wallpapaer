package com.atkandroid.atk_wallpaper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Locale;

public class AboutFragment extends Fragment {

     private EditText etEmail;
     private ImageButton btnSend;
     private TextToSpeech tts;
     private ImageView img;
     private Animation rotate;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        etEmail = view.findViewById(R.id.etEmail);
        btnSend = view.findViewById(R.id.btnSend);
        img = view.findViewById(R.id.imageView);

        rotate = AnimationUtils.loadAnimation(getContext(),R.anim.rotate);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                String strMail = "aungthukhant2001@gmail.com";
                String subject = "Android";
                String message = etEmail.getText().toString();

                Intent mail = new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL,strMail);
                mail.putExtra(Intent.EXTRA_SUBJECT,subject);
                mail.putExtra(Intent.EXTRA_TEXT,message);
                mail.setType("plain/text");

                Intent chooser = Intent.createChooser(mail,"Choose Mail App!");
                startActivity(chooser);

            }
        });

        tts = new TextToSpeech(getLayoutInflater().getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if(i != TextToSpeech.ERROR){
                    tts.setLanguage(Locale.US);
                }
            }
        });

        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String language = "Hello Guys my name is Mg Aung Thu Khant. I'm 19 years old.I am attending at University of computer studies Taungoo. Good Luck.";
                tts.speak(language,TextToSpeech.QUEUE_FLUSH,null);
                img.startAnimation(rotate);
            }
        });

        return view;
    }
}