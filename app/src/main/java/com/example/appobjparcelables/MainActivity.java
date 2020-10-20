package com.example.appobjparcelables;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import com.example.modelo.Estante;
import com.example.modelo.Libro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pasarObjParcelable(View vw){
        Libro libro = new Libro();
        libro.setIsbn("23D");
        libro.setTitulo("Yo,Robot");
        libro.setAutor("Isaac Asimov");
        libro.setEdicion("56");
        libro.setEditorial("Editorial Sudamericana");

        Intent i = new Intent(this,VisualizarObjActivity.class);
        i.putExtra("libro",libro);
        startActivity(i);



    }

    public void pasarListaParcelable(View vw){
        Libro libroParcelable = new Libro();
        Libro libroParcelable2 = new Libro();
        Libro libroParcelable3 = new Libro();

        libroParcelable.setIsbn("23D");
        libroParcelable.setTitulo("Yo,Robot");
        libroParcelable.setAutor("Isaac Asimov");
        libroParcelable.setEdicion("56");
        libroParcelable.setEditorial("Editorial Sudamericana");

        libroParcelable2.setIsbn("O13X");
        libroParcelable2.setTitulo("El retrato de Dorian Gray");
        libroParcelable2.setAutor("Oscar Wilde");
        libroParcelable2.setEdicion("67");
        libroParcelable2.setEditorial("EMU");

        libroParcelable3.setIsbn("45VG");
        libroParcelable3.setTitulo("Ladrona de libros");
        libroParcelable3.setAutor("Markus Zusak");
        libroParcelable3.setEdicion("80");
        libroParcelable3.setEditorial("Debolsillo");

        List<Libro> libros = new ArrayList<>();
        libros.add(libroParcelable);
        libros.add(libroParcelable2);
        libros.add(libroParcelable3);

        Intent i =  new Intent(this,ListaObjaParcelable.class);
        i.putParcelableArrayListExtra("libros", (ArrayList<? extends Parcelable>) libros);
        startActivity(i);
    }

    public void pasarEstante(View vw){

        Libro libro = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();

        libro.setIsbn("23D");
        libro.setTitulo("Yo,Robot");
        libro.setAutor("Isaac Asimov");
        libro.setEdicion("56");
        libro.setEditorial("Editorial Sudamericana");

        libro2.setIsbn("O13X");
        libro2.setTitulo("El retrato de Dorian Gray");
        libro2.setAutor("Oscar Wilde");
        libro2.setEdicion("67");
        libro2.setEditorial("EMU");

        libro3.setIsbn("45VG");
        libro3.setTitulo("Ladrona de libros");
        libro3.setAutor("Markus Zusak");
        libro3.setEdicion("80");
        libro3.setEditorial("Debolsillo");

        /*List<Libro> libros = new ArrayList<>();
        libros.add(libroParcelable);
        libros.add(libroParcelable2);
        libros.add(libroParcelable3);*/
        Estante estante = new Estante();
        estante.agregar(libro);
        estante.agregar(libro2);
        estante.agregar(libro3);

        Intent i = new Intent(this,estanteActivity.class);
        i.putExtra("estante", estante);
        startActivity(i);


    }

    public void retornarObj(View vw) {

        Libro libro = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();

        libro.setIsbn("23D");
        libro.setTitulo("Yo,Robot");
        libro.setAutor("Isaac Asimov");
        libro.setEdicion("56");
        libro.setEditorial("Editorial Sudamericana");

        libro2.setIsbn("O13X");
        libro2.setTitulo("El retrato de Dorian Gray");
        libro2.setAutor("Oscar Wilde");
        libro2.setEdicion("67");
        libro2.setEditorial("EMU");

        libro3.setIsbn("45VG");
        libro3.setTitulo("Ladrona de libros");
        libro3.setAutor("Markus Zusak");
        libro3.setEdicion("80");
        libro3.setEditorial("Debolsillo");

        Estante estante = new Estante();
        estante.agregar(libro);
        estante.agregar(libro2);
        estante.agregar(libro3);

        Intent i = new Intent(this, RetornarActivityObj.class);
        i.putExtra("estante", estante);
        startActivityForResult(i, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode==1 && resultCode==RESULT_OK){
             Estante estante=data.getParcelableExtra("estante");
            Toast.makeText(this,estante.getListadoLibros(), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this,"no hay datos", Toast.LENGTH_LONG).show();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}