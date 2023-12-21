package com.informatorio.trabajofinal.controller;

public class ListaReproduccionDTO {

    private String nombre;
    private Long id;
    private int cantidadCanciones;

    
    public ListaReproduccionDTO(String nombre, Long id, int cantidadCanciones) {
        this.nombre = nombre;
        this.id = id;
        this.cantidadCanciones = cantidadCanciones;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }
}
