//* Herencia. Empelado hereda atributos y metodos de persona
public class Empleado extends Persona {
    private String NSS;
    private double sueldo;

    public Empleado() {

    }

    public Empleado(String Online, String Nombre, String Apellido, String NSS, double sueldo) {

        setNombre(Nombre);
        setApellido(Apellido);
        setOnline(Boolean.valueOf(Online)); // Convertir String a boolean
        setNSS(NSS);
        setSueldo(sueldo);
    }
    // * Getters y Setters

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String nSS) {
        NSS = nSS;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void calcular_salario() {
    }

    public void mostrarNomina() {
    }

    // * Metodo toString
    @Override
    public String toString() {
        return "Persona\n" +
                "nombre = " + getNombre() +
                "\napellido = " + getApellido() +
                "Empleado[\n" +
                "NSS = " + NSS +
                "Sueldo = " + sueldo;
    }

}