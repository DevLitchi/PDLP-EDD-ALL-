
// Funciones y clases anonnimas
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        List<Integer> positivos = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> pares1 = new ArrayList<>();
        List<Integer> pares2 = new ArrayList<>();
        List<Integer> pares3 = new ArrayList<>();

        // Programacion imperativa
        System.out.println("Obtener pares estilo conocido"); // 2, 4, 6, 8, 10
        for (int i = 0; i < positivos.size(); i++) { // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            System.out.println(positivos.get(i));
            System.out.println("El numero:" + positivos.get(i) + " es par? " + esPar(positivos.get(i)));
        }

        // Concepto de clases y funciones anonimas
        new Asistencia() {
            private int presente;

            public void asistir() {
                System.out.println("Asistiendo a la clase");
            }
        }.asistir();

        Usuario persona = new Usuario() {
            private int presente;

            public void crearusuario() {
                System.out.println("Creando usuario");

            }

            public void borrar() {
                System.out.println("Biorrando usuario");
            }
        };
        persona.crearusuario();
        persona.borrar();

        // Funciones lambda en Java sin la funcion esPar

        System.out.println("Obtener pares estilo lambda"); // 2, 4, 6, 8, 10
        for (int i = 0; i < positivos.size(); i++) { // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
            System.out.println(positivos.get(i));
            System.out.println("El numero:" + positivos.get(i) + " es par? " + (positivos.get(i) % 2 == 0));

        }
        System.out.println("Obtener pares estilo lambda 2"); // 2, 4, 6, 8, 10
        positivos.forEach((numero) -> {
            if (numero % 2 == 0) {
                pares1.add(numero);
                System.out.println("El numero:" + numero + " es par? " + true);
            }

        });

        // USAR MÁS
        // System.out.println("Obtener pares con operador ternario"); // 2, 4, 6, 8, 10
        // positivos.forEach((numero) -> {
        // pares2.add(numero % 2 == 0 ? numero : 0);
        // });

        // Con funcion
        System.out.println("Obtener pares con funcion"); // 2, 4, 6, 8, 10
        positivos.forEach((numero) -> {
            if (esPar(numero)) {
                pares2.add(numero);
                System.out.println("El numero:" + numero + " es par? " + true);
            }

        });
        System.out.println("Pares 1: " + pares1);
        System.out.println("Pares 2: " + pares2);

        // Funcion anonima programacion funcional
        // .Stream es una secuencia de elementos que se pueden procesar de forma
        // paralela o en serie.
        // .filter es una operación intermedia que devuelve un nuevo Stream que
        // contiene elementos que cumplen el predicado dado.
        // .collect es una operación terminal que recopila los elementos del Stream en
        // una colección.
        pares3 = positivos.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());
        System.out.println("Pares 3: " + pares3);

    }
}
