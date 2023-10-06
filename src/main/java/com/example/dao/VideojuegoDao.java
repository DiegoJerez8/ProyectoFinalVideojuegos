package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.modelo.Videojuego;

public interface VideojuegoDao extends JpaRepository<Videojuego, Integer> {

    /*
     * Consulta para filtrar los videojuegos por 'Plataformas'
     */
    @Query("SELECT v FROM Videojuego v WHERE v.genero = 'Plataformas'")
    List<Videojuego> videojuegoPlataformas();
    /*
     * Consulta para filtrar los videojuegos por mayoria de edad
     */
    @Query("SELECT v FROM Videojuego v WHERE v.pegi >= 18")
    List<Videojuego> videojuegoMayorEdad();
    /*
     * Consulta para filtrar los videojuegos que no requieren ser mayor de edad
     */
    @Query("SELECT v FROM Videojuego v WHERE v.pegi < 18")
    List<Videojuego> videojuegoMenor();
    
}
