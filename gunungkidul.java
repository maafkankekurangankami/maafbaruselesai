package com.example.user.navigationdrawer;


import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by USER on 13/05/2018.
 */

public class gunungkidul extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gunungkidul);
    }
    // untuk mengganti isi kontainer menu yang dipiih
    private void callFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }

    public void Pindah(View view) {
        Intent intent = new Intent(gunungkidul.this, detail_museumkayu.class);
        startActivity(intent);
    }
}
