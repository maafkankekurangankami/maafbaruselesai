package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.example.user.navigationdrawer.R;
public class Gallery extends Fragment {
    public Gallery(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.allgambar, container, false);

        getActivity().setTitle("Gambar Wisata Edukasi");

        return view;
    }
}