public class Principal {

    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;


        System.out.println("Con una duracion de: " + miPelicula.duracionEnMinutos);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "matrix";
        otraPelicula.fechaDeLanzamiento = 1988;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
        System.out.println("Fue lanzada el:" + otraPelicula.fechaDeLanzamiento);
        System.out.println("Con una duracion de: " + otraPelicula.duracionEnMinutos);



    }
}
