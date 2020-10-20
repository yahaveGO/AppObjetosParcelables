package com.example.appobjparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.modelo.Libro;

import java.util.List;

public class ListaObjaParcelable extends AppCompatActivity {

    private TextView salidaList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_obja_parcelable);
        salidaList = findViewById(R.id.tvSalidaList);
        List<Libro> libros = getIntent().getExtras().getParcelableArrayList("libros");
        String texto="";
        for (Libro libro:libros){
            texto+=libro.toString()+"\n";
        }
        salidaList.setText(texto);
    }
}