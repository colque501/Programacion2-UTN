/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

/**
*
* @author Brian
* 
*/
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Luciana Decaux", "ldecaux@gmail.com");

        // Crear generador de QR
        GeneradorQR generador = new GeneradorQR();

        // Generar CódigoQR (dependencia de creación)
        CodigoQR codigo = generador.generar("QR8888", usuario);

        // Mostrar información del CódigoQR y del usuario
        System.out.println("\n>>> Información del Código QR:");
        System.out.println(codigo);

        System.out.println("\n>>> Información del Usuario:");
        System.out.println(usuario);
    }
    
}
