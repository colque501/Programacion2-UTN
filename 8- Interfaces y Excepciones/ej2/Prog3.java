package ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\Users\\Brian\\OneDrive\\Documentos\\GitHub\\UTN-TUPaD-P2\\TP8\\src\\ej2\\datos.tx");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
    }
}
