package org.example.demojavafx;

public class Calzado {

    private String tipo_calzado;
    private int talla;
    private double precio;

    public Calzado(String tipo_calzado,int talla,double precio){

        this.tipo_calzado=tipo_calzado;
        this.talla=talla;
        this.precio=precio;

    }

    public double getPrecio() {
        return precio;
    }

    public int getTalla() {
        return talla;
    }

    public String getTipo_calzado() {
        return tipo_calzado;
    }
}
