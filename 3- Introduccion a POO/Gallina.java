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
public class Gallina {

    int idGallina;
    int edad;
    int huevosPuestos;

    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    public void envejecer() {
        edad += 1;
    }

    public void mostrarEstado() {

        System.out.println("La gallina " + idGallina + " tiene " + edad + " años y ha puesto " + huevosPuestos + " huevos");
    }

}
