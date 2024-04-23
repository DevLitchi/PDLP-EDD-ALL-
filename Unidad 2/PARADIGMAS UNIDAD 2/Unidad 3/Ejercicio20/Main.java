
//Importar random
import java.util.Random;
//Importar Stream
import java.util.stream.Stream;
//Importar List

// Ejercicio 20 Introduccion a programacion funcional
// Fecha: 16/04/2024
// Autor: Dali Basilio
// Proposito: Crear un programa para mejorar la percepcion de la programacion imperativa y declarativa
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    /**
     * Programacion imperativa
     */

    public static void main(String[] args) {
        int contador = 0;
        // List<Integer> numeros = new ArrayList<>(1,12,33,4,5,6,7,8,9,10);

        // for (int index = 0; index < numeros.size(); index++) {
        // if (numeros.get(index) > 0) {
        // contador++;
        // System.out.println(positvos.get( index));
        // }
        // }
        // }
        /**
         * Programacion declarativa
         */

        // int contador = 0;
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(12);
        numeros.add(33);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(-7);
        // Stream es una secuencia en el filtro se evalua si el numero es mayor a 0
        Long c = numeros.stream().filter(n -> n > 0).count(); // El -> es una funcion lambda que se encarga de evaluar
        System.out.println(c);

        int anio = 2024;
        System.out.println(anio + "Es bisiesto? " + estatico.bisiesto(anio));
        System.out.println("Numero aleatorio entre 1 y 10: " + estatico.aleatorio(1, 10));
        // Composicion de funciones
        System.out.println("Bisiesto aleatorio: " + estatico.bisiesto(estatico.aleatorio(1999, 2050)));
        System.out.println("Suma 5: " + estatico.suma5(1234));

        // Instancia simple sin constructor
        // Esto no es herencia es estado compartido
        Carrera ing = new Carrera();
        ing.setNombre("Ingenieria en Software");
        Alumno pedro = new Alumno();
        pedro.setMatricula("123456");
        pedro.setProfesion(ing);
    };
}
