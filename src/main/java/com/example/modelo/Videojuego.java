package com.example.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "videojuego")
public class Videojuego {

    @Id
    private int idvideojuego;
    private String nombrejuego;
    private int pegi;
    private String genero;

    public Videojuego() {
    }

    public Videojuego(int idvideojuego, String nombrejuego, int pegi, String genero) {
        this.idvideojuego = idvideojuego;
        this.nombrejuego = nombrejuego;
        this.pegi = pegi;
        this.genero = genero;
    }

    public int getIdvideojuego() {
        return idvideojuego;
    }

    public void setIdvideojuego(int idvideojuego) {
        this.idvideojuego = idvideojuego;
    }

    public String getNombrejuego() {
        return nombrejuego;
    }

    public void setNombrejuego(String nombrejuego) {
        this.nombrejuego = nombrejuego;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idvideojuego;
        result = prime * result + ((nombrejuego == null) ? 0 : nombrejuego.hashCode());
        result = prime * result + pegi;
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Videojuego other = (Videojuego) obj;
        if (idvideojuego != other.idvideojuego)
            return false;
        if (nombrejuego == null) {
            if (other.nombrejuego != null)
                return false;
        } else if (!nombrejuego.equals(other.nombrejuego))
            return false;
        if (pegi != other.pegi)
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "videojuego [idvideojuego=" + idvideojuego + ", nombrejuego=" + nombrejuego + ", pegi=" + pegi
                + ", genero=" + genero + "]";
    }

}
