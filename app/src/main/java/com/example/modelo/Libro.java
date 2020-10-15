package com.example.modelo;

import android.os.Parcel;
import android.os.Parcelable;

public class Libro implements Parcelable {
    private String isbn;
    private String titulo;
    private String autor;
    private String editorial;
    private String edicion;

    public Libro(){

    }

    //Aqui es donde lo lee el parcel
    public Libro(Parcel in) {
        /*
        isbn = in.readString();
        titulo = in.readString();
        autor = in.readString();
        editorial = in.readString();
        edicion = in.readString();
         */
        readFromParcel(in);
    }

    public static final Creator<Libro> CREATOR = new Creator<Libro>() {
        @Override
        public Libro createFromParcel(Parcel in) {
            return new Libro(in);
        }

        @Override
        public Libro[] newArray(int size) {
            return new Libro[size];
        }
    };

    @Override
    public String toString() {
        return "LibroParcelable{" +
                "isnb='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", edicion='" + edicion + '\'' +
                '}';
    }

    public String getIsnb() {
        return isbn;
    }

    public void setIsnb(String isnb) {
        this.isbn = isnb;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    //Aqui escribe el parcel es como un intermediario
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(isbn);
        dest.writeString(titulo);
        dest.writeString(autor);
        dest.writeString(editorial);
        dest.writeString(edicion);
    }

    //Aqui los lee
    private void readFromParcel(Parcel in) {
        isbn = in.readString();
        titulo = in.readString();
        autor = in.readString();
        editorial = in.readString();
        edicion= in.readString();
    }
}
