package com.informatorio.trabajofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informatorio.trabajofinal.entity.Artista;
import com.informatorio.trabajofinal.repository.ArtistaRepository;

@Service
public class ArtistaService {

    @Autowired
    private ArtistaRepository artistaRepository;

    public Artista obtenerArtistaPorId(Long idArtista) {
        return artistaRepository.findById(idArtista).orElse(null);
    }

    public Artista buscarArtistaPorNombre(String nombre) {
        return artistaRepository.findByNombre(nombre);
    }
}
