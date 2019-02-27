package com.thetechnilogics.maktaberp.scholars;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.thetechnilogics.maktaberp.scholars.API.ApiClient;
import com.thetechnilogics.maktaberp.scholars.API.ApiInterface;
import com.thetechnilogics.maktaberp.scholars.Model.RequestModels.UserAuth;
import com.thetechnilogics.maktaberp.scholars.Model.UserModel;
import com.thetechnilogics.maktaberp.scholars.Model.UserResponseModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;



public class LoginActivity extends AppCompatActivity {


    UserAuth userAuth;
    @BindView(R.id.login_submit_btn)
    Button login_submit_btn;

    @BindView(R.id.login_phone_editbox)
    EditText login_phone_editbox;

    @BindView(R.id.login_password_editbox)
    EditText login_password_editbox;
    Activity activity;

    UserResponseModel userResponseModel=new UserResponseModel();
    Call<UserResponseModel> apiResponse;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       this.activity=this;
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        userAuth = new UserAuth("","");




    }

    @OnClick(R.id.login_submit_btn)
    public void login_btn(View view){
        Toast.makeText(activity,"Login Button",Toast.LENGTH_SHORT).show();
//        Intent intent=new Intent(activity,MainActivity.class);
//        startActivity(intent);
        userAuth.setMobile(login_phone_editbox.getText().toString());
        userAuth.setPassword(login_password_editbox.getText().toString());
        if(userAuth.isUserValid().equals(""))
        {
            loginProcess(userAuth);


        }else {
            Toast.makeText(LoginActivity.this, userAuth.isUserValid(), Toast.LENGTH_LONG).show();
        }






    }

    private void loginProcess(UserAuth userAuth)
    {
        ApiInterface apiInterface= ApiClient.getClient().create(ApiInterface.class);
        apiResponse= apiInterface.LoginResponse(userAuth);
        apiResponse.enqueue(new retrofit2.Callback<UserResponseModel>(){
            @Override
            public void onResponse(Call<UserResponseModel> call, Response<UserResponseModel> response) {
                if(response.code()==200)
                {
                    userResponseModel.setResult(response.body().getResult());

                    if(userResponseModel.getResult().size()>0)
                    {
                        UserModel userModel=  userResponseModel.getResult().get(0);
                        Intent intent=new Intent(activity,MainActivity.class);
                        startActivity(intent);

                    }
                    else {
                        Toast.makeText(activity,"login error",Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Snackbar.make(getCurrentFocus(),"Invalid email and password", Snackbar.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UserResponseModel> call, Throwable t) {

          Toast.makeText(LoginActivity.this, "Please turn on internet", Toast.LENGTH_LONG).show();


            }
        });

    }

}
