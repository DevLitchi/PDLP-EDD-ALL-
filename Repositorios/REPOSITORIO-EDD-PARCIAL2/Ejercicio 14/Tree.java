//Arbol binari cada nodo tiene dos hijos como maximo | Basado en lista doble
// Tree es el arbol binario
public class Tree {

    Nodo Root; // Nodo raiz

    public Tree() { // Constructor
        Root = null;
    }

    public Nodo getRoot() {
        return Root;
    }

    // ILE = Is List Empty o es la lista vacia
    public boolean ILE() {
        if (Root == null) {
            return true;
        } else {
            return false;
        }
    }

    // DT=Delete Tree o eliminar arbol
    public void DT() {
        Root = null;
    }

    // I=Insertar
    public void I(int element) {
        Nodo nuevo = new Nodo(element);
        if (Root == null) {
            Root = nuevo;
        } else {
            Nodo aux = Root; // Nodo auxiliar para recorrer el arbol
            Nodo ant = null; // Nodo anterior para saber donde insertar es el padre
            while (aux != null) {
                ant = aux;
                if (element < aux.getElement()) {
                    aux = aux.left;
                } else {
                    aux = aux.right;
                }
            }
            if (element < ant.getElement()) {
                ant.left = nuevo;
            } else {
                ant.right = nuevo;
            }
        }
    }

    // Eliminar elemento especifico
    public void DE(int element) {
        Nodo aux = Root;
        Nodo ant = null;
        while (aux != null) {
            if (aux.getElement() == element) {
                if (aux.left == null && aux.right == null) {
                    if (ant.left == aux) {
                        ant.left = null;
                    } else {
                        ant.right = null;
                    }
                } else if (aux.left == null && aux.right != null) {
                    if (ant.left == aux) {
                        ant.left = aux.right;
                    } else {
                        ant.right = aux.right;
                    }
                } else if (aux.left != null && aux.right == null) {
                    if (ant.left == aux) {
                        ant.left = aux.left;
                    } else {
                        ant.right = aux.left;
                    }
                } else {
                    Nodo aux2 = aux.right;
                    Nodo ant2 = aux;
                    while (aux2.left != null) {
                        ant2 = aux2;
                        aux2 = aux2.left;
                    }
                    aux.element = aux2.element;
                    if (ant2.left == aux2) {
                        ant2.left = aux2.right;
                    } else {
                        ant2.right = aux2.right;
                    }
                }
                return;
            }
            ant = aux;
            if (element < aux.getElement()) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
        }
    }

    public void MT(Nodo aux) { // Mostrar arbol en preorden
        if (aux != null) {
            System.out.print(aux.getElement() + " ");
            MT(aux.left);
            MT(aux.right);
        }
    }

    public void Stio(Nodo aux) { // Show Tree In Orden == Mostrar arbol en inorden
        if (aux != null) {
            Stio(aux.left);
            System.out.print(aux.getElement() + " ");
            Stio(aux.right);
        }
    }

    public void Stpo(Nodo aux) { // Show Tree Post Orden == Mostrar arbol en postorden
        if (aux != null) {
            Stpo(aux.left);
            Stpo(aux.right);
            System.out.print(aux.getElement() + " ");
        }
    }

    public void preordeninvertido(Nodo aux) {
        if (aux != null) {
            preordeninvertido(aux.right);
            preordeninvertido(aux.left);
            System.out.print(aux.getElement() + " ");
        }
    }

    public void inordeninvertido(Nodo aux) {
        if (aux != null) {
            inordeninvertido(aux.right);
            System.out.print(aux.getElement() + " ");
            inordeninvertido(aux.left);
        }
    }

    public void postordeninvertido(Nodo aux) {
        if (aux != null) {
            System.out.print(aux.getElement() + " ");
            postordeninvertido(aux.right);
            postordeninvertido(aux.left);
        }
    }
}
