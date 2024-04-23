
public class Circulo extends Figura {

    Circulo(double lado) {
        super(lado); // Heredamos el constructor de la clase padre
    }

    // Sobreescritura
    public void area() {
        System.out.println("Area del cuadrado = " + 3.1416 * lado * lado);
    }

    public void perimetro() {
        System.out.println("Perimetro del cuadrado = " + 3.1416 * lado * lado);
    }

    public String toString() {
        return "Cuadrado [Cuadrado =" + lado + "]";
    }

}
