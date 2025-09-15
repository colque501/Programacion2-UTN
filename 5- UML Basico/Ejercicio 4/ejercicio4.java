
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

import ej1.*;

/**
*
* @author Brian
* 
*/
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear banco (puede existir sin tarjeta)
        Banco banco = new Banco("Banco BBVA", "30-18879522-2");

        // Crear cliente
        Cliente cliente = new Cliente("Adrian Gutierrez", "19023129");

        // Crear tarjeta de crédito y asociarla al banco
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-3125", "12/27", banco);

        // Asociar bidireccionalmente tarjeta y cliente
        cliente.setTarjeta(tarjeta);

        // Mostrar información desde la tarjeta
        System.out.println(">>> Desde la Tarjeta de Crédito:");
        System.out.println(tarjeta);

        // Mostrar información desde el cliente
        System.out.println("\n>>> Desde el Cliente:");
        System.out.println(cliente);

        // Mostrar información del banco
        System.out.println("\n>>> Banco asociado:");
        System.out.println(banco);
    }
    
}
