package com.example.ryan.djapp;

import android.app.Activity;
import android.os.Bundle;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bass = (Button)this.findViewById(R.id.bass);
        bass.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.basskick);
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();

                        mp = MediaPlayer.create(getApplicationContext(), R.raw.basskick);
                    }
                    mp.start();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Button hats = (Button)this.findViewById(R.id.hats);
        hats.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.hats);
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();

                        mp = MediaPlayer.create(getApplicationContext(), R.raw.hats);
                    }
                    mp.start();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Button snare = (Button)this.findViewById(R.id.snare);
        snare.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.snare);
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();

                        mp = MediaPlayer.create(getApplicationContext(), R.raw.snare);
                    }
                    mp.start();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
