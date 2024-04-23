
//Basilio Torres Dali Leonardo
//Ejercicio 9
// 27 de Febrero del 2024
//Ejercicio de prueba de recursividad como repaso
import java.util.Scanner;
import java.util.Random;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 9 recursividad");
        Random num = new Random();
        int aux;
        boolean igual; // Initialize igual to false
        int a[] = new int[15];
        for (int index = 0; index < a.length; index++) {
            do {
                igual = false;
                aux = num.nextInt(16);// Genera un numero aleatorio entre 0 y 9 incluyendo el 0
                System.out.println("buscando" + aux);
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == aux)
                        igual = true;
                }
            } while (igual);
            a[index] = generarNumero(a);
            System.out.println("Asignando " + aux + " a la posicion " + index);
        }
    }

    public static int generarNumero(int[] a) {
        Random num = new Random();
        int aux;
        boolean igual; // Initialize igual to false
        for (int index = 0; index < a.length; index++) {
            aux = num.nextInt(16);// Genera un numero aleatorio entre 0 y 9 incluyendo el 0
            System.out.println("buscando" + aux);
            for (int j = 0; j < a.length; j++) {
                if (a[j] == aux)
                    return generarNumero(a);
            }

            return aux;
        }
        return 0; // Add a return statement here
    }
}