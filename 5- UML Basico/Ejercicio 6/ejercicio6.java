/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

/**
*
* @author Brian
* 
*/
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente = new Cliente("Juan Coria", "1597531597");

        // Crear mesa
        Mesa mesa = new Mesa(5, 3);

        // Crear reserva asociando cliente y mesa
        Reserva reserva = new Reserva("08/10/2025", "21:00", cliente, mesa);

        // Mostrar información desde la reserva
        System.out.println(">>> Desde la Reserva:");
        System.out.println(reserva);

        // Mostrar información del cliente
        System.out.println("\n>>> Información del Cliente:");
        System.out.println(cliente);

        // Mostrar información de la mesa
        System.out.println("\n>>> Información de la Mesa:");
        System.out.println(mesa);
    }
    
}
