class Pila {
    public Nodo inicio;
    public Nodo fin;
    public Nodo aux;
    public int opcion;

    public Pila() {
        inicio = null;
        fin = null;
    }

    class Nodo {
        String elemento;
        Nodo sig;
        Nodo ant; // Add the missing 'ant' field
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void mostrar(Pila temp) {
        if (!vacia()) {
            while (inicio != null) {
                System.out.print("[" + fin.elemento + "]");
                temp.insertar(fin.elemento);
                eliminar();
            }
            while (temp.inicio != null) {
                insertar(temp.fin.elemento);
                temp.eliminar();

            }
        }
    }

    public void insertar(String elemento) {
        Nodo nuevo = new Nodo();
        nuevo.elemento = elemento;
        if (inicio == null) {
            nuevo.sig = null;
            nuevo.ant = null;
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.sig = inicio;
            nuevo.ant = null;
            inicio.ant = nuevo;
            inicio = nuevo;
        }
    }

    public void mostrar() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.elemento + "]");
            recorrer = recorrer.sig;
        }
        System.out.println();
    }

    public void eliminar() {
        if (!vacia()) {
            Nodo aux = new Nodo();
            aux = inicio;
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
}
