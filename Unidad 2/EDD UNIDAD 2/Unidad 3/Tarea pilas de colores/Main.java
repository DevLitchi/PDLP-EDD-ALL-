
//Basilio Torres Dali Leonardo
// Ejercicio 8  de Pilas/pilas en las Pilas solo se agregan usuarios al final no hay en medio ni principio
// Programa para simular una fila de un banco con listas enlazadas y mostrar el turno de cada cliente
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pila filaBanco = new Pila();
        Scanner lector = new Scanner(System.in);
        Nodo alumno = new Nodo();
        alumno.sig = null;
        String nombre, nombre2, nombre3, nombre4, nombre5, nombre6, nombre7;
        int opcion = 0;
        do {
            System.out.println("           Menu");
            System.out.println("----------------------------");
            System.out.println("| 1) Insertar              |");
            System.out.println("| 2) Mostrar fila          |"); // mostrar fila de final al inicio
            System.err.println("| 3) Eliminar Final        |");
            System.out.println("| 4) Salir                 |"); // reiniciar fila, inicio y final nulo
            System.out.println("----------------------------");
            System.out.println("Seleccione una opcion:");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    nombre = lector.nextLine();
                    System.out.println("\n Color: ");
                    nombre = lector.nextLine();
                    filaBanco.insertar(nombre);
                    System.out.println();
                    break;
                case 2:
                    filaBanco.mostrar();
                    break;
                case 3:
                    filaBanco.eliminarfinal();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        } while (opcion != 4);
    }
}