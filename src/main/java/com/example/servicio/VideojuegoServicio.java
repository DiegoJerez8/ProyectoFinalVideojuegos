package com.example.servicio;

import java.util.List;
import com.example.modelo.Videojuego;

public interface VideojuegoServicio {

	/**
	 * acciones que quiero que realice , la implementacion se realizará en
	 * ProductoServicioImpl.java
	 * 
	 */

	List<Videojuego> listaVideojuegos();

	void nuevoVideojuego(Videojuego videojuego);

	List<Videojuego> videojuegoPlataformas();

	List<Videojuego> videojuegoMayorEdad();

	List<Videojuego> videojuegoMenor();

}
