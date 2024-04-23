
//VA = Validacions de Alumnos
//Metodos y validaciones orientadas solamente para la alta de alumnos y su manejo
import java.util.Scanner;

public class VAlumnos {

    public static String leer() {
        Scanner sc = new Scanner(System.in);
        String dato;
        do {
            System.out.println("Ingrese el nombre del alumno");
            dato = sc.nextLine();
        } while (!Validaciones.validarNombre(dato));
        return "";

    }

    public static String leerNum() {
        Scanner sc = new Scanner(System.in);
        String dato;
        do {
            System.out.println("Ingrese la matricula del alumno");
            dato = sc.nextLine().trim();
        } while (!Validaciones.validarNumeros(dato));

        return "";

    }

}
