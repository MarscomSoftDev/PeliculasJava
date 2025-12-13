import com.marscom.screenmatch.modelos.Pelicula;
import com.marscom.screenmatch.modelos.Serie;

public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        int fecha = miPelicula.getFechaDeLanzamiento();
        System.out.println("ensayio"+ fecha);

        miPelicula.muestraFichaTecnica();


        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La Casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporda(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());







//
//        com.marscom.screenmatch.modelos.Pelicula otraPelicula = new com.marscom.screenmatch.modelos.Pelicula();
//        otraPelicula.nombre = "matrix";
//        otraPelicula.fechaDeLanzamiento = 1988;
//        otraPelicula.duracionEnMinutos = 180;
//
//        otraPelicula.muestraFichaTecnica();
//

    }
}
