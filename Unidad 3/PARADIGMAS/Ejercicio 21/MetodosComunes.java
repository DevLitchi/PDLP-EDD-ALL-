//Metodos estaticos del ejercicio 21
public class MetodosComunes {
    public static void MENU() {
        // REPASO PARCIAL 2
        System.out.println("BIENVENDIO AL SISTEMA DE ALUMNOS");
        System.out.println("1.- Leer archivo");
        System.out.println("2.- Alta alumno");
        System.out.println("3.- Baja alumno");
        System.out.println("5.- Mostrar alumnos");
        System.out.println("4.- Guardar archivo");
        System.out.println("0.- Salir");

    }

    public static void Lp() { // Limpiar pantalla
        // Clean the screen
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

}
