public class EmpHr extends Empleado {
    private double Shr;
    private double Hdtrabajo;

    public EmpHr(String NSS, double Sueldo, String nombre, String apellido, boolean online,
            double Shr) {
        super();
        this.Shr = Shr;
        this.Hdtrabajo = 0;

    }

    public double getShr() {
        return Shr;
    }

    public void setShr(double shr) {
        Shr = shr;
    }

    public double getHdtrabajo() {
        return Hdtrabajo;
    }

    public void setHdtrabajo(double hdtrabajo) {
        Hdtrabajo = hdtrabajo;
    }

    public void calcularsalario() { // Sueldo diario
        setSueldo(Shr * Hdtrabajo);
    }

    public void mostrarnomina() {
        System.out.println("Noimina de empleado x hora:");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("NSS: " + getNSS());
        System.out.println("Sueldo total: " + getSueldo());
    }
}
