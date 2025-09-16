
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

/**
*
* @author Brian
* 
*/
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiano");

        // Crear editorial
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires, Argentina");

        // Crear libro con autor y editorial
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", autor, editorial);

        // Mostrar información del libro
        System.out.println(">>> Información del Libro:");
        System.out.println(libro);

        // Mostrar información del autor
        System.out.println("\n>>> Información del Autor:");
        System.out.println(autor);

        // Mostrar información de la editorial
        System.out.println("\n>>> Información de la Editorial:");
        System.out.println(editorial);
    }
    
}
