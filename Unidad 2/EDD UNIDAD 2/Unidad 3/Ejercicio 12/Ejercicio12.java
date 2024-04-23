
import java.util.Random;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        // Limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner read = new Scanner(System.in);
        Baraja bj = new Baraja();
        String denominacion;
        int[] random_num = new int[52];
        barajear(random_num);

        for (int valor_carta : random_num) {
            if (valor_carta <= 13) {
                denominacion = "espadas";
                switch (valor_carta) {
                    case 1:

                        break;
                    case 13:
                        denominacion = "espadas";
                        System.out.println(denominacion);
                        break;
                    default:
                        break;
                }
            }
            bj.insertar(valor_carta);
        }
        bj.mostrar();
        // String op=""; // Variable que se usara para leer las opciones del menu
        // String nombre; // Variable donde se introducira el nombre de la persona que
        // queremos agregar a fila
        // // System.out.println("Probar una lista");
        // Baraja filaBanco = new Baraja(); //Creamos un objeto lista
        // // System.out.println(filaBanco.inicio);

        // do {
        // System.out.println("--------------------------------");
        // System.out.println("1.Ingresar nombre a la fila\n2.Imprimir la
        // fila.\n3.Borrar nombre de la lista\n4.Borrar final\n5.Reiniciar lista");
        // System.out.print("6.Imprimir lista de abajo hacia arriba.\n7.Borrar nombre
        // del medio\n9.Salir.\nOpcion: ");
        // op = read.nextLine();
        // System.out.println("--------------------------------");
        // switch (op) {
        // case "1":

        // System.out.print("Ingresa el nombre del cliente: ");
        // nombre = read.nextLine();
        // filaBanco.insertar(nombre);
        // break;

        // case "2":
        // if (filaBanco.vacia()==true) {
        // System.out.println("Tu lista esta vacia");
        // }
        // else{
        // filaBanco.mostrar();
        // }
        // break;

        // case "3":
        // if (filaBanco.vacia()!=true) {
        // System.out.println("Eliminaste a: "+filaBanco.inicio.elemento);

        // filaBanco.eliminar_inicio(); //Metodo para eliminar el primer sujeto de
        // nuestra fila
        // }
        // else
        // {
        // System.out.println("Lista vacia");
        // }
        // break;
        // case "4":
        // System.out.println("Eliminando a: "+filaBanco.fin.elemento);
        // filaBanco.eliminar_final();

        // break;

        // case "5":
        // System.out.println("Reiniciando lista...");
        // filaBanco.reiniciarLista();

        // break;
        // case "6":
        // if (filaBanco.vacia()==true) {
        // System.out.println("Tu lista esta vacia");
        // }
        // else{
        // filaBanco.mostrar_fin();
        // }

        // break;
        // case "7":
        // if(filaBanco.vacia())
        // {
        // System.out.println("No hay usuarios para eliminar del registro.");
        // }
        // else{
        // System.out.print("Ingrese el nombre de la persona que quiere eliminar: ");
        // nombre = read.nextLine();
        // filaBanco.eliminar_medio(nombre);

        // System.out.println("Usuario Borrado exitosamente.");
        // }
        // break;

        // case "9":
        // break;
        // default:
        // System.out.println("Elegiste mal.");
        // break;
        // }
        // } while (!op.equals("9"));
    }

    public static void barajear(int[] random_num) {

        int aux;
        Random num = new Random(); // Variable que es un objeto random
        boolean num_igual;
        for (int i = 0; i < random_num.length; i++) {
            do {
                // Agregamos un entero aleatorio en el rango de 1 a 20.
                aux = num.nextInt(52);
                num_igual = false;
                for (int j = 0; j < random_num.length; j++) {
                    // Si encontramos que el numero se repite en alguna posicion del arreglo
                    if (random_num[j] == aux) {
                        num_igual = true; // Igualamos a true para
                    }
                }
            } while (num_igual == true);
            random_num[i] = aux; // Si salimos del for, significa que ese numero no se repite
                                 // Entonces lo agregamos al arreglo.
        }
    }
}
