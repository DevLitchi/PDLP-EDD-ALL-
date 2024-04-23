public class Persona {

    // Atributos (por defecto son publicos)
    private String nombre;
    private String apellido;
    private boolean online;
    // protected int id;

    // Constructor
    public Persona() {
        this.online = true;
    }

    // Geeters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
    // public int getId() {
    // return id;
    // }
    // public void setId(int id) {
    // this.id = id;
    // }

    // Otros métodos
    // @Override
    // public String toString() {
    // return "[nombre=" + nombre +
    // "\napellido=" + apellido +
    // "\nonline=" + online +
    // "\nid=" + id + "]";
    // }
}