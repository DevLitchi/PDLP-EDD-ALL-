import java.util.Scanner;

public class valida {

    public static boolean onlystr(String dato) {
        dato = dato.toLowerCase();
        return dato.matches("[a-zA-Z]+");
    }

    public static boolean paisyciudad(String dato) {
        dato = dato.toLowerCase();
        return dato.matches("[a-zA-Z  ]+");
    }

    public static boolean onlynum(String dato) {
        return dato.matches("[0-9]{10}");
    }

    public static boolean validaEmail(String email) {
        return email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
    }

    public static boolean numeroyletrasconespacios(String dato) {
        return dato.matches("[a-zA-Z0-9 -]+");
    }

    public static boolean cp5digitos(String dato) {
        return dato.matches("[0-9 ]{5}");
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