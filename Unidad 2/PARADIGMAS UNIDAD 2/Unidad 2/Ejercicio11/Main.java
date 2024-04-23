
//Carpetas y Archivos con recursividad
//Ejercicio11/Main.java 
//Basilio Torres Dali Leonardo
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 11");
        System.out.println("Carpetas y Archivos con recursividad");
        System.out.println("\n ");
        File fichero = new File("C:\\abc"); // El fichero es la carpeta abc en el disco C y el pathname es C:\abc
        mostrarcarpeta(fichero);
    }

    public static void mostrarcarpeta(File fichero) {
        if (fichero.isDirectory()) {
            File[] lista = fichero.listFiles();
            for (int i = 0; i < lista.length; i++) {

                System.out.println(lista[i].getName());
                if (lista[i].isDirectory()) {
                    System.out.println("Carpeta : " + lista[i].getName());
                    mostrarcarpeta(lista[i]);
                }
            }
        } else
            System.out.println("No es carpeta");
    }
}
