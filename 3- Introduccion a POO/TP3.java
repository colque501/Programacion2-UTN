package tp3.introduccion_poo;

/**
*
* @author Brian
* 
*/
public class TP3Introduccion_POO {

    public static void ejercicio1() {

        Estudiante estudiante = new Estudiante();

        estudiante.nombre = "Brian";
        estudiante.apellido = "Gutierrez";
        estudiante.curso = "Comisión 15";
        estudiante.calificacion = 8;

        estudiante.mostrarInfo();
        estudiante.subirCalificacion(5);
        estudiante.bajarCalificacion(3);
        estudiante.mostrarInfo();
    }

    public static void ejercicio2() {

        Mascota mascota = new Mascota();

        mascota.nombre = "Geri";
        mascota.especie = "Perro";
        mascota.edad = 1;

        mascota.mostrarInfo();
        mascota.cumplirAnios();//Cumple 2
        mascota.cumplirAnios();//Cumple 3
        mascota.cumplirAnios();//Cumple 4
        mascota.mostrarInfo();

    }

    public static void ejercicio3() {

        Libro libro = new Libro();

        libro.setTitulo("Padre Rico, Padre Pobre");
        libro.setAutor("Robert Kiyosaki");
        libro.setAnioPublicacion(-200);
        libro.setAnioPublicacion(1997);

        libro.getInfo();

    }

    public static void ejercicio4() {

        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();

        gallina1.idGallina = 1;
        gallina1.edad = 1;
        gallina1.huevosPuestos = 0;

        gallina2.idGallina = 2;
        gallina2.edad = 1;
        gallina2.huevosPuestos = 0;

        gallina1.envejecer();
        gallina1.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.envejecer();
        gallina1.envejecer();
        gallina2.ponerHuevo();

        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

    }

    public static void ejercicio5() {

        NaveEspacial nave = new NaveEspacial("Voyayer", 50);

        System.out.println("Intento avanzar");
        nave.avanzar(10);
        System.out.println("Intento despegar");
        nave.despegar();
        System.out.println("Recargo 50");
        nave.recargarCompustible(50);
        System.out.println("Intento despegar");
        nave.despegar();
        System.out.println("Intento avanzar 10");
        nave.avanzar(10);
        System.out.println("Intento avanzar 20");
        nave.avanzar(20);
        System.out.println("Regargo 90");
        nave.recargarCompustible(90);
        System.out.println("Intento avanzar 20");
        nave.avanzar(20);
        System.out.println("Veo estado actual");
        nave.mostrarEstado();

    }

    public static void main(String[] args) {

        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

}
