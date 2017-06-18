package com.example.vik.grabbit;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Start extends AppCompatActivity {
    public static MediaPlayer mp,mp1;
    ImageButton button4;
    ImageButton b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mp=MediaPlayer.create(this,R.raw.p);
        mp1=MediaPlayer.create(this,R.raw.m);
        mp.setLooping(true);
        mp.start();


        button4=(ImageButton)findViewById(R.id.imageButton3);
        b5=(ImageButton)findViewById(R.id.imageButton7);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            mp.stop();
            mp1.stop();
            finish();

        }




        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent it1 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(it1);
                mp.stop();
                mp1.setLooping(true);
                mp1.start();


            }
        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp.isPlaying()){
                    mp.pause();
                    mp1.pause();
                }
                else {
                    mp.start();
                    mp1.start();
                }}
        });

    }


    protected void onDestroy() {
        super.onDestroy();
        mp.stop();
        mp1.stop();

    }}
