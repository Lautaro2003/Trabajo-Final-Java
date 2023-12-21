package com.informatorio.trabajofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.trabajofinal.service.CancionService;  
import com.informatorio.trabajofinal.service.ArtistaService;
import com.informatorio.trabajofinal.entity.Cancion;
import com.informatorio.trabajofinal.entity.Artista;

import java.util.List;

@RestController
@RequestMapping("/api/canciones")
public class CancionController {

    @Autowired
    private CancionService cancionService;

    @Autowired
    private ArtistaService artistaService;

    @GetMapping("/por-artista/{nombreArtista}")
    public ResponseEntity<List<Cancion>> getCancionesPorArtista(@PathVariable String nombreArtista) {
        Artista artista = artistaService.buscarArtistaPorNombre(nombreArtista);
        if (artista != null) {
            List<Cancion> canciones = cancionService.buscarCancionesPorArtistaOrdenadasPorRanking(artista);
            return ResponseEntity.ok(canciones);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
}