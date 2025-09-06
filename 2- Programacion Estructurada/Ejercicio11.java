/**
*
* @author Brian
* 
*/
import java.util.Scanner;
public class ejercicio11 {
    static double variableEjemploGlobal = 0.10; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
        sc.close();
    }
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * variableEjemploGlobal;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
    }
}
