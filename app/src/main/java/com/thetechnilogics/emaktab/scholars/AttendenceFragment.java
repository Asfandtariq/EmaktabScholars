package com.thetechnilogics.emaktab.scholars;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.support.v7.widget.Toolbar;

import com.intrusoft.squint.DiagonalView;


public class AttendenceFragment extends Fragment {
    Toolbar new_toolbar;


    public AttendenceFragment() {
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
//        final View view= inflater.inflate(R.layout.fragment_attendence, container, false);
        final View view= inflater.inflate(R.layout.attendence_layout, container, false);
        DiagonalView diagonalView = (DiagonalView)view.findViewById(R.id.diagonal);

        diagonalView.setScaleType(ImageView.ScaleType.FIT_XY);

        new_toolbar=(Toolbar)view.findViewById(R.id.new_toolbar);
   new_toolbar.setSubtitleTextColor(Color.parseColor("#FFFFFF"));
//        ((AppCompatActivity)getActivity()).setSupportActionBar(new_toolbar);


        ((AppCompatActivity)getActivity()).setSupportActionBar(new_toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        CalendarView calendar=(CalendarView)view.findViewById(R.id.calendar);
        
        return view;
    }




}
