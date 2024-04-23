
//Clase sin implementar
//Es como un molde, en la herencia nos encargamos de darle caracteristicas
//En una clase abstracta no puedo hacer una instancia
public abstract class Figura {
    protected double lado;

    Figura(double lado) {
        this.lado = lado;
    }

    public void area() {
    }

    public void perimetro() {
    }

    public void porcentaje(double porc) {
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
