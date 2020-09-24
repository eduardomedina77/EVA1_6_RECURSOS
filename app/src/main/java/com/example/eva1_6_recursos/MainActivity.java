package com.example.eva1_6_recursos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgVwBike;
    TextView txtVxDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgVwBike = findViewById(R.id.imgVwBike);
        imgVwBike.setImageResource(R.drawable.sol);
        txtVxDatos = findViewById(R.id.txtVwDatos);
        txtVxDatos.setText(R.string.mis_datos);

    }
}