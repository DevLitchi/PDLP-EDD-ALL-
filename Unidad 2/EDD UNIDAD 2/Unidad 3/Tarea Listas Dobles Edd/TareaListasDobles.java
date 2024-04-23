import java.util.Scanner;

public class TareaListasDobles {
    
    public class Nodo {
        String nombre;
        String celular;
        Nodo sig;
        Nodo ant;
    }
    
    public class Lista {
        public Nodo inicio;
        public Nodo fin;

        public Lista() {
            inicio = null;
            fin = null;
        }

        public void insertar(String nombre, String celular) {
            if (!nombre.isEmpty() && !celular.isEmpty()) {
                Nodo nuevo = new Nodo();
                nuevo.nombre = nombre;
                nuevo.celular = celular;
                nuevo.sig = null;
                nuevo.ant = null;
                if (inicio == null) {
                    inicio = nuevo;
                    fin = nuevo;
                } else {
                    nuevo.ant = fin;
                    fin.sig = nuevo;
                    fin = nuevo;
                }
            } else {
                System.out.println("Nombre y celular no pueden estar en blanco.");
            }
        }

        public void mostrarnombresolamente() {
            if (!vacia()) {
                Nodo aux = inicio;
                while (aux != null) {
                    System.out.println("Nombre: " + aux.nombre + ", Celular: " + aux.celular);
                    aux = aux.sig;
                }
            }
        }

        public void eliminarpornombre(String nombre) {
            if (!vacia()) {
                Nodo aux = inicio;
                while (aux != null) {
                    if (aux.nombre.equals(nombre)) {
                        eliminarNumero(aux.celular);
                        if (aux == inicio) {
                            eliminarInicio();
                        } else if (aux == fin) {
                            eliminarFinal();
                        } else {
                            aux.ant.sig = aux.sig;
                            aux.sig.ant = aux.ant;
                        }
                    }
                    aux = aux.sig;
                }
            }
        }

        public void eliminarporcelular(String celular) {
            if (!vacia()) {
                Nodo aux = inicio;
                while (aux != null) {
                    if (aux.celular.equals(celular)) {
                        if (aux == inicio) {
                            eliminarInicio();
                        } else if (aux == fin) {
                            eliminarFinal();
                        } else {
                            aux.ant.sig = aux.sig;
                            aux.sig.ant = aux.ant;
                        }
                    }
                    aux = aux.sig;
                }
            }
        }

        private void eliminarNumero(String celular) {
            Nodo aux = inicio;
            while (aux != null) {
                if (aux.celular.equals(celular)) {
                    aux.celular = null;
                    break;
                }
                aux = aux.sig;
            }
        }

        public boolean vacia() {
            return inicio == null;
        }

        public void eliminarInicio() {
            if (inicio != null) {
                inicio = inicio.sig;
                if (inicio != null) {
                    inicio.ant = null;
                }
            }
        }

        public void eliminarFinal() {
            if (fin != null) {
                fin = fin.ant;
                if (fin != null) {
                    fin.sig = null;
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner lector = new Scanner(System.in)) {

            int opcion = 0;
            TareaListasDobles tarea = new TareaListasDobles();
            Lista fila = tarea.new Lista();
            String nombre, celular;

            do {
                System.out.println("           Menu");
                System.out.println("----------------------------");
                System.out.println("| 1) Insertar              |");
                System.out.println("| 2) Mostrar fila          |");
                System.out.println("| 3) Eliminar por nombre   |");
                System.out.println("| 4) Eliminar por celular  |");
                System.out.println("| 5) Eliminar al Inicio    |");
                System.out.println("| 6) Eliminar al final     |");
                System.out.println("| 7) Salir                 |");
                System.out.println("----------------------------");
                System.out.println("Seleccione una opcion:");
                opcion = lector.nextInt();
                switch(opcion){
                    case 1:
                        lector.nextLine(); 
                        System.out.println("\nNombre: ");
                        nombre = lector.nextLine();
                        System.out.println("Celular: ");
                        celular = lector.nextLine();
                        fila.insertar(nombre, celular);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("\nMostrando fila:");
                        fila.mostrarnombresolamente();
                        System.out.println();
                        break;
                    case 3:
                        lector.nextLine(); 
                        System.out.println("\nNombre a eliminar: ");
                        nombre = lector.nextLine();
                        fila.eliminarpornombre(nombre);
                        System.out.println();
                        break;
                    case 4:
                        lector.nextLine(); 
                        System.out.println("\nCelular a eliminar: ");
                        celular = lector.nextLine();
                        fila.eliminarporcelular(celular);
                        System.out.println();
                        break;
                    case 5:
                        fila.eliminarInicio();
                        System.out.println();
                        break;
                    case 6:
                        fila.eliminarFinal();
                        System.out.println();
                        break;
                    case 7:
                        System.out.println("\nSaliendo...");
                        break;
                }
            } while (opcion != 7);
        }
    }
}
