package com.marscom.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporda;
    private int minutosPorEpisodio;

    public int getEpisodiosPorTemporda() {
        return episodiosPorTemporda;
    }

    public void setEpisodiosPorTemporda(int episodiosPorTemporda) {
        this.episodiosPorTemporda = episodiosPorTemporda;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}
