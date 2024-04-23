import java.util.Scanner;

public class Vocalesycadenas {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Vocales en una palabra");
        String palabra;
        System.out.print("Escribe una palabra:");
        palabra = lector.next();
        palabra = palabra.toLowerCase();
        char[] chars = palabra.toCharArray();
        int cant = chars.length;
        int cont = 0;

        for (int i = 0; i < cant; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u')
                cont++;

        }

        lector.close();
        System.out.println("Total de vocales:\n" + cont);
    }
}