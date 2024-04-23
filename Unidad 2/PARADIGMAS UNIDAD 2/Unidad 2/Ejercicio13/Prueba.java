public class Prueba {
    public long valor;
    public String dato;

    public void rellenar(long n) {
        for (int index = 0; index < n; index++) {
            this.dato += String.valueOf(index);
        }

    }
}
