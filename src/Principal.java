public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);

        System.out.println("Nota de la pelicula: " + miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());


        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "matrix";
        otraPelicula.fechaDeLanzamiento = 1988;
        otraPelicula.duracionEnMinutos = 180;

        otraPelicula.muestraFichaTecnica();


    }
}
