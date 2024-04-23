import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("CONSULTE SU RFC\n\n ");
        String nombre, paterno, materno, dnac, ydnac, estado, pais, cp, tel, email, Bornmonth;
        String mnac, anac, iniciales, rfc, homoclave, nacimiento;

        do {
            System.out.println("Primer nombre:  ");
            nombre = lector.nextLine();
            nombre = nombre.trim().toUpperCase();
        } while (valida.onlystr(nombre) == false);

        do {
            System.out.println("Apellido paterno: ");
            paterno = lector.nextLine();
            paterno = paterno.trim().toUpperCase();
        } while (valida.onlystr(paterno) == false);

        do {
            System.out.println("Apellido materno: ");
            materno = valida.leeString();
            materno = materno.trim().toUpperCase();
        } while (valida.onlystr(materno) == false);

        do {
            System.out.println("Dia de nacimiento : (DD) ");
            dnac = valida.leeString();
        } while (valida.diadelmes(dnac) == false);

        do {
            System.out.println("Mes de nacimiento : (MM) ");
            Bornmonth = valida.leeString();
        } while (valida.mesdelaño(Bornmonth) == false);

        do {
            System.out.println("Año de nacimiento : (AAAA) ");
            ydnac = valida.leeString();
        } while (valida.yearborn(ydnac) == false);

        iniciales = paterno.substring(0, 2) + materno.substring(0, 1) + nombre.substring(0, 1);
        nacimiento = ydnac.substring(2, 4) + Bornmonth + dnac;
        homoclave = paterno.substring(2, 3) + materno.substring(2, 3) + dnac.substring(1, 2);
        rfc = iniciales + nacimiento + homoclave;
        System.out.println("RFC: " + rfc);
    }
}