public class pilas {
    public nodo inicio; // Nodo que nos indicara donde es el inicio de nuestra lista
    public nodo fin; // Nodo que nos indicara donde es el final de nuestra lista
    String black = "\033[30m";
    String red = "\033[31m";
    String green = "\033[32m";
    String yellow = "\033[33m";
    String blue = "\033[34m";
    String purple = "\033[35m";
    String cyan = "\033[36m";
    String white = "\033[37m";
    String reset = "\u001B[0m";

    public pilas() // Metodo constructor, metodo que le da vida a la clase
    {
        inicio = null;
    }

    // * Funcion que usaremos para insertar personas o elementos a nuestra cola.
    // En colas, no se puede insertar al inicio o en medio, siempre al final
    public void insertar(int numero) {
        nodo aux = new nodo();
        nodo nuevo = new nodo();
        nuevo.elemento = numero;
        nuevo.sig = null;
        if (inicio == null) { // Primer elemento. Como acabamos de crear la lista el inicio es null
            inicio = nuevo; // Ahora iniciio tendra la direccion de memoria del primer nodo
            fin = nuevo;
        } else // Metodo facil, a partir del segundo elemento
        {
            // fin.sig=nuevo;
            // fin = nuevo;
            aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            fin = nuevo;
        }
    }// Cuando salimos del metodo, la variable nuevo desaparece

    // //* Funcion utilizada para mostrar todos nuestros elementos en la cola
    // public void mostrar()
    // {
    // // !Vacia() esto representa una negacion, si la lista esta vacia retorna un
    // true, la negacion es false, un if con false no se ejecuta
    // if (vacia()!=true){
    // nodo aux = new nodo();
    // aux = inicio;
    // while (aux!=null) {
    // System.out.println(aux.elemento);

    // aux = aux.sig; //Avanzar en la cola para imprimirla
    // }
    // }
    // }
    // * Funcion utilizada para mostrar todos nuestros elementos en la pila
    public void mostrar(pilas tmp) {
        // !Vacia() esto representa una negacion, si la lista esta vacia retorna un
        // true, la negacion es false, un if con false no se ejecuta
        if (vacia() != true) {

            nodo aux = new nodo();
            aux = inicio;
            int colorIndex = 0;
            while (inicio != null) {
                String color;
                switch (colorIndex) {
                    case 0:
                        color = yellow;
                        break;
                    case 1:
                        color = red;
                        break;
                    case 2:
                        color = green;
                        break;
                    default:
                        color = reset;
                        break;
                }
                System.out.println(color + fin.elemento + reset); // Imprimimos el elemento de la pila original
                tmp.insertar(fin.elemento); // Guardamos el elemento en una pila temporal
                eliminar();
                colorIndex = (colorIndex + 1) % 8; // Cambiar al siguiente color
            }
            while (tmp.inicio != null) { // Regresamos los elementos a la pila original para no perder la pila
                insertar(tmp.fin.elemento);
                tmp.eliminar();
            }
        }
    }

    // * Funcion que elimina un elemento o persona del final de nuestra pila
    public void eliminar() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                nodo aux = new nodo();
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

    // * Funcion que verifica que nuestra cola no este vacia, en caso de estar
    // vacia, regresa un true
    public boolean vacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // Reiniciar pilas
    public void reiniciar() {
        inicio = fin = null;
    }

}