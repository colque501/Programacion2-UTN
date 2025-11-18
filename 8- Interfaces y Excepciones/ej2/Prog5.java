package ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog5 {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\Brian\\OneDrive\\Documentos\\GitHub\\UTN-TUPaD-P2\\TP8\\src\\ej2\\texto.tx";
        
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        }
    }
}
