/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9;

/**
*
* @author Brian
* 
*/
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear paciente
        Paciente paciente = new Paciente("Juan Coria", "OSSEG");

        // Crear profesional
        Profesional profesional = new Profesional("Dra. Maria Laura", "General");

        // Crear cita médica asociando paciente y profesional (unidireccional)
        CitaMedica cita = new CitaMedica("17/10/2025", "10:30", paciente, profesional);

        // Mostrar información de la cita
        System.out.println(">>> Información de la Cita Médica:");
        System.out.println(cita);

        // Mostrar información del paciente
        System.out.println("\n>>> Información del Paciente:");
        System.out.println(paciente);

        // Mostrar información del profesional
        System.out.println("\n>>> Información del Profesional:");
        System.out.println(profesional);
    }
    
}
