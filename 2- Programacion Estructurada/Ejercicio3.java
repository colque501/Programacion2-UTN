/**
*
* @author Brian
* 
*/
import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ingrese un nro: ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println("Ud es un niño");
        } else if (edad <= 17) {
            System.out.println("Ud es un adolescente");
        } else if (edad <= 59) {
            System.out.println("Ud es un adulto");
        } else if (edad >= 60) {
            System.out.println("Ud es un adulto mayor");
        }
        
        sc.close();
    }
}
