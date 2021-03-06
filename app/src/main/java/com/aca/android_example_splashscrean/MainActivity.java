package com.aca.android_example_splashscrean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static  int SPLAS_SCREAN=5000;


    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logo,slogan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bootom_animation);

        image=findViewById(R.id.car_image);
        logo=findViewById(R.id.tv_text);
        slogan=findViewById(R.id.text2);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent intent=new Intent(MainActivity.this,Main2Activity.class);
               startActivity(intent);
               finish();


           }
       },SPLAS_SCREAN);


    }



}
