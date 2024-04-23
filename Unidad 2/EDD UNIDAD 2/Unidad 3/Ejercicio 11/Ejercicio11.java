import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        pilas pilas1 = new pilas();
        pilas pilas2 = new pilas();
        pilas pilas3 = new pilas();
        int n, n1, n2, n3, movimientos = 0;
        int op = 0;

        pilas1.insertar(3);
        pilas1.insertar(2);
        pilas1.insertar(1);
        System.out.println("BIENVENIDO AL JUEGO DE LAS TORRES DE HANOI");
        System.out.println("    ┌┐        ┌┐        ╔╗    \r\n" + //
                "   ▓▓▓▓       ││        ║║    \r\n" + //
                "  ▓▓▓▓▓▓      ││        ║║    \r\n" + //
                " ▓▓▓▓▓▓▓▓     ││        ║║    \r\n" + //
                "▓▓▓▓▓▓▓▓▓▓    ││        ║║    \r\n" + //
                "────┴┴────────┴┴────────╨╨────\r\n" + //
                "──FUENTE────AUXILIAR──OBJETIVO──");
        System.out.println("PRESIONE ENTER PARA CONTINUAR");
        lector.nextLine();

        cls();
        do {
            System.out.println("Torres Hanoi");
            System.out.println("Mover discos: ");
            System.out.println("1. pilas 1 a pilas 2");
            System.out.println("2. pilas 1 a pilas 3");
            System.out.println("3. pilas 2 a pilas 3");
            System.out.println("4. pilas 2 a pilas 1");
            System.out.println("5. pilas 3 a pilas 2");
            System.out.println("6. pilas 3 a pilas 1");
            System.out.println("7. Nuevo Juego");
            System.out.println("8. Mostrar torres");
            System.out.println("9. Salir");

            System.out.println("Opcion: ");
            op = lector.nextInt();
            switch (op) {
                case 1:
                    moverpilonas(pilas1, pilas2);
                    movimientos++;

                    break;
                case 2:// 2. pilas 1 a pilas 3
                    moverpilonas(pilas1, pilas3);
                    movimientos++;

                    break;
                case 3: // 3. pilas 2 a pilas 3
                    moverpilonas(pilas2, pilas3);
                    movimientos++;

                    break;
                case 4:// 4. pilas 2 a pilas 1
                    moverpilonas(pilas2, pilas1);
                    movimientos++;

                    break;
                case 5: // 5. pilas 3 a pilas 2
                    moverpilonas(pilas3, pilas2);
                    movimientos++;

                    break;
                case 6: // pilas 3 a pilas 1
                    moverpilonas(pilas3, pilas1);
                    movimientos++;

                    break;
                case 7:

                    System.out.println("Reinicia Juego");
                    pilas1.reiniciar();
                    pilas2.reiniciar();
                    pilas3.reiniciar();

                    pilas1.insertar(3);
                    pilas1.insertar(2);
                    pilas1.insertar(1);
                    movimientos = 0;
                    break;
                case 8:
                    System.out.println("Orden de pilas:");
                    mostrar(pilas1, pilas2, pilas3);

                    break;
                case 9:
                    cls();
                    System.out.println("Adios");
                    System.out.println("Hiciste " + movimientos + " movimientos");
                    break;
                default:
                    break;
            }
            if (pilas1.inicio == null && pilas2.inicio == null) {
                System.out.println("Hiciste " + movimientos + " movimientos");

                ganaste();
                break;
            }
        } while (op != 9);

    }

    public static void moverpilonas(pilas origen, pilas destino) {
        if (!origen.vacia()) {
            if (destino.vacia() || origen.fin.elemento < destino.fin.elemento) {
                destino.insertar(origen.fin.elemento);
                origen.eliminar();
            } else {
                System.out.println("El aro deberia de ser menor");

            }

        }

    }

    public static void mostrar(pilas pilas1, pilas pilas2, pilas pilas3) {
        pilas temp = new pilas();
        System.out.println("pilas 1");
        if (pilas1.vacia()) {
            System.out.println("Pila 1 vacia");
        } else {
            pilas1.mostrar(temp);

        }
        System.out.println("pilas 2");
        if (pilas2.vacia()) {
            System.out.println("Pila 2 vacia");
        } else {
            pilas2.mostrar(temp);
        }
        System.out.println("pilas 3");
        if (pilas3.vacia()) {
            System.out.println("Pila 3 vacia");
        } else {
            pilas3.mostrar(temp);
        }
    }

    public static void ganaste() {
        System.out.println("\r\n" + //
                " ______   ______     __         __     ______     __     _____     ______     _____     ______     ______    \r\n"
                + //
                "/\\  ___\\ /\\  ___\\   /\\ \\       /\\ \\   /\\  ___\\   /\\ \\   /\\  __-.  /\\  __ \\   /\\  __-.  /\\  ___\\   /\\  ___\\   \r\n"
                + //
                "\\ \\  __\\ \\ \\  __\\   \\ \\ \\____  \\ \\ \\  \\ \\ \\____  \\ \\ \\  \\ \\ \\/\\ \\ \\ \\  __ \\  \\ \\ \\/\\ \\ \\ \\  __\\   \\ \\___  \\  \r\n"
                + //
                " \\ \\_\\    \\ \\_____\\  \\ \\_____\\  \\ \\_\\  \\ \\_____\\  \\ \\_\\  \\ \\____-  \\ \\_\\ \\_\\  \\ \\____-  \\ \\_____\\  \\/\\_____\\ \r\n"
                + //
                "  \\/_/     \\/_____/   \\/_____/   \\/_/   \\/_____/   \\/_/   \\/____/   \\/_/\\/_/   \\/____/   \\/_____/   \\/_____/ \r\n"
                + //
                "                                                                                                             \r\n"
                + //
                "");
        System.out.println("Felicidades, ganaste");

    }

    public static void cls() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
