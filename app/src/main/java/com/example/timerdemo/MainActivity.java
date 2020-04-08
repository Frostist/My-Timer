package com.example.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String TAG = "Project";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is another way of using a timer
        new CountDownTimer(10000, 1000) {

            //android studio auto creates these categories for you...
            @Override
            public void onTick(long millisUntilFinished) {
                //Logs the value of the amount of time left
                Log.w(TAG, "Seconds left: " +String.valueOf(millisUntilFinished / 1000));
            }

            @Override
            public void onFinish() {
                //logs when the timer is done
                Log.w(TAG, "We are done");
            }
            //this .start() is very important, without it the timer doesn't start...
        }.start();



        /*
//1 way of making a timer(this way is more useful than just ussing timers

        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
             //Logging the run
             Log.w(TAG, "A second has passed");
             //this means it will run every second
             handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);
*/


    }
}
