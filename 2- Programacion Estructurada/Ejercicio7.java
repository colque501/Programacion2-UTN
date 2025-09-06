/**
*
* @author Brian
* 
*/
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("ingrese una nota (0-10):");
            nota = sc.nextInt();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Eror: Nota inválida. Ingrese una nota entre 0 y 10.");
            }            
        } while (nota < 0 || nota > 10);        
        System.out.println("nota guardada corectamente.");
        sc.close();
    }
}
