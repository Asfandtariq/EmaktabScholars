package com.thetechnilogics.emaktab.scholars;

import android.content.Intent;
import android.hardware.camera2.TotalCaptureResult;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.BoomButton;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.OnBoomListener;
import com.nightonke.boommenu.OnBoomListenerAdapter;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bmb = (BoomMenuButton) findViewById(R.id.bmb);
//
//        assert bmb != null;
//
//        bmb.setButtonEnum(ButtonEnum.SimpleCircle);
//        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_6_3);
//        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_6_3);


//        for(int i=0 ;i<bmb.getPiecePlaceEnum().pieceNumber();i++) addBuilder();
//
//        bmb.setOnBoomListener(new OnBoomListenerAdapter(){
//            @Override
//            public void onBoomWillShow()
//            {
//                super.onBoomWillShow();
//            }
//
//
//        });
//
//
//        bmb.setOnBoomListener(new OnBoomListener() {
//            @Override
//            public void onClicked(int index, BoomButton boomButton) {
//                Toast.makeText(MainActivity.this,"Clicket",Toast.LENGTH_SHORT).show();
//
//            }
//
//            @Override
//            public void onBackgroundClick() {
//                Toast.makeText(MainActivity.this,"background",Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onBoomWillHide() {
//
//            }
//
//            @Override
//            public void onBoomDidHide() {
//
//            }
//
//            @Override
//            public void onBoomWillShow() {
//
//            }
//
//            @Override
//            public void onBoomDidShow() {
//
//            }
//        });
//
//
//
//
//
//
//    }
//
//    private void addBuilder(){
//        bmb.addBuilder(new SimpleCircleButton.Builder()
//        .normalImageRes(R.drawable.ic_arrow_back_black_24dp)
//                .listener(new OnBMClickListener() {
//                    @Override
//                    public void onBoomButtonClick(int index) {
//                        Toast.makeText(MainActivity.this,"builder",Toast.LENGTH_SHORT).show();
//                    }
//                })
//        );
//    }
        //second method
//        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
//            HamButton.Builder builder = new HamButton.Builder()
//                    .normalImageRes(R.drawable.ic_menu_black)
//                    .normalTextRes(R.string.app_name)
//                    .subNormalTextRes(R.string.education);
//            bmb.addBuilder(builder);
//        }
    }

}
