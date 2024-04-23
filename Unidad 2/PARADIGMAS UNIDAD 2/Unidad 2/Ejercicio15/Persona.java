public class Persona {
    // Atributos por defecto son publicos
    private String nombre; // Los privados no se heredan, tengo que usar el get
    float estatura;
    private boolean online;
    protected int id; // Se heredan

    // constructor = cuando no hay constructor explicito por defecto lo hereda de la
    // clase object
    public Persona() {
        nombre = "noname";
        this.estatura = 1.5f;
    }

    // get, set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona [nombre = " + nombre + ", estatura = " + estatura +
                ", online = " + online + ", id = " + id + "]";
    }

    // La diferencia para usar el this es para referenciar a los atributos de la
    // clase
    // en caso de llamarse igual
    public void incrementa(float estatura) {
        this.estatura += estatura;
    }

}