package com.example.user.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by USER on 15/05/2018.
 */

public class allgambar extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.allgambar);

    }
    public void PindahG(View view) {
        Intent intent = new Intent(allgambar.this, allgambar.class);
        startActivity(intent);
    }
}
