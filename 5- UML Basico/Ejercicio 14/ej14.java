
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14;

/**
*
* @author Brian
* 
*/
public class ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear proyecto
        Proyecto proyecto = new Proyecto("Video22", 10);

        // Crear editor de video
        EditorVideo editor = new EditorVideo();

        // Exportar proyecto a render (dependencia de creación)
        Render render = editor.exportar("MP4", proyecto);

        // Mostrar información del render y del proyecto
        System.out.println("\n>>> Información del Render:");
        System.out.println(render);

        System.out.println("\n>>> Información del Proyecto:");
        System.out.println(proyecto);
    }
    
}
