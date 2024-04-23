package Unidad3.Ejercicio12;

public class Baraja {
    public Carta inicio; //Guardar la direccion del nodo privada
    public Carta fin;   

    //Colores para la consola
    String [] colores = new String[] {"\033[30m","\033[31m","\033[32m","\033[33m","\033[34m","\033[35m","\033[36m","\033[37m"};
    String nos = "\033[30m"; 
    String red="\033[31m"; 
    String green="\033[32m"; 
    String yellow="\033[33m"; 
    String blue="\033[34m"; 
    String purple="\033[35m"; 
    String cyan="\033[36m"; 
    String white="\033[37m"; 
    String reset="\u001B[0m";

    
    public Baraja() //Metodo constructor, metodo que le da vida a la clase
    {
        inicio=null;
        fin=null;
    }

    //* Funcion que usaremos para insertar personas o elementos a nuestra fila de banco.
    public void insertar(int nombre, String denominacion, String color_carta)
    {
        Carta aux = new Carta();
        Carta nuevo = new Carta();
        nuevo.elemento = nombre;
        nuevo.str = denominacion;
        nuevo.color = color_carta;
        nuevo.sig = null;
        nuevo.anterior = null;
        if (inicio==null) { //Primer elemento. Como acabamos de crear la lista el inicio es null
            inicio = nuevo; //Ahora iniciio tendra la direccion de memoria del primer nodo
            fin=nuevo;
        }
        else //Metodo facil, a partir del segundo elemento
        {
           
            aux=inicio;
            while (aux.sig!=null) {
                aux = aux.sig;
            }
            aux.sig=nuevo;
            fin = nuevo;
            nuevo.anterior = aux;
        }
    }//Cuando salimos del metodo, la variable nuevo desaparece

    //* Funcion utilizada para mostrar todos nuestros elementos en la fila de banco
    public void mostrar()
    {
        if (vacia()!=true){
            Carta aux = new Carta();
            aux = inicio;
            while (aux!=null) {
                System.out.println(aux.color+aux.elemento+ " " + aux.str+reset);

                aux = aux.sig; //Avanzar en la lista para imprimirla
            }
        }
    }
    //* Funcion utilizada para sumar todas mis cartas de la Baraja
    public int Sumatoria()
    {
        int total=0;
        if (vacia()!=true){
            Carta aux = new Carta();
            aux = inicio;
            while (aux!=null) {
                total+=aux.elemento;
                aux = aux.sig; //Avanzar en la lista para imprimirla
            }
        }
        return total;
    }

    //* Funcion que elimina un elemento o persona del principio de nuestra fila
    public void eliminar_inicio()
    {
        if (!vacia()) {
        Carta aux = new Carta();
        aux = inicio;
            //Si inicio.sig es nulo, significa que solo tenemos un elemento en nuestra lista, por eso eliminamos toda la lista
            if(inicio.sig == null){
                inicio = null;
                fin=null;
                
            }
            else{ //Si es diferente de null, tenemos mas de un elemento en la fila y hacemos el proceso bien
                inicio = inicio.sig;
                inicio.anterior = null;
                aux.sig = null;
            }
        }
    }

    //* Funcion que elimina un elemento o persona del final de nuestra fila
    public void eliminar_final()
    {
        if (!vacia()) {
            Carta aux = new Carta();
            aux = fin;
            //Si fin anterior es diferente de nulo, significa que tenemos mas de un elemento en nuestra fila y hacemos el proceso normal
            if (fin.anterior!=null)
            {
                fin = fin.anterior;
                fin.sig = null;
                aux.anterior = null;
            }
            else //Si fin anterior es nulo, significa que solo tenemos un elemento en nuestra lista, por eso eliminamos toda la lista
            {
                inicio=null;
                fin=null;
            }
        }
    }

    //* Funcion que verifica que nuestra lista no este vacia, en caso de estar vacia, regresa un true
    public boolean vacia()
    {
        if (inicio==null)
            return true;
        else
            return false;
    }

    //* Funcion que reinicia nuestra lista, elimina todos los elementos que teniamos
    public void reiniciarLista()
    {
        inicio=null;
        fin=null;
    }
    
    //* Funcion utilizada para mostrar todos nuestros elementos en la fila de banco, pero del final al inicio
    public void mostrar_fin()
    {
        if (!vacia()) {
            Carta aux = new Carta();
            aux = fin;

            while (aux!=null) {
                System.out.println(aux.elemento);

                aux = aux.anterior;
            }
        }
    }

    //* Funcion utilizada para eliminar a una persona en especifico de la fila, no importa en que posicion se encuentre
    public boolean eliminar_medio(String nombre)
    {   
            if(nombre.equals(inicio.elemento))
            {
                eliminar_inicio();
                return true;
            }
            else 
            {
                if (nombre.equals(fin.elemento)) {
                    eliminar_final();
                    return true;
                }
                else{
                Carta aux = new Carta();   
                aux=inicio.sig;
                while (aux!=fin) {
                    if (nombre.equals(aux.elemento)) {
                        aux.sig.anterior = aux.anterior;
                        aux.anterior.sig = aux.sig;
                        aux.anterior = null;
                        aux.sig = null;
                        return true;
                    }
                    else{
                    aux = aux.sig;
                    }
                }
                return false;
            }

            }
            
        }
        
    }

