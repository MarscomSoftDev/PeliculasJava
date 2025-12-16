package com.marscom.screnmatch.calculos;
import com.marscom.screenmatch.modelos.Pelicula;
import com.marscom.screenmatch.modelos.Serie;
import com.marscom.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }


}
