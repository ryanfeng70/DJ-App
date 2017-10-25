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

        Button one = (Button)this.findViewById(R.id.bass);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.basskick);
        one.setOnClickListener(new OnClickListener(){

            public void onClick(View v) {
                mp.start();
            }
        });

    }
}
