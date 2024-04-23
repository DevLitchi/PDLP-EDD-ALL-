
//Basilio Torres Dali Leonardo
//Ejercicio 8
// 27 de Febrero del 2024
//Ejercicio de prueba de recursividad como repaso sobre un ejercicio de factorial
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 8 Factorial");
        int num = 4;
        int factorial = 1;
        for (int index = 1; index <= num; index++) {
            factorial = factorial * index;
            System.out.println("Factorial: " + factorial);
        }
        System.out.println("Prueba recursividad");
        System.out.println("Factorial con recursividad: " + Factorial(num));
    }
    
    // Con recursividad
    public static int Factorial(int n) {
        // Condicion de aborto
        if (n < 0)
            return 0;
        if (n == 0 || n == 1)
            return 1;
        else
            return n * Factorial(n - 1);
    }
}