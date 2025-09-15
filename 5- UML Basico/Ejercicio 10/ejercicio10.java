
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

/**
*
* @author Brian
* 
*/
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear titular
        Titular titular = new Titular("Thelma Colque", "18892672");

        // Crear cuenta bancaria con clave de seguridad y fecha de última modificación como String
        CuentaBancaria cuenta = new CuentaBancaria("CBU18892672", 15000.0, "4567", "10/08/2025");

        // Asociar bidireccionalmente titular y cuenta
        titular.setCuenta(cuenta);

        // Mostrar información desde la cuenta bancaria
        System.out.println(">>> Desde la Cuenta Bancaria:");
        System.out.println(cuenta);

        // Mostrar información desde el titular
        System.out.println("\n>>> Desde el Titular:");
        System.out.println(titular);
    }
    
}
