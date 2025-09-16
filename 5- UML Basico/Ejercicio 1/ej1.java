/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

/**
*
* @author Brian
* 
*/
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Brian Gutierrez", "12345678");

        // Crear pasaporte con su foto (la composición ocurre aquí)
        Pasaporte pasaporte = new Pasaporte("AR12345", "10/20/", "perfil.jpg", "jpg");

        // Asociar bidireccionalmente titular y pasaporte
        titular.setPasaporte(pasaporte);

        // Mostrar información desde el pasaporte
        System.out.println(">>> Desde el Pasaporte:");
        System.out.println(pasaporte);

        // Mostrar información desde el titular
        System.out.println("\n>>> Desde el Titular:");
        System.out.println(titular);

    }
    
}
