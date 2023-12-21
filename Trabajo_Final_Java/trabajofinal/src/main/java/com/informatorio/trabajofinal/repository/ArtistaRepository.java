package com.informatorio.trabajofinal.repository;

import com.informatorio.trabajofinal.entity.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {

    Artista findByNombre(String nombre);

    
}
