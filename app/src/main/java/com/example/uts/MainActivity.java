package com.example.uts;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button exitBotton;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button makanan = findViewById(R.id.menu1);
        Button minuman = findViewById(R.id.menu2);
        ImageButton profile = findViewById(R.id.btnprofile);
        makanan.setOnClickListener(this);
        minuman.setOnClickListener(this);
        profile.setOnClickListener(this);

        exitBotton = findViewById(R.id.btnexit);
        builder = new AlertDialog.Builder(this);

        exitBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title);

                builder.setMessage("Anda Ingin Keluar ?")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int witch) {
                                finish();
                                Toast.makeText(MainActivity.this, "Anda Keluar", Toast.LENGTH_LONG);
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int witch) {
                                dialog.cancel();
                                Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT);
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Peringatan");
                alertDialog.show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu1:
                Intent pindahIntent = new Intent(this, MakananActivity.class);
                startActivity(pindahIntent);
                break;
            case R.id.menu2:
                Intent pindahIntent1 = new Intent(this, MinumanActivity.class);
                startActivity(pindahIntent1);
                break;
            case R.id.btnprofile:
                Intent pindahIntent2 = new Intent(this, ProfileActivity.class);
                startActivity(pindahIntent2);
                break;
        }
    }
}