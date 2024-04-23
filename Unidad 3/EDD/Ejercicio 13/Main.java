import java.util.Scanner;
import java.util.Random;

class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String op;
        int num, qty;
        int opc;

        System.out.println("Ejercicios ");
        Tree nums = new Tree();
        do {
            MN();
            op = read.nextLine();
            opc = Integer.parseInt(op);
            switch (opc) {
                case 1:
                    nums.CD();

                    System.out.println("Insertar");
                    num = Integer.parseInt(read.nextLine());
                    nums.I(num);
                    break;
                case 2:
                    nums.CD();

                    System.out.println("Mostrar preorden");
                    nums.MT(nums.Root);
                    System.out.println("\nMostrar preorden invertido");
                    nums.preordeninvertido(nums.Root);
                    break;
                case 3:
                    nums.CD();

                    System.out.println("Mostrar inorden");
                    nums.Stio(nums.Root);
                    System.out.println("\nMostrar inorden invertido");
                    nums.inordeninvertido(nums.Root);
                    break;
                case 4:
                    nums.CD();

                    System.out.println("Mostrar postorden");
                    nums.Stpo(nums.Root);
                    System.out.println("\nMostrar postorden invertido");
                    nums.postordeninvertido(nums.Root);
                    break;
                case 5:
                    nums.CD();

                    System.out.println("Borrar Elemento");
                    num = Integer.parseInt(read.nextLine());
                    nums.DE(num);
                    System.out.println("El elemento " + num + " ha sido eliminado");
                    break;
                case 6:
                    System.out.println("Eliminasr Arbol");
                    nums.DT();
                    break;
                case 7:
                    nums.CD();

                    System.out.println("Inserta el elemento a buscar");
                    num = Integer.parseInt(read.nextLine());
                    nums.BE(num);
                    System.out.println("El elemento " + num + " ha sido encontrado");

                    break;
                case 8:
                    nums.CD();
                    System.out.println("Contar niveles");
                    System.out.println("Niveles: " + nums.CN(nums.Root));

                    break;
                case 9:
                    nums.DT();
                    System.out.println("Insertar Elementos aleatorios");
                    System.out.println("Cuantos elementos desea insertar?");

                    qty = Integer.parseInt(read.nextLine());
                    nums.EA(qty);
                    nums.CD();
                    break;

                case 0:
                    nums.CD();
                    // Centrar el texto
                    System.out.println("----- Gracias por usar el programa ------");

                    // nums.creditos();

                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opc != 0);
    }

    public static void MN() {
        System.out.println("\n---ARBOLES BINARIOS---");
        System.out.println("1 - Insertar");
        System.out.println("2 - Mostrar en preorden y preorden invertido");
        System.out.println("3 - Mostrar en inorden y inorden invertido");
        System.out.println("4 - Mostrar en postorden y postorden invertido");
        System.out.println("5 - Eliminar elemento");
        System.out.println("6 - Reiniciar arbol");
        System.out.println("7 - Buscar elemento");
        System.out.println("8 - Contar niveles");
        System.out.println("9 - Elementos aleatorios");
        System.out.println("0 - Salir");
    }
}
// Contar niveles y encontrar elementos