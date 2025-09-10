/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.introduccion_poo;

/**
*
* @author Brian
* 
*/
public class Mascota {

    String nombre;
    String especie;
    int edad;

    public void mostrarInfo() {

        System.out.println(nombre + " es " + especie + " y tiene " + edad + " años");
    }

    public void cumplirAnios() {
        edad += 1;
    }

}
