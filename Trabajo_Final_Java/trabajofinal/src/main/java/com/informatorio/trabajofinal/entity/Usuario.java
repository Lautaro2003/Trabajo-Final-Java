package com.informatorio.trabajofinal.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.validation.constraints.NotBlank;

import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Usuario extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El nombre de usuario es obligatorio")
    private String username;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<ListaReproduccion> listasReproduccion;

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<ListaReproduccion> getListasReproduccion() {
        return listasReproduccion;
    }

    public void setListasReproduccion(List<ListaReproduccion> listasReproduccion) {
        this.listasReproduccion = listasReproduccion;
    }
}