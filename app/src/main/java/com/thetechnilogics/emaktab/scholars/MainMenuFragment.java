package com.thetechnilogics.emaktab.scholars;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.navigation.Navigation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainMenuFragment extends Fragment {


  @BindView(R.id.dashboard_back_btn)
  Button dashboard_back_btn;

  @BindView(R.id.menu_attendence_btn)
    CardView menu_attendence_btn;

    @BindView(R.id.dashboard_power_btn)
    Button dashboard_power_btn;





    public MainMenuFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view= inflater.inflate(R.layout.fragment_main_menu, container, false);
        ButterKnife.bind(this,view);
        return view;



//        btn_one.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.tofirstFragment));
//        //other way is
//        btn_two.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Navigation.findNavController(view).navigate(R.id.tosecondFragment);
//            }
//        });
    }

    @OnClick(R.id.dashboard_back_btn)
    public void backBtnProcess(View view)
    {
        Toast.makeText(getActivity(),"THis is back btn",Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.dashboard_power_btn)
    public void logoutBtnProcess(View view)
    {
        Toast.makeText(getActivity(),"Logout",Toast.LENGTH_SHORT).show();

    }

    @OnClick(R.id.menu_attendence_btn)
    public void backAttendenceProcess(View view)
    {
        Toast.makeText(getActivity(),"attendence btn",Toast.LENGTH_SHORT).show();
        Navigation.findNavController(view).navigate(R.id.attendenceFragment);
    }



    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


}
