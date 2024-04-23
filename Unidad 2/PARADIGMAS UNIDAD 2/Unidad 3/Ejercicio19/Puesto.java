public class Puesto {

    // Atributos
    private int salario;
    private String descripcion;

    // Constructores
    public Puesto() {
        this.salario = 0;
        this.descripcion = "";
    }

    public Puesto(String descripcion, int salario) {
        this.salario = salario;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Otros métodos
    @Override
    public String toString() {
        return "[descripcion = " + descripcion + ", salario = $" + salario + "]";
    }

    public String getNombre() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
    }
}