package com.informatorio.trabajofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informatorio.trabajofinal.repository.CancionRepository;
import com.informatorio.trabajofinal.entity.Artista;
import com.informatorio.trabajofinal.entity.Cancion;

import java.util.Collections;
import java.util.List;

@Service
public class CancionService {

    @Autowired
    private CancionRepository cancionRepository;


    public List<Cancion> buscarCanciones(String genero, String artista, String album, String titulo) {
        List<Cancion> canciones = cancionRepository.searchAdvanced(genero, artista, album, titulo);

        
        Collections.sort(canciones, (c1, c2) -> c2.getRanking() - c1.getRanking());

        return canciones;
    }

    public List<Cancion> buscarCancionesAleatorias() {
        List<Cancion> canciones = cancionRepository.findAll();
        Collections.shuffle(canciones);
        return canciones;
    }

    public List<Cancion> buscarCancionesPorArtistaOrdenadasPorRanking(Artista artista) {
        return cancionRepository.findByArtistaOrderByRanking(artista);
    }
}
