package com.thetechnilogics.emaktab.scholars;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
  @BindView(R.id.poweredby)
    TextView poweredby;

    Runnable runnable;

    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity=this;
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        runnable=new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(activity,LoginActivity.class);
                    startActivity(i);
                    finish();
            }
        };


        poweredby.postDelayed(runnable,4000);


    }

    @Override
    protected void onDestroy() {
        poweredby.removeCallbacks(runnable);
        super.onDestroy();
    }
}
