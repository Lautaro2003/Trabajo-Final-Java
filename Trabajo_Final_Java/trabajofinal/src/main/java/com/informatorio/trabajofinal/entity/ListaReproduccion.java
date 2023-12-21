package com.informatorio.trabajofinal.entity;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class ListaReproduccion extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private boolean repetirAlFinalizar;
    private boolean reproducirAleatoriamente;
    private boolean esPublica;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
      name = "lista_cancion", 
      joinColumns = @JoinColumn(name = "lista_id"), 
      inverseJoinColumns = @JoinColumn(name = "cancion_id"))
    private List<Cancion> canciones;

    

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

    public boolean isRepetirAlFinalizar() {
        return repetirAlFinalizar;
    }

    public void setRepetirAlFinalizar(boolean repetirAlFinalizar) {
        this.repetirAlFinalizar = repetirAlFinalizar;
    }

    public boolean isReproducirAleatoriamente() {
        return reproducirAleatoriamente;
    }

    public void setReproducirAleatoriamente(boolean reproducirAleatoriamente) {
        this.reproducirAleatoriamente = reproducirAleatoriamente;
    }

    public boolean isEsPublica() {
        return esPublica;
    }

    public void setEsPublica(boolean esPublica) {
        this.esPublica = esPublica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    
}
