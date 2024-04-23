public class Practica15 {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Como llama a un objeto de la clase
        System.out.println("Constructor");
        Persona p = new Persona();
        System.out.println(p.toString());

        p.estatura = 1.72f;
        // p.nombre = "Juan";
        p.setNombre("Oscar");
        p.setId(786);
        System.out.println("Ejercicio 15: ");
        System.out.println(p.toString());

        System.out.println("Guardia");
        Empleado guardia = new Empleado();
        System.out.println(guardia.toString());

        System.out.println("Puesto");
        Puesto secretario = new Puesto(2800, "Secretario");
        System.out.println(secretario.toString());

    }

}