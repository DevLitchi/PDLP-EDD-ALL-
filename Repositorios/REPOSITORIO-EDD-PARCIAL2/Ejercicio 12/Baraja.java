public class Baraja {
    public Carta inicio; // Guardar la direccion del nodo privada
    public Carta fin;

    public Baraja() // Metodo constructor, metodo que le da vida a la clase
    {
        inicio = null;
        fin = null;
    }

    // * Funcion que usaremos para insertar personas o elementos a nuestra fila de
    public void insertar(int nombre) {
        Carta aux = new Carta();
        Carta nuevo = new Carta();
        nuevo.elemento = nombre;
        nuevo.sig = null;
        nuevo.anterior = null;
        if (inicio == null) { // Primer elemento. Como acabamos de crear la lista el inicio es null
            inicio = nuevo; // Ahora iniciio tendra la direccion de memoria del primer nodo
            fin = nuevo;
        } else // Metodo facil, a partir del segundo elemento
        {

            aux = inicio;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo;
            fin = nuevo;
            nuevo.anterior = aux;
        }
    }// Cuando salimos del metodo, la variable nuevo desaparece

    // * Funcion utilizada para mostrar todos nuestros elementos en la fila de banco
    public void mostrar() {
        // !Vacia() esto representa una negacion, si la lista esta vacia retorna un
        // true, la negacion es false, un if con false no se ejecuta
        if (vacia() != true) {
            Carta aux = new Carta();
            aux = inicio;
            while (aux != null) {
                System.out.println(aux.elemento);

                aux = aux.sig; // Avanzar en la lista para imprimirla
            }
        }
    }

    // * Funcion que elimina un elemento o persona del principio de nuestra fila
    public void eliminar_inicio() {
        if (!vacia()) {
            Carta aux = new Carta();
            aux = inicio;
            // Si inicio.sig es nulo, significa que solo tenemos un elemento en nuestra
            // lista, por eso eliminamos toda la lista
            if (inicio.sig == null) {
                inicio = null;
                fin = null;

            } else { // Si es diferente de null, tenemos mas de un elemento en la fila y hacemos el
                     // proceso bien
                inicio = inicio.sig;
                inicio.anterior = null;
                aux.sig = null;
            }
        }
        // Misma forma de funcionamiento que el anterior
        // if (inicio!=null) {
        // nodo aux = new nodo();
        // aux = inicio;
        // inicio = inicio.sig;
        // aux.sig = null;
        // }
    }

    // * Funcion que elimina un elemento o persona del final de nuestra fila
    public void eliminar_final() {
        if (!vacia()) {
            Carta aux = new Carta();
            aux = fin;
            // Si fin anterior es diferente de nulo, significa que tenemos mas de un
            // elemento en nuestra fila y hacemos el proceso normal
            if (fin.anterior != null) {
                fin = fin.anterior;
                fin.sig = null;
                aux.anterior = null;
            } else // Si fin anterior es nulo, significa que solo tenemos un elemento en nuestra
                   // lista, por eso eliminamos toda la lista
            {
                inicio = null;
                fin = null;
            }
        }
    }

    // * Funcion que verifica que nuestra lista no este vacia, en caso de estar
    // vacia, regresa un true
    public boolean vacia() {
        if (inicio == null)
            return true;
        else
            return false;
    }

    // * Funcion que reinicia nuestra lista, elimina todos los elementos que
    // teniamos
    public void reiniciarLista() {
        inicio = null;
        fin = null;
    }

    // * Funcion utilizada para mostrar todos nuestros elementos en la fila de
    // banco, pero del final al inicio
    public void mostrar_fin() {
        if (!vacia()) {
            Carta aux = new Carta();
            aux = fin;

            while (aux != null) {
                System.out.println(aux.elemento);

                aux = aux.anterior;
            }
        }
    }

    // * Funcion utilizada para eliminar a una persona en especifico de la fila, no
    // importa en que posicion se encuentre
    public boolean eliminar_medio(String nombre) {
        if (nombre.equals(inicio.elemento)) {
            eliminar_inicio();
            return true;
        } else {
            if (nombre.equals(fin.elemento)) {
                eliminar_final();
                return true;
            } else {
                Carta aux = new Carta();
                aux = inicio.sig;
                while (aux != fin) {
                    if (nombre.equals(aux.elemento)) {
                        aux.sig.anterior = aux.anterior;
                        aux.anterior.sig = aux.sig;
                        aux.anterior = null;
                        aux.sig = null;
                        return true;
                    } else {
                        aux = aux.sig;
                    }
                }
                return false;
            }

        }

    }

}
