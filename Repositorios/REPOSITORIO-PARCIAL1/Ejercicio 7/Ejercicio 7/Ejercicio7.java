import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio7 {
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
            System.out.println("Calle: ");
            calle = valida.leeString();
        } while (valida.numeroyletrasconespacios(calle) == false);

        do {
            System.out.println("Colonia: ");
            coloniaString = valida.leeString();
        } while (valida.numeroyletrasconespacios(coloniaString) == false);

        do {
            System.out.println("Ciudad: ");
            ciudad = valida.leeString();
        } while (valida.paisyciudad(ciudad) == false);

        do {
            System.out.println("Pais: ");
            pais = valida.leeString();
        } while (valida.paisyciudad(pais) == false);

        do {
            System.out.println("Codigo Postal: ");
            cp = valida.leeString();
        } while (valida.cp5digitos(cp) == false);

        do {
            System.out.println("Telefono: ");
            tel = valida.leeString();
        } while (valida.onlynum(tel) == false);

        do {
            System.out.println("Email: ");
            email = valida.leeString();
        } while (valida.validaEmail(email) == false);
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("Registro Completado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + paterno);
        System.out.println("Apellido Materno: " + materno);
        System.out.println("Pais: " + pais);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Colonia: " + coloniaString);
        System.out.println("Calle: " + calle);
        System.out.println("Codigo Postal: " + cp);
        System.out.println("Telefono: " + tel);
        System.out.println("Email: " + email);

    }
}