package com.mobileia.helper.activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by matiascamiletti on 16/3/17.
 */

abstract public class SplashBaseActivity extends AppCompatActivity {

    protected int splashDuration = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initTimer();
    }

    protected void initTimer(){
        new CountDownTimer(splashDuration*1000, 1000){
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                onCompleted();
                // Close Splash
                finish();
            }
        }.start();
    }

    abstract protected void onCompleted();

    /**
     * Setea el tiempo del Splash
     * @param seconds Numero entero de segundos
     */
    public void setSplashDuration(int seconds){
        this.splashDuration = seconds;
    }
}
