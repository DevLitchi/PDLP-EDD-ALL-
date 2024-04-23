import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ejercicio 6 Validaciones");
        String nombre, paterno, materno, calle, ciudad, estado, pais, cp, tel, email, coloniaString;
        String mnac, dnac, anac, iniciales, rfc, homoclave;

        do {
            System.out.println("Primer nombre:  ");
            nombre = lector.nextLine();
        } while (valida.onlystr(nombre) == false);

        do {
            System.out.println("Apellido paterno: ");
            paterno = lector.nextLine();
        } while (valida.onlystr(paterno) == false);

        do {
            System.out.println("Apellido materno: ");
            materno = valida.leeString();
        } while (valida.onlystr(materno) == false);

        do {
            System.out.println("INGRESE LOS DATOS EN EL FORMATO ESTABLECIDO (Ejemplo: 12/05/2001)");
            System.out.println("Fecha de nacimiento (dd/mm/aaaa): ");
            String fecha = lector.nextLine();
            String[] fechaArray = fecha.split("/");
            dnac = fechaArray[0];
            mnac = fechaArray[1];
            anac = fechaArray[2];
        } while (valida.validaFecha(dnac, mnac, anac) == false);

        System.out.println("Registro Completado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + paterno);
        System.out.println("Apellido Materno: " + materno);
        System.out.println("Fecha de nacimiento: " + dnac + "/" + mnac + "/" + anac);
    }
}
