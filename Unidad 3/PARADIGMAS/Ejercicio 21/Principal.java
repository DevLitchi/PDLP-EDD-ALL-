
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        String aux = "";
        Alumno estudiante = new Alumno();
        do {
            MetodosComunes.MENU();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.println("Leer archivo");
                    break;
                case 2:
                    System.out.println("Alta de alumno nuevo");
                    estudiante.setNombre(VAlumnos.leer());
                    estudiante.setMatricula(VAlumnos.leerNum()); // Para que solo se pueda ingresar 7 numeros de
                                                                 // matricula

                    break;
                case 3:
                    System.out.println("Baja alumno");
                    break;
                case 4:
                    System.out.println("Guardar archivo");
                    break;
                case 5:
                    System.out.println("Mostrar alumnos");
                    break;
                case 0:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 0);// Fin del ciclo 0 Salir
    }

}
