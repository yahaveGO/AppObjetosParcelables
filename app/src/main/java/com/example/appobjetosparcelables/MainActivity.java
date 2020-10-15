package com.example.appobjetosparcelables;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.modelo.Libro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pasarObjetoParcelable(View view){
        Libro libro=new Libro();
        libro.setIsbn("1");
        libro.setTitulo("Android");
        libro.setAutor("Joyanes");
        libro.setEditorial("Diana");
        libro.setEdicion("2");

        Intent intent=new Intent(this,VisualizarObjetoActivity.class);
        intent.putExtra("libro",libro);
        startActivity(intent);

    }
}