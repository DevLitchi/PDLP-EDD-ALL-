public class EmpCnt extends Empleado {
    private double Sfijo;
    private double plazos;

    public EmpCnt(String NSS, double Sueldo, String nombre, String apellido, boolean online,
            double Sfijo, int plazos) { 
        super();
        this.Sfijo = Sfijo;
        this.plazos = 0;

    }

    public double Sfijo() {
        return Sfijo;
    }

    public void Sfijo(double Sfijo) {
        Sfijo = Sfijo;
    }

    public double getplazos() {
        return plazos;
    }

    public void setplazos(double plazos) {
        plazos = plazos;
    }

    public void calcularsalario() { // Sueldo diario
        setSueldo(Sfijo / plazos);
    }

    public void mostrarnomina() {
        System.out.println("Noimina de empleo por Contrato:");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("NSS: " + getNSS());
        System.out.println("Sueldo por plazo: " + getSueldo());
        System.out.println("Pago total: " + Sfijo);

    }
}
