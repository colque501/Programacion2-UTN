/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

/**
*
* @author Brian
* 
*/
public class ej8 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Crear usuario (existe independientemente de la firma)
        Usuario usuario = new Usuario("Thelma Colque", "Thelmac@gmail.com");

        // Crear documento con firma digital (composición)
        Documento documento = new Documento(
                "Contrato de Alquiler",
                "Contenido del contrato...",
                "ABC123HASH",
                "07/09/2026",
                usuario
        );

        // Mostrar información desde el documento
        System.out.println(">>> Documento:");
        System.out.println(documento);

        // Mostrar información de la firma digital
        System.out.println("\n>>> Firma Digital dentro del Documento:");
        System.out.println(documento.getFirma());

        // Mostrar información del usuario
        System.out.println("\n>>> Usuario:");
        System.out.println(usuario);
    }
    
}
