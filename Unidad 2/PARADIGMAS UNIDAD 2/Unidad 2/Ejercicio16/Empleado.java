public class Empleado extends Persona { // Herencia (agregacion o composicion?)

    // Atributos
    private String NSS;
    Puesto actividad; // Relacion

    // Setters y Getters
    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public void setActividad(Puesto actividad) {
        this.actividad = actividad;
    }

    // Otros métodos
    @Override
    public String toString() {
        return "Persona[\n" +
                "nombre = " + getNombre() +
                "\napellido = " + getApellido() +
                "\nonline = " + isOnline() + "]\n" +
                "Empleado[\n" +
                "NSS = " + NSS +
                "\nactividad = " + actividad + "]";
    }

}