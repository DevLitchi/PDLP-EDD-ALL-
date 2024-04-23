public class Puesto {
    private int salario;
    private String descripcion;

    public Puesto(int salario, String descripcion) {
        this.salario = salario;
        this.descripcion = descripcion;
    }

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

    @Override
    public String toString() {
        return "Puesto [salario = " + salario + ", descripcion = " + descripcion + "]";
    }

}