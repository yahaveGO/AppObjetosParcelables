package com.example.appobjparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.modelo.Estante;
import com.example.modelo.Libro;

public class RetornarActivityObj extends AppCompatActivity {

    private TextView salida;
    private Estante estante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retornar_obj);
        estante = getIntent().getParcelableExtra("estante");
        salida = findViewById(R.id.tvSalidaR);
        salida.setText(estante.getListadoLibros());

    }

    public void retorn(View vw){

        Libro libro = new Libro();

        libro.setIsbn("345");
        libro.setTitulo("Yo,RobotSS");
        libro.setAutor("Isaac AsimovDUg");
        libro.setEdicion("569");
        libro.setEditorial("Editorial Sudamericana9987");
        estante.cambiar(libro,1);
        Intent i = getIntent().putExtra("estante",estante);
        setResult(RESULT_OK,i);
        finish();
    }
}