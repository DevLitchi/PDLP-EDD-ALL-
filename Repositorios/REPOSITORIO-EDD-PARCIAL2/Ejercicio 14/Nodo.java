public class Nodo { // Nodo de un arbol binario, se pasron a ingles los nombres de las clases y
                    // metodos por convencion de uso
    int element;
    Nodo left, right;

    public Nodo(int element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }

    public int getElement() {
        return element;
    }
}
