package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MakananActivity extends AppCompatActivity {

    ListView listView;
    Spinner combo;

    public String Menu_Makanan [] = {" ","Kikil", "Usus Goreng", "Jengkol Balado", "Sayur Asem", "Tempe Orek","Ayam Goreng", "Sayur Nangka","Perkedel", "Telur Goreng","Telor Asin", "Telur Balado"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        listView = (ListView) findViewById(R.id.listmakanan);
        combo = (Spinner) findViewById(R.id.combomakanan);

        ArrayAdapter adapter = new ArrayAdapter(MakananActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Menu_Makanan);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }
}