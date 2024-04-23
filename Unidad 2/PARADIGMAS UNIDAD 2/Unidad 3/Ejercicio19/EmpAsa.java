public class EmpAsa extends Empleado {
    private double sueldoDiario;

    public EmpAsa(String NSS, double Sueldo, String nombre, String apellido, boolean online,
            double sueldoDiario) {
        this.sueldoDiario = sueldoDiario;

    }

    public void calcularsalario() { // Sueldo diario
        setSueldo(sueldoDiario * 7);
    }

    public void mostrarnomina() {
        System.out.println("Noimina de empleado asalariado:");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("NSS: " + getNSS());
        System.out.println("Sueldo Semanal: " + getSueldo());
    }
}
