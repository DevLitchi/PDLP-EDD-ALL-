import java.util.Scanner;
import java.time.Year;
import java.time.LocalDate;
import java.time.Month;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now(); // Obtiene la fecha actual
        int diaActual = fechaActual.getDayOfMonth(); // Obtiene el día del mes actual
        int mesActual = fechaActual.getMonthValue(); // Obtiene el mes actual
        int yearActual = fechaActual.getYear(); // Obtiene el año actual
        int diasMes = fechaActual.getDayOfYear(); // Obtiene los dias del año actual

        int añosvividos, fechaNacimiento, diasvividos;
        System.out.println("Año de Nacimiento");
        int year1 = lector.nextInt(); // En year 1 se almacena el año del usuario
        if (year1 > yearActual) {
            System.out.println("Año de nacimiento no puede ser mayor al año actual");
            return;

        }
        System.out.println("Mes de Nacimiento");
        int mes = lector.nextInt(); // En mes se almacena el mes del usuario ne formato (1-12)
        if (mes > mesActual) {
            yearActual = yearActual - year1 - 1;
        }
        System.out.println("Dia de Nacimiento");
        int dia = lector.nextInt(); // En dia se almacena su dia de nacimiento

        // Si el mes es mayor al actual o si el mes es igual al actual y el dia es mayor
        // al actual se detiene el programa y se muestra la edad calculando solo la
        // resta del año
        añosvividos = yearActual;
        diasvividos = añosvividos * 365;
        fechaNacimiento = diasvividos + diasMes;

        System.out.println("Dias vividos: " + fechaNacimiento);

        // Agregar los dias vividos caluclando años bisiestos

    }
}