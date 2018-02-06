package com.example.m0d1x.myapplication;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = (ImageView) findViewById(R.id.img_view);
        btn = (Button) findViewById(R.id.btn);

        txt = (TextView) findViewById(R.id.txt_count);
        new CountDownTimer(20000, 1000) {
            int i = 0;

            public void onTick(long millisUntilFinished) {

                txt.setText("" + i++);
            }

            public void onFinish() {
                txt.setText("done!");
            }
        }.start();

    }
}
