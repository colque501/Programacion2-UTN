package ej2;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido.");
        } finally {
            sc.close();
        }
    }
}
