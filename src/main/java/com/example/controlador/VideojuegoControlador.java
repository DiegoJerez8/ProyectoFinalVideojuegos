package com.example.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.modelo.Videojuego;
import com.example.servicio.VideojuegoServicio;

@RestController
public class VideojuegoControlador {
    @Autowired
    VideojuegoServicio servicio;

    @GetMapping(value = "videojuego", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Videojuego> listaVideojuegosActual() {
        return servicio.listaVideojuegos();
    }

    @GetMapping(value = "videojuego/plataformas", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Videojuego> videojuegosPlataformas() {
        return servicio.videojuegoPlataformas();
    }

    @GetMapping(value = "videojuego/adultos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Videojuego> videojuegosMayorEdadActual() {
        return servicio.videojuegoMayorEdad();
    }

    @GetMapping(value = "videojuego/menores", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Videojuego> videojuegoMenorActual() {
        return servicio.videojuegoMenor();
    }

    @PostMapping(value = "videojuego", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void nuevoVideojuego(@RequestBody Videojuego videojuego) {
        servicio.nuevoVideojuego(videojuego);
    }
}
