/*
 * Basilio Torres Dali Leonardo
 * Ejercicio 17. polimorfismo.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 17. Polimorfismo");
        Figura objetoFigura = new Figura(12);
        System.out.println(objetoFigura.toString());
        objetoFigura.incremento();
        System.out.println(objetoFigura.toString());

        Cuadrado objetoCuadrado = new Cuadrado(1.5);
        System.out.println(objetoCuadrado.toString());
        objetoCuadrado.incremento();
        System.out.println(objetoCuadrado.toString());

        objetoCuadrado.perimetro();
        objetoCuadrado.area();

        // *Polimorfismo
        Figura ventana = new Cuadrado(1);
        ventana.perimetro();
        ventana.area();
        System.out.println(ventana.toString());

        Figura pelota = new Circulo(0.25);

        pelota.perimetro();
        pelota.area();
        System.out.println(pelota.toString());

    }
}
