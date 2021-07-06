package com.atkandroid.atk_wallpaper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout dl;
    ActionBarDrawerToggle toggle;
    NavigationView nv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = findViewById(R.id.navi_drawer_layout);
        nv = findViewById(R.id.navi_view);


        toggle = new ActionBarDrawerToggle(this,dl,R.string.open,R.string.close);

        dl.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addFragment(new ShadowFragment(),true);


        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                switch (id) {
                    case R.id.black:
                        addFragment(new BlackFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.red:
                        addFragment(new RedFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.pink:
                        addFragment(new PinkFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.mountain:
                        addFragment(new MountainFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.blue:
                        addFragment(new BlueFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.green:
                        addFragment(new GreenFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.colorful:
                        addFragment(new ColorFulFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.threeDesign:
                        addFragment(new ThreeDFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.about:
                        addFragment(new AboutFragment(),true);
                        dl.closeDrawers();break;
                    case R.id.yellow:
                        addFragment(new ShadowFragment(),true);
                        dl.closeDrawers();break;
                    default:
                        return false;
                }
                return true;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(toggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
    public void addFragment (Fragment fragment, boolean stack){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        if(stack){
            transaction.addToBackStack(fragment.getTag());
        }
        transaction.replace(R.id.to_replace,fragment);
        transaction.commit();
    }
}