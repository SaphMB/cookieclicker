package com.saphmb.com.cookieclicker;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView score = (TextView)findViewById(R.id.score);
        ImageView imgCookie = (ImageView)findViewById(R.id.cookie);
        final ImageView imgCookie2 = (ImageView)findViewById(R.id.cookie2);
        imgCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentScore ++;
                if(currentScore>10) {
                    imgCookie2.setVisibility(View.VISIBLE);
                }
                score.setText(String.valueOf(currentScore));
            }
        });
    }
}
