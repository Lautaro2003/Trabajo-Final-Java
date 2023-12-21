package com.informatorio.trabajofinal.repository;

import com.informatorio.trabajofinal.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GeneroRepository extends JpaRepository<Genero, Long> {

    Genero findByNombre(String nombre);

    

    List<Genero> findAllByOrderByNombreAsc();
}
