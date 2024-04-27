//Dali Leonarod Basilio Torres
//Ejercicio 23
//Una funcion lmabda e suna funcion anonima, es decir no tiene nombre, ni pertenece a ninguna clase

//Paso 1 para hacer una funcion lambda
//1.- Se declara una variable de tipo interfaz funcional
//2.- Se asigna una funcion lambda a la variable

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduccion a funciones lambda");
        // Dentro de las llaves se implementa el nombre de la funcion lambda
        Asistencia lambda = () -> System.out.println("Asistencia registrada");
        lambda.registro(); // EL registro se hace con la funcion lambda que se asigno a la variable lambda

        Asistencia lambda2 = () -> {
            int i = 0;
            System.out.println("Incrementar asistencia");
            System.out.println(++i);
            lambda.registro(); // EL registro se hace con la funcion lambda que se asigno a la variable lambda
        };
        lambda2.registro();

        // Si es una sola instruccion se pueden omitir las llaves
        Asistencia lambda3 = () -> System.out.println("Suma" + (3 + 4));
        lambda3.registro();
    }
}