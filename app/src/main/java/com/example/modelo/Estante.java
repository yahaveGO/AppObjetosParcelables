package com.example.modelo;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.example.modelo.Libro;

import java.util.ArrayList;
import java.util.List;


public class Estante implements Parcelable {

    private List<Libro> libros;

    public Estante(){
        libros = new ArrayList<>();
    }


    protected Estante(Parcel in) {
        libros = in.createTypedArrayList(Libro.CREATOR);
    }

    public static final Creator<Estante> CREATOR = new Creator<Estante>() {
        @Override
        public Estante createFromParcel(Parcel in) {
            return new Estante(in);
        }

        @Override
        public Estante[] newArray(int size) {
            return new Estante[size];
        }
    };


    public  void agregar(Libro libro){
        libros.add(libro);
    }

    public String getListadoLibros(){
        String datos="";
        for (Libro libro:libros){
            datos+=libro.toString()+"\n";
        }
        return datos;
    }

    public void cambiar(Libro libro, int posicion){
        libros.set(posicion,libro);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(libros);
    }

}
