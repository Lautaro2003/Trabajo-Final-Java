package com.informatorio.trabajofinal.repository;

import com.informatorio.trabajofinal.entity.Artista;
import com.informatorio.trabajofinal.entity.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CancionRepository extends JpaRepository<Cancion, Long> {
    List<Cancion> searchAdvanced(String genero, String artista, String album, String titulo);

    List<Cancion> findByGenero(String genero);

    List<Cancion> findByArtistaOrderByRanking(Artista artista);

    @Query("SELECT c FROM Cancion c WHERE c.genero = :genero OR c.artista = :artista OR c.album.nombre = :album OR c.nombre = :titulo")
    List<Cancion> searchAdvanced(@Param("genero") String genero, @Param("artista") Artista artista,
                                 @Param("album") String album, @Param("titulo") String titulo);

    @Query("SELECT c FROM Cancion c ORDER BY c.ranking DESC")
    List<Cancion> findTopSongsByRanking();

    
}
