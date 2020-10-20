package com.example.appobjparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.modelo.Libro;

public class VisualizarObjActivity extends AppCompatActivity {
    private TextView tvSalida;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_obj);

        tvSalida = findViewById(R.id.tvSalida);
        Libro libro = getIntent().getParcelableExtra("libro");
        tvSalida.setText(libro.toString());


    }
}