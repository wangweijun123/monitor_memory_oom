package com.darren.optimize.day09;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ANRWatchDog anrWatchDog = new ANRWatchDog(this);
        anrWatchDog.start();
    }

    public void click(View view) {
        /*try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
