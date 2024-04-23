package Unidad3.Ejercicio12;

/*
 * Becerra Flores Jose Eduardo
 * Ejercicio12. 21
 * Simular el juego del 21 con una lista doble
 */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio12 {

    public static void main(String[] args) {
        // Limpiar pantalla
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Scanner read = new Scanner(System.in);
        Baraja bj = new Baraja();
        Baraja user = new Baraja();
        Baraja home = new Baraja();
        Boolean terminar = false;
        char SN = 'n';
     
        iniciar(bj); //inicia la baraja
        
        //Cartas para el usuario
        TomarCarta(bj, user);
        TomarCarta(bj, user);
        con21(user);

        //Cartas para la casa
        TomarCarta(bj, home);
        TomarCarta(bj, home);

        con21(home);
        // bj.mostrar();

        System.out.println("---CARTAS DEL USUARIO");
        user.mostrar();
        System.out.println("\n\n---CARTAS DE CASA");
        home.mostrar();

        //Si no gana al inicio
        //Pedir cartas por turnos
        while (!terminar) {
            //Cartas usuario
            do {
                System.out.println("Quieres otra carta?");
                SN = read.nextLine().toUpperCase().charAt(0);
                
                if (SN=='S'){ 
                    TomarCarta(bj, user);
                    user.mostrar();
                }
            } while (SN == 'N');

            SN='S';
            //Cartas casa
            while (home.Sumatoria()<17) {
                TomarCarta(bj,home);
                home.mostrar();   
            }
            System.out.println();
            terminar = true;
        }
        //Validad si el usuario tiene 21
        //Validar si la casa tiene 21

    }


    public static void con21(Baraja elegido) {
        if (elegido.inicio.elemento == 10 && elegido.fin.elemento == 11) {
            System.out.println("GANO EL USUARIO");
        }
    }
    public static void TomarCarta(Baraja central, Baraja elegido)
    {
        elegido.insertar(central.inicio.elemento, central.inicio.str, central.inicio.color);  
        central.eliminar_inicio();  
    }
    public static void iniciar(Baraja bj) {
        String denominacion = "", figura = "";
        String color = "";

        int[] random_num = new int[52];
        barajear(random_num);

        for (int valor_carta : random_num) {

            int cociente = (valor_carta - 1) / 13;
            switch (cociente) {
                case 0:
                    figura = " de espadas ()==[:::::::::>"; 
                    color = "\033[33m";
                    break;
                case 1:
                    figura = " de trebol ಥ_ಥ";
                    color = "\033[32m";  
                    break;
                case 2:
                    figura = " de diamante ----{,_,\">";
                    color = "\033[36m"; 
                    break;
                case 3:
                    figura = " de corazon @}~}~~~";
                    color = "\033[31m"; 
                    break;
            }

            int residuo = valor_carta % 13;
            switch (residuo) {
                case 1:
                    denominacion = "AS " + figura;
                    break;
                case 11:
                    denominacion = "Jota " + figura;
                    break;
                case 12:
                    denominacion = "Rey " + figura;
                    break;
                case 10:
                    denominacion = "Reina " + figura;
                    break;

                default:
                    denominacion = String.valueOf(residuo) + figura;
                    break;
            }
            bj.insertar(valor_carta, denominacion,color);
        }
    }

    public static void barajear(int[] random_num) {

        int aux;
        Random num = new Random(); // Variable que es un objeto random
        boolean num_igual;
        for (int i = 0; i < random_num.length; i++) {
            do {
                // Agregamos un entero aleatorio en el rango de 1 a 20.
                aux = num.nextInt(0, 53);
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
