class Cola {
    public Nodo inicio;
    public Nodo fin;
    public Nodo aux;
    public int opcion;

    public Cola() {
        inicio = null;
        fin = null;
    }

    class Nodo {
        String elemento;
        Nodo sig;
        Nodo ant; // Add the missing 'ant' field
    }

    public void insertar(String nombre) {
        Nodo nuevo = new Nodo();
        nuevo.elemento = nombre;
        nuevo.sig = null;
        nuevo.ant = null; // Initialize the 'ant' field
        if (inicio == null) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.sig = nuevo;
            nuevo.ant = fin; // Set the 'ant' field of the new node
            fin = nuevo;
        }
    }

    public void mostrar() {
        Nodo recorrer = inicio;
        int i = 0;
        if (inicio == null) {
            System.out.println("No hay elementos en la fila");
        } else {

            while (recorrer != null) {
                i++;
                System.out.println("Tu turno es " + i + " en la fila " + recorrer.elemento);
                recorrer = recorrer.sig;
            }
        }

    }

    public void eliminar() {
        Nodo aux = new Nodo();
        aux = inicio;
        if (inicio != null) {
            inicio = inicio.sig;
            aux.sig = null;
        } else {
            System.out.println("No hay elementos en la fila");
        }
    }

}