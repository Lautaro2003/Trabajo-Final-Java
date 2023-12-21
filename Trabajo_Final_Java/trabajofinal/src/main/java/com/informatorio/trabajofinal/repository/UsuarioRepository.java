package com.informatorio.trabajofinal.repository;

import com.informatorio.trabajofinal.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByNombreUsuario(String nombreUsuario);

    

}
