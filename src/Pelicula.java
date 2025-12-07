public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    void muestraFichaTecnica (){
        System.out.println("el nombre de la pelicula es:  " + nombre);
        System.out.println("Fue lanzada el:" + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia (){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
