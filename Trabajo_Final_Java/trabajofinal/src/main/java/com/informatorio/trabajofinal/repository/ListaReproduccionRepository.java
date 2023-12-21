package com.informatorio.trabajofinal.repository;

import com.informatorio.trabajofinal.entity.ListaReproduccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ListaReproduccionRepository extends JpaRepository<ListaReproduccion, Long> {

    List<ListaReproduccion> findByPublicaAndNombreContainingIgnoreCase(boolean publica, String nombre);

    
}
