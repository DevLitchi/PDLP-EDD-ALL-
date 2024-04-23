public class Lista {
    public class lista {
        public Nodo inicio;
        public Nodo fin;

        public lista() {
            inicio = null;
            fin = null;
        }

        public void insertar(String nombre) {
            Nodo aux = new Nodo();
            Nodo nuevo = new Nodo();
            nuevo.elemento = nombre;
            nuevo.sig = null;
            nuevo.ant = null;
            if (inicio == null) {
                inicio = nuevo;
                fin = nuevo;
            } else {
                aux = inicio;
                while (aux.sig != null) {
                    aux = aux.sig;
                }
                aux.sig = nuevo;
                nuevo.ant = aux;
                fin = nuevo;
            }
        }

        public void mostrar() {
            if (!vacia()) {
                Nodo aux = inicio;
                while (aux != null) {
                    System.out.println(aux.elemento);
                    aux = aux.sig;
                }
            }
        }

        public void mostraralrevez() {
            if (!vacia()) {
                Nodo aux = fin;
                while (aux != null) {
                    System.out.println(aux.elemento);
                    aux = aux.ant;
                }
            }
        }

        public boolean vacia() {
            if (inicio == null) {
                return true;
            } else {
                return false;
                
            }


        }

        public void eliminarTodo() {
            inicio = null;
            fin = null;
        }

        public void eliminar() {
            if (inicio != null) {
                Nodo aux = inicio;
                inicio = inicio.sig;
                if (inicio != null) {
                    inicio.ant = null;
                }
                aux.sig = null;
            }
        }

        public void eliminarfinal() {
            if (fin != null) {
                Nodo aux = fin;
                fin = fin.ant;
                if (fin != null) {
                    fin.sig = null;
                }
                aux.ant = null;
            }
        }

        public void reiniciar() {
            inicio = null;
            fin = null;
        }
    }


}