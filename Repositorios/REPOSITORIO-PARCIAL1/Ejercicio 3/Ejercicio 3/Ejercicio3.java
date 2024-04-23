import java.util.Scanner;
import java.time.Year;
import java.time.LocalDate;
import java.time.Month;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual
        int diaActual = fechaActual.getDayOfMonth(); // Obtiene el día del mes actual
        int mesActual = fechaActual.getMonthValue(); // Obtiene el mes actual
        int yearActual = fechaActual.getYear(); // Obtiene el año actual

        System.out.println("Año de Nacimiento");
        int year1 = lector.nextInt(); // En year 1 se almacena el año del usuario
        if (year1 > yearActual) {
            System.out.println("Año de nacimiento no puede ser mayor al año actual");
            return;

        }
        System.out.println("Mes de Nacimiento");
        int mes = lector.nextInt(); // En mes se almacena el mes del usuario ne formato (1-12)
        if (mes > mesActual) {
            System.out.println("Tu edad es : " + (yearActual - year1 - 1) + " años");
            return;

        }
        System.out.println("Dia de Nacimiento");
        int dia = lector.nextInt(); // En dia se almacena su dia de nacimiento
        if (year1 > yearActual) {
            System.out.println("Año de nacimiento no puede ser mayor al año actual");
            return;

        }
        // Si el mes es mayor al actual o si el mes es igual al actual y el dia es mayor
        // al actual se detiene el programa y se muestra la edad calculando solo la
        // resta del año

        int diferyear = (yearActual - year1);
        int age = diferyear;

        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
            age--;
        }

        System.out.println("Tu edad es: " + age + " años");
        // Agregar los dias vividos caluclando años bisiestos

    }
}