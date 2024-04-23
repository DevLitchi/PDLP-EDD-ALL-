//Programa que ordena un arreglo de enteros usando el algoritmo de ordenamiento burbuja lo compararemos con el de arboles
//Ejercicio 14
//Basilio Torres Dali Leonardo
//Codigo sacado de internet para el ejemplo

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        int[] array = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 }; // Example array
        // int[] array = { 1,2,3,4,5,6,7,8,9,10 }; // Example array

        bubbleSort(array);

        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        int comparisons = 0; // Variable to keep track of comparisons
        int swaps = 0; // Variable to keep track of swaps

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                comparisons++; // Increment the comparison count

                if (array[j] > array[j + 1]) {
                    swaps++; // Increment the swap count
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Numero de comparaciones: " + comparisons);
        System.out.println("Numero de cambios: " + swaps);
    }
}