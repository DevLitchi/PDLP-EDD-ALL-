
//Clase sin implementar
//Es como un molde, en la herencia nos encargamos de darle caracteristicas
public class Figura {
    protected double lado;

    Figura(double lado) {
        this.lado = lado;
    }

    public void area() {
    }

    public void perimetro() {
    }

    // Metodo si implementado
    public void incremento() {
        lado++;
    }

    @Override
    public String toString() {
        return "Figura [lado=" + lado + "]";
    }

}
