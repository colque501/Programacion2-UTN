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
public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor != null) {
            this.autor = autor;
        }
    }

    public void setAnioPublicacion(int anio) {
        if (anio <= 2025 && anio > 0) {
            anioPublicacion = anio;
        } else {
            System.out.println("Esa fecha es incorrecta. El año debe ser positivo y menor o igual a 2025");
        }

    }

    public void getInfo() {
        System.out.println("El libro se titula " + titulo + " y fue escrito por " + autor + " en " + anioPublicacion);

    }
}
