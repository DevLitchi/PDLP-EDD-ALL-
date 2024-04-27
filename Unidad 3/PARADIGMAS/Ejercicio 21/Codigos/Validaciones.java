package Codigos;

import java.util.Scanner;

public class Validaciones {
    Scanner sc = new Scanner(System.in);

    public static boolean validarNombre(String aux) {
        if (aux.matches("[A-Za-z ]+")) { // El + es para que se repita 1 o mas veces la expresion regular [A-Za-z] para
                                         // que se pueda mas de una palabra es decir que se pueda ingresar un nombre
                                         // completo
            return true;
        } else {
            System.out.println("Ingresa un dato valido");
            return false;
        }

    }

    public static boolean validarNumeros(String aux) { // Solo valida hasta 8 digitos

        if (aux.matches("[0-9]{8}")) { // El + es para que se repita 1 o mas veces la expresion regular [A-Za-z] para
                                       // que se pueda mas de una palabra es decir que se pueda ingresar un nombre
                                       // completo
            return true;
        } else {
            System.out.println("Ingresa un dato valido");
            return false;
        }

    }

    public static boolean validarPromedio(double aux) {
        if (aux >= 0 && aux <= 100) {
            return true;
        } else {
            System.out.println("Ingresa un dato valido");
            return false;
        }

    }
}
