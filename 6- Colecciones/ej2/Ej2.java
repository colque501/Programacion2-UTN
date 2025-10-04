package ej2;

public class Ej2 {
    public static void main(String[] args) {
        // 1. Crear biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2. Crear autores
        Autor a1 = new Autor("A001", "Julio Verne", "Francés");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "José Mauro de Vasconcelos", "Brasileño");

        // 3. Agregar libros
        biblioteca.agregarLibro("ISBN001", "Veinte mil leguas de viaje submarino", 1810, a1);
        biblioteca.agregarLibro("ISBN002", "La vuelta al mundo en ochenta días", 1872, a1);
        biblioteca.agregarLibro("ISBN003", "Harry Potter y la Piedra Filosofal", 1997, a2);
        biblioteca.agregarLibro("ISBN004", "Harry Potter y la Cámara Secreta", 1998, a2);
        biblioteca.agregarLibro("ISBN005", "Mi planta de naranja lima", 1968, a3);

        // 4. Listar libros
        System.out.println("\n--- LISTA DE LIBROS ---");
        biblioteca.listarLibros();

        // 5. Buscar por ISBN
        System.out.println("\n--- BUSCAR LIBRO ISBN003 ---");
        Libro buscado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (buscado != null) buscado.mostrarInfo();

        // 6. Filtrar por año
        System.out.println("\n--- FILTRO AÑO 1997 ---");
        biblioteca.filtrarLibrosPorAnio(1997);

        // 7. Eliminar un libro
        System.out.println("\n--- ELIMINAR LIBRO ISBN002 ---");
        biblioteca.eliminarLibro("ISBN002");
        biblioteca.listarLibros();

        // 8. Cantidad de libros
        System.out.println("\n--- CANTIDAD TOTAL DE LIBROS ---");
        System.out.println("Total: " + biblioteca.obtenerCantidadLibros());

        // 9. Mostrar autores
        System.out.println("\n--- AUTORES DISPONIBLES ---");
        biblioteca.mostrarAutoresDisponibles();
    }
}
