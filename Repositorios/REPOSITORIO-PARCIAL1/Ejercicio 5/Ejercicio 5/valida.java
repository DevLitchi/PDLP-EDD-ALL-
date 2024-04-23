import java.util.Scanner;
import java.time.Year;

public class valida {

    public static boolean onlystr(String dato) {
        dato = dato.toLowerCase();
        return dato.matches("[a-zA-Z]+");
    }

    public static boolean diadelmes(String dato) {
        dato = dato.toLowerCase();
        return dato.matches("[0-9]{2}");
    }

    public static boolean mesdelaño(String dato) {
        return dato.matches("[0-9]{2}");
    }

    public static boolean yearborn(String dato) {
        String yearPattern = "^(19[0-9]{2}|200[0-9]|20[01][0-" + (Year.now().getValue() - 2000) + "])$";
        return dato.matches(yearPattern);
    }

    public static boolean strvacio(String dato) {
        if (dato == "")
            return true;
        else
            return false;
    }

    public static String leeString() {
        Scanner lector = new Scanner(System.in);
        String dato;
        do {
            dato = lector.nextLine();
        } while (valida.strvacio(dato) == true);
        return dato;
    }
}

// public static void saludo() {
// System.out.println("hola mundo");
// }

// // validar los numeros
// public static boolean num(String dato) { // valida que sea entero
// int num = 0;
// try {
// num = Integer.parseInt(dato);
// return true;
// } catch (

// Exception e) {
// System.out.println(" Error ingrese un ENTERO " + e.getMessage());
// return false;
// }
// }

// public static boolean numPosit(String dato) { // valida que sea entero
// int num = 0;
// try {
// num = Integer.parseInt(dato);
// if (num > 0)
// return true;
// else
// return false;

// } catch (Exception e) {
// System.out.println(" Error ingrese un ENTERO " + e.getMessage());
// return false;
// }
// }

// public static boolean numNeg(String dato) { // valida que sea entero
// int num = 0;
// try {
// num = Integer.parseInt(dato);
// if (num < 0)
// return true;
// else
// return false;

// } catch (

// Exception e) {
// System.out.println(" Error ingrese un ENTERO " + e.getMessage());
// return false;
// }
// }

// public static boolean Rngmnth(int num, int liminf, int limsup) {
// if (num >= liminf && num <= limsup) {
// return true;
// } else {
// return false;
// }

// }

// public static boolean Rngdy(int num, int liminf, int limsup) {
// if (num >= liminf && num <= limsup) {
// return true;
// } else {
// return false;
// }
// }

// public static boolean Rngyr(int num, int liminf, int limsup) {
// if (num >= liminf && num <= limsup) {
// return true;
// } else {
// return false;
// }

// }