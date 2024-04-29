
//Basilio Torres Dali Leonardo
// Ejercicio 10  calculadora con pilas 
// Programa para simular una calculadora con pilas y mostrar el resultado de la operacion
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Pila operadores = new Pila();
        Pila num = new Pila();
        Pila temp = new Pila();
        String expresion;
        String dato;
        int resul = 0, num1, num2;
        String operador;
        do {
            System.out.println("Ingrese la operacion a realizar: \n Operadores (+,-,*,/) \n Numeros (0-9) \n");
            expresion = new String(lector.nextLine());
        } while (expresion.isEmpty());

        for (int i = 0; i < expresion.length(); i++) {
            dato = expresion.substring(i, i + 1);
            if (dato.equals("+") || dato.equals("-") || dato.equals("*") || dato.equals("/")) {
                operadores.insertar(dato);
            }
        }
        String[] numero = expresion.split("-|\\+|\\*|\\/");
        for (int i = 0; i < numero.length; i++) {
            num.insertar(numero[i]);
        }

        System.out.println("Operadores: ");
        operadores.mostrar();
        System.out.println("Numeros: ");
        num.mostrar();

        while (operadores.fin != null) {
            operador = operadores.fin.elemento;
            num1 = Integer.parseInt(num.fin.elemento);
            num.eliminar();
            num2 = Integer.parseInt(num.fin.elemento);
            num.eliminar();
            switch (operador) {
                case "+":
                    resul = num1 + num2;
                    break;
                case "-":
                    resul = num1 - num2;
                    break;
                case "*":
                    resul = num1 * num2;
                    break;
                case "/":
                    resul = num1 / num2;
                    break;
            }
            num.insertar(String.valueOf(resul));
            operadores.eliminar();

        }
        System.out.println("Resultado: " + resul);

    }
}

// while (operadores.inicio != null) {
// char opcion = operadores.inicio.elemento.charAt(0);
// switch (opcion) {
// case '+':
// int num1 = Integer.parseInt(num.inicio.elemento);
// num.eliminarinicio();
// int num2 = Integer.parseInt(num.inicio.elemento);
// num.eliminarinicio();

// resul = num1 + num2;
// break;
// case '-':
// int num1

// break;
// case '*':
// break;
// case '/':
// break;
// } // fin switch
// // insertar resul en pila numeros
// } // fin while
// // sacar pila numeros el ultimo numero
// // resultado final
// }

// }

// // HACER VALIDACIONES DE NUMEROS Y OPERADORES ARITMETICOS

// // do {
// // System.out.println(" Calculadora");
// // System.out.println("----------------------------");
// // System.out.println("| 1) Insertar |");
// // System.out.println("| 2) Mostrar fila |"); // mostrar fila de final al
// inicio
// // System.err.println("| 3) Eliminar Final |");
// // System.out.println("| 4) Salir |"); // reiniciar fila, inicio y final nulo
// // System.out.println("----------------------------");
// // System.out.println("Seleccione una opcion:");
// // opcion = lector.nextInt();
// // switch (opcion) {
// // case 1:
// // nombre = lector.nextLine();
// // System.out.println("\nCliente: ");
// // nombre = lector.nextLine();
// // filaBanco.insertar(nombre);
// // System.out.println();
// // break;
// // case 2:
// // filaBanco.mostrar();
// // break;
// // case 3:
// // filaBanco.eliminarfinal();
// // break;
// // case 4:
// // System.out.println("Adios");
// // break;
// // default:
// // System.out.println("Opcion no valida");
// // break;

// // }
// // } while (opcion != 4);
// // }
