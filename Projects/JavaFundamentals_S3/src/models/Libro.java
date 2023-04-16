package models;

import stereotypes.IEmpaquetable;

public class Libro implements IEmpaquetable {

    String titulo;
    String autor;
    int año;

    public Libro(String titulo, String autor, int año) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    @Override
    public String getDescripcion() {
        return String.format("LIBRO: %s - %s (%d)", 
                titulo, autor, año);
    }

    @Override
    public double getAlto() {
        return 30;
    }

    @Override
    public double getAncho() {
        return 20;
    }

    @Override
    public double getProfundidad() {
        return 4;
    }

    @Override
    public double getPeso() {
        return 1.2;
    }
    
    
    
}
