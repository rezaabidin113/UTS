package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MinumanActivity extends AppCompatActivity {

    ListView listView;
    Spinner combo;

    public String Menu_Minuman [] = {" ","Es Teh Manis", "Nutrisari", "Teh Sosro", "Susu", "Kopi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        listView = (ListView) findViewById(R.id.listminuman);
        combo = (Spinner) findViewById(R.id.combominuman);

        ArrayAdapter adapter = new ArrayAdapter(MinumanActivity.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Menu_Minuman);
        listView.setAdapter(adapter);
        combo.setAdapter(adapter);
    }

    public void tampil(View view){
        Toast.makeText(this, "Maaf Fitur Ini Belum Tersedia",Toast.LENGTH_LONG).show();
    }
}