package Ejercicio14; //Funciones de la clase Metodos.java

// paso de parametros por valor, envia una copia del valor y pasa por referencia, enviando la direccion de moemoria de la varuables
//Basicamente accede a la memoria y modifica el valor

public class Main {
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;
        cambiar(num, num);
        System.out.println(num);
        num = modificar(num);
        System.out.println(num);
        modificardo(num, num2);
        System.out.println(modificardo(num, num2));
        int[] num3 = new int[1];
        num3[0] = 15;
        modificarArray(num3);

        System.out.println("Valor en array " + num3[0]);
    }

    public static void modificarArray(int[] abc) {
        abc[0] *= 10;
    }

    public static void cambiar(int x, int num) {
        System.out.println("El valor de x es: " + x);
        num = 10;
        System.out.println("El valor de num es: " + num);
    }

    public static int modificardo(int abc, int def) {
        int[] array = new int[2];
        array[0] = abc * 2;
        array[1] = def * 2;
        return array[0] + array[1];
    }

    public static int modificar(int abc) {
        abc = 10;
        return abc;
    }
}
