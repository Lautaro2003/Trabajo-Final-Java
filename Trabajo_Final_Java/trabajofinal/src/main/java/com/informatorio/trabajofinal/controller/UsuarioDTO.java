package com.informatorio.trabajofinal.controller;

import java.util.List;

public class UsuarioDTO {

    private String nombre;
    private Long id;
    private List<ListaReproduccionDTO> listasReproduccion;

    
    public UsuarioDTO(String nombre, Long id, List<ListaReproduccionDTO> listasReproduccion) {
        this.nombre = nombre;
        this.id = id;
        this.listasReproduccion = listasReproduccion;
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

    public List<ListaReproduccionDTO> getListasReproduccion() {
        return listasReproduccion;
    }

    public void setListasReproduccion(List<ListaReproduccionDTO> listasReproduccion) {
        this.listasReproduccion = listasReproduccion;
    }
}