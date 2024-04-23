import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Crear cuenta de ahorro");
            System.out.println("2. Crear cuenta de plazo");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Crear cuenta de ahorro
                    System.out.println("Creando cuenta de ahorro...");
                    System.out.print("Ingrese el número de tarjeta de crédito: ");
                    String numTarjetaCredito = scanner.next();
                    CuentaAhorro cuentaAhorro = new CuentaAhorro(100, "AHORRO-001", "Titular Ahorro", "01/01/2024",
                            0.02,
                            numTarjetaCredito);
                    System.out.println("Saldo actual: " + cuentaAhorro.getSaldo());
                    double interesAhorro = cuentaAhorro.calcularinteres(cuentaAhorro.getSaldo());
                    System.out.println("Saldo con intereses: " + (cuentaAhorro.getSaldo() + interesAhorro));
                    System.out.println("Intereses generados: " + interesAhorro);
                    System.out.println("Cuenta de ahorro creada exitosamente.");
                    break;
                case 2:
                    // Crear cuenta de plazo
                    System.out.println("Creando cuenta de plazo...");
                    System.out.print("Ingrese el número de años para el plazo: ");
                    int numAños = scanner.nextInt();
                    CuentaPlazo cuentaPlazo = new CuentaPlazo(100, "PLAZO-001", "Titular Plazo", "01/01/2024", 0.05,
                            numAños);
                    System.out.println("Plazo establecido: " + cuentaPlazo.getNumAños() + " años");
                    System.out.println("Saldo actual: " + cuentaPlazo.getSaldo());
                    System.out.println("Saldo con intereses: "
                            + (cuentaPlazo.getSaldo() + cuentaPlazo.calcularinteres(cuentaPlazo.getSaldo())));
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (option != 3);

        scanner.close();
    }
}
