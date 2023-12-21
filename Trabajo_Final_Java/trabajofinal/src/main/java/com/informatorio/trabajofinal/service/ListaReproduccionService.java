package com.informatorio.trabajofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informatorio.trabajofinal.entity.ListaReproduccion;
import com.informatorio.trabajofinal.repository.ListaReproduccionRepository;

import java.util.List;

@Service
public class ListaReproduccionService {

    @Autowired
    private ListaReproduccionRepository listaReproduccionRepository;

    public List<ListaReproduccion> buscarListasPublicasPorNombre(String nombre) {
        return listaReproduccionRepository.findByPublicaAndNombreContainingIgnoreCase(true, nombre);
    }
}
