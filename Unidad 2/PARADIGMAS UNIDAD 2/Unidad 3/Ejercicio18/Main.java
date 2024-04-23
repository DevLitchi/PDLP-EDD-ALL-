/*
 * Basilio Torres Dali Leonardo
 * Ejercicio 18. Polimorfismo.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 17. Polimorfismo");
        // Figura objetoFigura = new Figura(12); //!SIN INSTANCIA PORQUE ES ABSTRACTO
        // System.out.println(objetoFigura.toString());
        // objetoFigura.incremento();
        // System.out.println(objetoFigura.toString());

        System.out.println("\n\nObjeto con herencia");
        Cuadrado objetoCuadrado = new Cuadrado(1.5);
        System.out.println(objetoCuadrado.toString()); // Como quitamos el toString de la clase cuadrdo, toma el de la
                                                       // clase padre
        objetoCuadrado.incremento();
        System.out.println(objetoCuadrado.toString());

        objetoCuadrado.perimetro();
        objetoCuadrado.area();
        objetoCuadrado.porcentaje(50.12); // Porcentaje double
        objetoCuadrado.porcentaje(50); // Porcentaje entero

        // *Polimorfismo
        Figura ventana = new Cuadrado(1);
        ventana.perimetro();
        ventana.area();
        System.out.println(ventana.toString()); // Como quitamos el toString de la clase cuadrdo, toma el de la clase
                                                // padre
        ventana.porcentaje(50);

        Figura pelota = new Circulo(0.25);

        pelota.perimetro();
        pelota.area();
        System.out.println(pelota.toString()); // El Circulo tiene toString propio, por lo que no toma el del padre

    }
}
