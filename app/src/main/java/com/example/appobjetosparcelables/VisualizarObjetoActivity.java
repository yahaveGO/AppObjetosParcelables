package com.example.appobjetosparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.modelo.Libro;

public class VisualizarObjetoActivity extends AppCompatActivity {
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizar_objeto);

        salida=findViewById(R.id.txtSalida);

        Libro libro= getIntent().getParcelableExtra("libro");
        salida.setText(libro.toString());
    }
}