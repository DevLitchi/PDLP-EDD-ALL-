import java.util.Random;

public class Main {

    static Runtime runtime = Runtime.getRuntime();

    public static int invertir(int numero) {
        int resto = 0, invertido = 0;
        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }
        System.out.println(
                "Memoria usada en el invertir sin recursion: " + (runtime.totalMemory() - runtime.freeMemory()));
        return invertido;
    }

    // Invertir con recursividad de la profe
    public static int invertirProfe(int n, int invertido) {
        if (n == 0) {
            System.out.println("Memoria usada con recursion: " + (runtime.totalMemory() - runtime.freeMemory()));
            return invertido;
        } else {
            int resto = n % 10;
            System.out.println("Memoria usada con recursion: " + (runtime.totalMemory() - runtime.freeMemory()));
            return invertirProfe(n /= 10, invertido * 10 + resto);
        }
    }

    public static void main(String args[]) {
        System.out.println("Creacion de objetos");

        // int dataSize = 1024 * 1024;
        // System.out.println ("Memoria máxima: " + runtime.maxMemory() / dataSize +
        // "MB");
        // System.out.println ("Memoria total: " + runtime.totalMemory() / dataSize +
        // "MB");
        // System.out.println ("Memoria libre: " + runtime.freeMemory() / dataSize +
        // "MB");
        // System.out.println ("Memoria usada: " + (runtime.totalMemory() -
        // runtime.freeMemory()) / dataSize + "MB");

        Random num = new Random();
        int aux = 0;
        int[] a = new int[5];
        for (int index = 0; index < a.length; index++) {
            invertir(123);
            invertirProfe(123, 0);
            Prueba p = new Prueba();
            System.out.println("Memoria usada al finalizar: " + (runtime.totalMemory() - runtime.freeMemory()));
            p.valor = 9223372036854775807L;
            p.rellenar(p.valor);
            boolean igual;
            do {
                aux = num.nextInt(16);
                igual = false;
                for (int j = 0; j < a.length; j++) {
                    if (a[j] == aux)
                        igual = true;
                }
            } while (igual);
            a[index] = aux;

        } // for
    }
}