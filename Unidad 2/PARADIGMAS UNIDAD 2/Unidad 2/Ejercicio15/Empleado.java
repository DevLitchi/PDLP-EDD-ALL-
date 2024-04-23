public class Empleado extends Persona {

    private String NSS;
    private Puesto actividad;

    @Override
    public String toString() {
        return "Persona [nombre = " + getNombre() + ", estatura = " + estatura +
                ", online = " + isOnline() + ", id = " + id + ", NSS = " + NSS + "]";
    }

}