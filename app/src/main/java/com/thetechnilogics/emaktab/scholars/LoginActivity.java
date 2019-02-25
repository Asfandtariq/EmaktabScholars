package com.thetechnilogics.emaktab.scholars;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.intrusoft.squint.DiagonalView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

//    @BindView(R.id.login_submit_btn)
//    Button login_submit_btn;
//
//    @BindView(R.id.login_phone_editbox)
//    EditText login_phone_editbox;
//
//    @BindView(R.id.login_password_editbox)
//    EditText login_password_editbox;
//    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        this.activity=this;
        setContentView(R.layout.attendence_layout);
//        ButterKnife.bind(this);
//        DiagonalView diagonalView = (DiagonalView)findViewById(R.id.diagonal);
//
//        diagonalView.setScaleType(ImageView.ScaleType.FIT_XY);


    }

//    @OnClick(R.id.login_submit_btn)
//    public void login_btn(View view){
//        Toast.makeText(activity,"Login Button",Toast.LENGTH_SHORT).show();
//        Intent intent=new Intent(activity,MainActivity.class);
//        startActivity(intent);
//
//
//    }

}
