package com.example.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.modelo.Videojuego;
import com.example.dao.VideojuegoDao;

@Service
public class VideojuegoServicioImpl implements VideojuegoServicio {

    @Autowired
    VideojuegoDao dao;

	@Autowired
    RestTemplate template;

	/*
	 * lista de todos los videojuegos
	 * 
	 */
    @Override
    public List<Videojuego> listaVideojuegos() {
       return dao.findAll();
    }

	/*
	 * creacion de nuevo videojuego
	 */
    @Override
	public void nuevoVideojuego(Videojuego videojuego) {
		dao.save(videojuego);
	}

	/*
	 * Filtro de videojuegos solo por plataformas
	 */
    @Override
	public List<Videojuego> videojuegoPlataformas() {

		return dao.videojuegoPlataformas();
	}

	/*
	 * Videojuegos para mayores de edad
	 */
     @Override
	public List<Videojuego> videojuegoMayorEdad() {

		return dao.videojuegoMayorEdad();
	}

	/*
	 * Videojuegos para menores de edad
	 */
     @Override
	public List<Videojuego> videojuegoMenor() {

		return dao.videojuegoMenor();
	}
}
