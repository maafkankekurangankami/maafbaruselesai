package com.example.user.navigationdrawer;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 13/05/2018.
 */

public class detailwisata extends AppCompatActivity {
    ImageView imgdetailwisata;
    TextView txtdetailnamawisata;
    TextView txtdetailwisata;
    TextView txthargatiket;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_wisata);

    }
}


