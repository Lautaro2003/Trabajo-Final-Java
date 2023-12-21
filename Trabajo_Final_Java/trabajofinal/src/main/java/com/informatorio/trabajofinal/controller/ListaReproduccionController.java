package com.informatorio.trabajofinal.controller;

import com.informatorio.trabajofinal.entity.ListaReproduccion;
import com.informatorio.trabajofinal.service.ListaReproduccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/listas-reproduccion")
public class ListaReproduccionController {

    @Autowired
    private ListaReproduccionService listaReproduccionService;

    @GetMapping("/publicas")
    public ResponseEntity<List<ListaReproduccion>> buscarListasPublicasPorNombre(
            @RequestParam(name = "nombre", required = false) String nombre) {
        List<ListaReproduccion> listas = listaReproduccionService.buscarListasPublicasPorNombre(nombre);
        return ResponseEntity.ok(listas);
    }

    @PutMapping("/{listaId}")
    @PreAuthorize("#listaId != null and hasAuthority('LISTA_CREATOR_' + #listaId)")
    public ResponseEntity<String> actualizarListaReproduccion(
            @PathVariable Long listaId, @RequestBody ListaReproduccionDTO listaReproduccionDTO) {
        
        return ResponseEntity.ok("Lista de reproducción actualizada correctamente");
    }

    
}