class Pila {
    public Nodo inicio;
    public Nodo fin;
    public Nodo aux;
    public int opcion;

    public Pila() {
        inicio = null;
        fin = null;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    class Nodo {
        int elemento;
        Nodo sig;
        Nodo ant; // Add the missing 'ant' field
    }

    public void insertar(int numero) {
        Nodo nuevo = new Nodo();
        nuevo.elemento = numero;
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
                // Si el usuario ingresa ROJO se imprime en rojo
            }
            if (recorrer.elemento.equals("ROJO"))
                ;
            // Si el usuario ingresa VERDE se imprime en verde
            System.out.println(ANSI_RED + "Turno: " + i + " " + recorrer.elemento + ANSI_RED);
            if (recorrer.elemento.equals("VERDE"))
                ;
            System.out.println(ANSI_GREEN + "Turno: " + i + " " + recorrer.elemento + ANSI_GREEN);
            // Si el usuario ingresa AMARILLO se imprime en amarillo
            if (recorrer.elemento.equals("AMARILLO"))
                ;
            System.out.println(ANSI_YELLOW + "Turno: " + i + " " + recorrer.elemento + ANSI_YELLOW);
            // Si el usuario ingresa AZUL se imprime en azul
            if (recorrer.elemento.equals("AZUL"))
                ;
            System.out.println(ANSI_BLUE + "Turno: " + i + " " + recorrer.elemento + ANSI_BLUE);
            // Si el usuario ingresa MORADO se imprime en morado
            if (recorrer.elemento.equals("MORADO"))
                ;
            System.out.println(ANSI_PURPLE + "Turno: " + i + " " + recorrer.elemento + ANSI_PURPLE);
            // Si el usuario ingresa CYAN se imprime en cyan
            if (recorrer.elemento.equals("CYAN"))
                ;
            System.out.println(ANSI_CYAN + "Turno: " + i + " " + recorrer.elemento + ANSI_CYAN);
            recorrer = recorrer.sig;
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

    public void eliminarfinal() {
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            aux = inicio;
            while (aux.sig != fin) {
                aux = aux.sig;

            }
            fin = aux;
            aux = aux.sig;
            fin.sig = null;
        }
    }
}