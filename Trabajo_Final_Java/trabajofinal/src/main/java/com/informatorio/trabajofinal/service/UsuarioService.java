package com.informatorio.trabajofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.informatorio.trabajofinal.repository.UsuarioRepository;
import com.informatorio.trabajofinal.entity.ListaReproduccion;
import com.informatorio.trabajofinal.entity.Usuario;
import com.informatorio.trabajofinal.controller.ListaReproduccionDTO;
import com.informatorio.trabajofinal.controller.UsuarioDTO;
import java.util.NoSuchElementException;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public UsuarioDTO obtenerInformacionUsuario(Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId)
                .orElseThrow(() -> new NoSuchElementException("Usuario no encontrado"));

        return convertirUsuarioADTO(usuario);
    }

    public UsuarioDTO convertirUsuarioADTO(Usuario usuario) {
        List<ListaReproduccionDTO> listasDTO = new ArrayList<>();
        for (ListaReproduccion lista : usuario.getListasReproduccion()) {
            ListaReproduccionDTO listaDTO = new ListaReproduccionDTO(lista.getNombre(), lista.getId(), lista.getCanciones().size());
            listasDTO.add(listaDTO);
        }
    
        return new UsuarioDTO(usuario.getNombre(), usuario.getId(), listasDTO);
    }

    
    public UsuarioService(String nombre, Long id, int cantidadCanciones) {
        
    }
}