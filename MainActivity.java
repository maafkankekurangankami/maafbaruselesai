package com.example.user.navigationdrawer;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import static com.example.user.navigationdrawer.R.layout.gallery;

public class MainActivity extends AppCompatActivity
            implements NavigationView.OnNavigationItemSelectedListener {

        Toolbar toolbar;
        DrawerLayout drawer;
        NavigationView navigationView;
        FragmentManager fragmentManager;
        Fragment fragment = null;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                    this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
            drawer.addDrawerListener(toggle);
            toggle.syncState();

            navigationView = (NavigationView) findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            // tampilan default awal ketika aplikasii dijalankan
            if (savedInstanceState == null) {
                fragment = new root_java();
                callFragment(fragment);
            }

        }

        @Override
        public void onBackPressed() {
            drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                Toast.makeText(getApplicationContext(), "Action Settings", Toast.LENGTH_SHORT).show();
                return true;
            }

            return super.onOptionsItemSelected(item);
        }

        @SuppressWarnings("StatementWithEmptyBody")
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            // Handle navigation view item clicks here.
            int id = item.getItemId();

            // Untuk memanggil layout dari menu yang dipilih
            if (id == R.id.nav_camera) {
                fragment = new Import();
                callFragment(fragment);
            } else if (id == R.layout.allgambar) {
                fragment = new Gallery();
                callFragment(fragment);
            } else if (id == R.id.nav_slideshow) {
                fragment = new slide_show();
                callFragment(fragment);
            }

            drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

        // untuk mengganti isi kontainer menu yang dipiih
        private void callFragment(Fragment fragment) {
            fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
        }
        public void Pindah (View view){
            Intent intent = new Intent(MainActivity.this, Wisata.class);
            startActivity(intent);
        }
        public void Pindah2 (View view) {
            Intent intent = new Intent(MainActivity.this, bantul.class);
            startActivity(intent);
        }
        public void Pindah3 (View view){
            Intent intent = new Intent(MainActivity.this, kulonprogo.class);
            startActivity(intent);
        }
        public void Pindah4 (View view){
            Intent intent = new Intent(MainActivity.this, gunungkidul.class);
            startActivity(intent);
        }
        public void Pindah5 (View view){
            Intent intent = new Intent(MainActivity.this, jogjakota.class);
            startActivity(intent);
        }
    public void PindahG (View view){
        Intent intent = new Intent(MainActivity.this, allgambar.class);
        startActivity(intent);
    }
    }
