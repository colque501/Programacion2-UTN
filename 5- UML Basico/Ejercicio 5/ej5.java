/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import ej1.*;

/**
*
* @author Brian
* 
*/
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear propietario
        Propietario propietario = new Propietario("Adrian Gutierrez", "18879522");

        // Crear computadora con su placa madre (composición)
        Computadora pc = new Computadora("Asus", "MK12345", "A550", "AMD");

        // Asociar bidireccionalmente propietario y computadora
        propietario.setComputadora(pc);

        // Mostrar información desde la computadora
        System.out.println(">>> Desde la Computadora:");
        System.out.println(pc);

        // Mostrar información desde el propietario
        System.out.println("\n>>> Desde el Propietario:");
        System.out.println(propietario);
    }
    
}
