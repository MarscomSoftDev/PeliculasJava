public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;

    void muestraFichaTecnica (){
        System.out.println("el nombre de la pelicula es:  " + nombre);
        System.out.println("Fue lanzada el:" + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }
}
