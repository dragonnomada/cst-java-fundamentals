package models;

import stereotypes.IEmpaquetable;

public class Fruta implements IEmpaquetable {
    
    String nombre;
    double peso;
    String color;

    public Fruta(String nombre, double peso, String color) {
        this.nombre = nombre;
        this.peso = peso;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    
    
    @Override
    public String getDescripcion() {
        return String.format("FRUTA: %s (%s)", 
                nombre, color);
    }

    @Override
    public double getAlto() {
        return 10;
    }

    @Override
    public double getAncho() {
        return 5;
    }

    @Override
    public double getProfundidad() {
        return 5;
    }

    @Override
    public double getPeso() {
        return peso;
    }
    
    
    
}
