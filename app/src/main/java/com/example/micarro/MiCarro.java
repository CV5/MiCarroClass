package com.example.micarro;

import android.util.Log;

public class MiCarro {

    private String color;
    private int ano;
    private String marca;
    private Boolean encendido;

    public MiCarro(String color, int ano, String marca) {
        this.color = color;
        this.ano = ano;
        this.marca = marca;
        this.encendido = false;
    }

    public String getColor() {
        return color;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void Acelerar(){
        Log.v("Metodos","Acelerando... Run! run! run!");
    }

    public boolean enceder(){
        if (this.encendido){
            Log.v("Metodos","El carro esta encendido");
        }else{
            Log.v("Metodos","Encendio.... Bruunnnn");
        }
        return encendido;
    }
}
