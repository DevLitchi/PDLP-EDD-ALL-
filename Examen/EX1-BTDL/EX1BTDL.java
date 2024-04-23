import java.util.Scanner;

public class EX1BTDL {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese NUMERICAMENTE la cantidad de monedas de 1 peso que tiene: ");
        int monedasdeunpeso = lector.nextInt();
        int total, opcion, cambio, dinerorestante;
        int comprastotales = 0;
        int dinerogastado = 0;

        // Agua de sabor 18
        // Soda 20
        // Agua natural 15
        // Jugo 25
        do {
            System.out.printl    n("INGRESE SOLO NUMEROS ENTEROS");
            System.out.println("Los productos a la venta son: ");
            System.out.println("1.- Agua de sabor $18");
            System.out.println("2.- Soda $20");
            System.out.println("3.- Agua Natural $15");
            System.out.println("4.- Jugo $25");
            System.out.println("5.- Salir");
            System.out.println("Ingrese el número del producto que desea comprar: ");
            opcion = lector.nextInt();

            if (opcion == 1) {
                if (monedasdeunpeso >= 18) {
                    monedasdeunpeso = monedasdeunpeso - 18;
                    System.out.println("Compra realizada, te quedan " + monedasdeunpeso + " pesos");
                    dinerogastado = dinerogastado + 18;
                    comprastotales = comprastotales + 1;
                } else
                    System.out.println("No tienes el dinero suficiente, intenta con otra opcion");

            }

            if (opcion == 2) {
                if (monedasdeunpeso >= 20) {
                    monedasdeunpeso = monedasdeunpeso - 20;
                    System.out.println("Compra realizada, te quedan " + monedasdeunpeso + " pesos");
                    dinerogastado = dinerogastado + 20;
                    comprastotales = comprastotales + 1;
                } else {
                    System.out.println("No tienes el dinero suficiente, intenta con otra opcion");
                }

            }

            if (opcion == 3) {
                if (monedasdeunpeso >= 15) {
                    monedasdeunpeso = monedasdeunpeso - 15;
                    System.out.println("Compra realizada, te quedan " + monedasdeunpeso + " pesos");
                    dinerogastado = dinerogastado + 15;
                    comprastotales = comprastotales + 1;
                } else {
                    System.out.println("No tienes el dinero suficiente, intenta con otra opcion");
                }
            }

            if (opcion == 4) {
                if (monedasdeunpeso >= 25) {
                    monedasdeunpeso = monedasdeunpeso - 25;
                    System.out.println("Compra realizada, te quedan " + monedasdeunpeso + " pesos");
                    dinerogastado = dinerogastado + 25;
                    comprastotales = comprastotales + 1;
                } else {
                    System.out.println("No tienes el dinero suficiente, intenta con otra opcion");
                }
            }
            if (opcion == 5) {
                break;
            }
        } while (monedasdeunpeso >= 15); // O si ya no le alcanza para otro producto
        System.out.println("Te queda " + monedasdeunpeso + " ya no puedes comprar otro articulo.");
        System.out.println("El dinero gastado fue : " + dinerogastado + " pesos");
        System.out.println("Compraste la cantidad de " + comprastotales + " articulos");
    }
}

// valida.funcionx(datoavalidar)