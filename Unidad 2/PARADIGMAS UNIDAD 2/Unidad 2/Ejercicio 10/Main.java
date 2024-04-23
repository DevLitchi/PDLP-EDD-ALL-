
//import java.util.Scanner;
//Basilio Torres Dali Leonardo
//Ejercicio 10
//Recursividad para division de numeros y invertir un numero
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            // Scanner leer = new Scanner(System.in);
            int numero = 0;
            int invertido = 0;
            System.out.println("ejercicio 10 recursividad resueltos");
            System.out.println("Division De enteros");
            System.out.println("10/2 = " + division(10, 2));
            System.out.println("Invertir un numero");
            System.out.println("Introduce un número: ");
            System.out.println("El número invertido es: ");
            Scanner leer = new Scanner(System.in);
            numero = leer.nextInt();

            System.out.println(invertir(numero, invertido));

        } while (true);
    }

    public static int division(int a, int b) {
        {
            if (b > a)
                return 0;
            else
                return division(a - b, b) + 1;
        }
    }

    public static int invertir(int numero, int invertido) {
        if (numero == 0)
            return invertido;
        else
            return invertir(numero / 10, invertido * 10 + numero % 10);

    }
}

// recursividad para invertir un numero
