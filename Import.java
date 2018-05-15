package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
/**
 * Created by user on 10/05/2018.
 */

public class Import extends Fragment {
    public Import(){}
    RelativeLayout view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.import_main, container, false);

        getActivity().setTitle("Wisata Edukasi Jogja");

        return view;
    }
}
