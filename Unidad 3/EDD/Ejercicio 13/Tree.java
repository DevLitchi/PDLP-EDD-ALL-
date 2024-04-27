
//Arbol binari cada nodo tiene dos hijos como maximo | Basado en lista doble
// Tree es el arbol binario
import java.util.Scanner;

public class Tree {

    Nodo Root; // Nodo raiz

    public Tree() { // Constructor
        Root = null;
    }

    public Nodo getRoot() {
        return Root;
    }

    public void creditos() {
        System.out.println("Programa realizado por: Dali Leonardo Basilio Torres");
        System.out.println("Estudiante de la carrera de Ingenieria de Software");
        System.out.println("Universidad Autonoma de Baja California");
        System.out.println("22 de Abril de 2024");
    }

    // Clean display
    public void CD() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // PEPC = Presione Enter Para Continuar
    public void PEPC() {
        System.out.println("Presione Enter para continuar");
        try {
            System.in.read();
        } catch (Exception e) {
        }
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

    // CN= Contar Niveles
    public int CN(Nodo aux) { // Contar niveles
        if (aux == null) {
            return 0;
        } else {
            int izq = CN(aux.left);
            int der = CN(aux.right);
            if (izq > der) {
                return izq + 1;
            } else {
                return der + 1;
            }
        }
    }

    public static void Pausa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Presione enter para continuar");
        sc.nextLine();
    }

    // IEA=Insertar Elementos Aleatorios
    public void EA(int qty) {
        for (int i = 0; i < qty; i++) {
            I((int) (Math.random() * 100));
        }
    }

    // BE = Buscar Elemento
    public void BE(int element) {
        int comparaciones = 0;
        Nodo aux = Root;
        while (aux != null) {
            comparaciones++;
            if (aux.getElement() == element) {
                System.out.println("Elemento encontrado");
                System.out.println("Comparaciones: " + comparaciones);
                return;
            }
            if (element < aux.getElement()) {
                aux = aux.left;
            } else {
                aux = aux.right;
            }
        }
        System.out.println("Elemento no encontrado");
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

    // TE = Tree Empty o Arbol vacio

    // Eliminar elemento especifico
    public void DE(int element) {
        Nodo aux = Root;
        Nodo ant = null;
        while (aux != null) {
            if (aux.getElement() == element) {
                if (aux == Root) {
                    Root = null;
                    System.out.println("El elemento " + element + " ha sido eliminado");
                } else if (aux.left == null && aux.right == null) {
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
        System.out.println("El elemento " + element + " no ha sido encontrado");
    }

    // MT=Mostrar Arbol en Preorden
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

    // Preorden invertido
    public void preordeninvertido(Nodo aux) {
        if (aux != null) {
            preordeninvertido(aux.right);
            preordeninvertido(aux.left);
            System.out.print(aux.getElement() + " ");
        }
    }

    // Inorden invertido
    public void inordeninvertido(Nodo aux) {
        if (aux != null) {
            inordeninvertido(aux.right);
            System.out.print(aux.getElement() + " ");
            inordeninvertido(aux.left);
        }
    }

    // Postorden invertido
    public void postordeninvertido(Nodo aux) {
        if (aux != null) {
            System.out.print(aux.getElement() + " ");
            postordeninvertido(aux.right);
            postordeninvertido(aux.left);
        }
    }

    // ELiminar todos los nodos repetidos

}
