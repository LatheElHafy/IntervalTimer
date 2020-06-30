package com.gameoverdev.intervaltimer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextField = (TextView) findViewById(R.id.mTextField);

        setTimer();
    }

    public void setTimer (){
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) { // on tick is the every movement of the second clock.
                mTextField.setText("seconds remaining: " + millisUntilFinished / 1000); // Where the field is updated.
            }

            public void onFinish() {
                mTextField.setText("done!");
            }
        }.start();

    }
}