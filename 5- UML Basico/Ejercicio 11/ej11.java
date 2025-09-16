/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

/**
*
* @author Brian
* 
*/
public class ej11 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Crear artista
        Artista artista = new Artista("Maluma", "Regueton");

        // Crear canción asociada al artista
        Cancion cancion = new Cancion("Sobrio", artista);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Usar el reproductor para reproducir la canción (dependencia de uso)
        reproductor.reproducir(cancion);

        // Mostrar información de la canción y del artista
        System.out.println("\n>>> Información de la Canción:");
        System.out.println(cancion);

        System.out.println("\n>>> Información del Artista:");
        System.out.println(artista);
    }
    
}
