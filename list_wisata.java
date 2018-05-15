package com.example.user.navigationdrawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.user.navigationdrawer.adapter.CostumListAdapter;


/**
 * Created by USER on 13/05/2018.
 */

public class list_wisata extends AppCompatActivity {
    ListView listwisata;

    String nama_wisata_sleman [] ={"Monjali", "Museum Affandi", "Museum Dirgantara"};
    String harga_tiket_sleman [] ={"Rp.20.000", "Rp.15.000", "Rp.20.000"};
    int gambar_wisata [] ={R.drawable.monjali, R.drawable.musaffandi, R.drawable.dirgantara};
    int detail_wisata [] ={R.string.monjali,R.string.affandi,R.string.dirgantara};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wisata);

        //inisialisasi
        listwisata = (ListView)findViewById(R.id.txtdetailnamawisata);

        CostumListAdapter adapter = new CostumListAdapter(this,nama_wisata_sleman,gambar_wisata,harga_tiket_sleman);

        //untuk mengisi data ke widget list view
        listwisata.setAdapter((ListAdapter) adapter);

        //aksi atau event listener dari widget list view

        listwisata.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent kirimdata = new Intent(list_wisata.this,detailwisata.class);
                kirimdata.putExtra("gbrW",gambar_wisata[i]);
                kirimdata.putExtra("namaW",nama_wisata_sleman[i]);
                kirimdata.putExtra("hargaW",harga_tiket_sleman[i]);
                kirimdata.putExtra("detailW",detail_wisata[i]);

                startActivity(kirimdata);
            }
        });

    }

}
