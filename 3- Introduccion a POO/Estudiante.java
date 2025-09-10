package tp3.introduccion_poo;

/**
*
* @author Brian
* 
*/
public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    double calificacion;

    public void mostrarInfo() {
        System.out.println("El estudiante " + nombre + " " + apellido + "del curso " + curso + " tiene una calificación de " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        double nuevaCalificacion = calificacion + puntos;
        if (nuevaCalificacion <= 10) {
            calificacion = nuevaCalificacion;
            System.out.println("Se aumenta la calificación.");
            System.out.println("Calificación actual: " + calificacion);
        } else {
            System.out.println("No es posible subir " + puntos + " punto/s. La calificación máxima debe ser 10");
            System.out.println("Calificación actual: " + calificacion);

        }
    }

    public void bajarCalificacion(double puntos) {
        double nuevaCalificacion = calificacion - puntos;
        if (nuevaCalificacion >= 0) {
            calificacion = nuevaCalificacion;
            System.out.println("Se disminuye la calificación.");
            System.out.println("Calificación actual: " + calificacion);
        } else {
            System.out.println("No es posible restar " + puntos + " punto/s. La calificación mínima debe ser 0");
            System.out.println("Calificación actual: " + calificacion);

        }
    }
}
