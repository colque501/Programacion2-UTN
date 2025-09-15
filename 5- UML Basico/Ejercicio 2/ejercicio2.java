/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2;

/**
*
* @author Brian
* 
*/
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear usuario
        Usuario usuario = new Usuario("Matias Hualde", "45678542");

        // Crear batería (puede existir independientemente del celular)
        Bateria bateria = new Bateria("Li-Ion X200", 4000);

        // Crear celular y asociarle la batería
        Celular celular = new Celular("IMEI123456895", "Xiaomi", "Poco f4", bateria);

        // Asociar bidireccionalmente celular y usuario
        usuario.setCelular(celular);

        // Mostrar información desde el celular
        System.out.println(">>> Desde el Celular:");
        System.out.println(celular);

        // Mostrar información desde el usuario
        System.out.println("\n>>> Desde el Usuario:");
        System.out.println(usuario);
    }
}
   
