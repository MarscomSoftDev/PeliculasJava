package com.marscom.screnmatch.calculos;
import com.marscom.screenmatch.modelos.Pelicula;

public class calculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
