package com.example.leeal.actividad3.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    public String nombre;
    public String apellido;
    public String edad;

    public Usuario(){
        this.nombre = "";
        this.apellido = "";
        this.edad = "0";
    }

    public Usuario(String name, String lastName, String age){
        this.nombre = name;
        this.apellido = lastName;
        this.edad = age;
    }
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(apellido);
        parcel.writeString(edad);
    }

    public static final Parcelable.Creator<Usuario> CREATOR
            = new Parcelable.Creator<Usuario>(){
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int i) {
            return new Usuario[i];
        }
    };

    private Usuario(Parcel in){
        this.nombre = in.readString();
        this.apellido = in.readString();
        this.edad = in.readString();
    }

}
