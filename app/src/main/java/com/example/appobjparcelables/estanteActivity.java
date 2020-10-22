package com.example.appobjparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.modelo.Estante;

public class estanteActivity extends AppCompatActivity {
    private TextView objObj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estante);
        objObj = findViewById(R.id.tvObj);
        Estante estante=getIntent().getParcelableExtra("estante");
        objObj.setText(estante.getListadoLibros());
    }
}