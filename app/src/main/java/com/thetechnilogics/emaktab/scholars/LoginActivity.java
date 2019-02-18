package com.thetechnilogics.emaktab.scholars;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.login_submit_btn)
    Button login_submit_btn;

    @BindView(R.id.login_email_editbox)
    EditText login_email_editbox;

    @BindView(R.id.login_password_editbox)
    EditText login_password_editbox;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.activity=this;
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.login_submit_btn)
    public void login_btn(View view){
        Toast.makeText(activity,"Login Button",Toast.LENGTH_SHORT).show();

    }

}
