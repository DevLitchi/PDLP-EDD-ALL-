
public class Cuadrado extends Figura {

    Cuadrado(double lado) {
        super(lado); // Heredamos el constructor de la clase padre
    }

    // Sobreescritura
    public void area() {
        System.out.println("Area del cuadrado = " + (lado * lado));
    }

    public void perimetro() {
        System.out.println("Perimetro del cuadrado = " + (lado * 4));
    }

    public String toString() {
        return "Cuadrado [Cuadrado =" + lado + "]";
    }

}
