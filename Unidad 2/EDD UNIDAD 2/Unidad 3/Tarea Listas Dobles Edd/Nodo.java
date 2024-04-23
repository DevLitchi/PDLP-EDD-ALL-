System.out.println("           Menu");
                System.out.println("----------------------------");
                System.out.println("| 1) Insertar              |");
                System.out.println("| 2) Mostrar fila          |"); // mostrar fila de final al inicio
                System.out.println("| 4) Eliminar por nombre   |"); // reiniciar fila, inicio y final nulo
                System.out.println("| 5) Eliminar por celular  |");
                System.out.println("| 6) Eliminar al Inicio    |");
                System.out.println("| 7) Eliminar al final     |");
                System.out.println("| 8) Salir                 |");
                System.out.println("----------------------------");
                System.out.println("Seleccione una opcion:");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        nombre = lector.nextLine();
                        System.out.println("\nCliente: ");
                        nombre = lector.nextLine();
                        fila.insertar(nombre);
                        System.out.println();
                        break;
                    case 2:
                            System.out.println("\nPersonas en la fila");
                            fila.mostrar();
                        System.out.println();
                        break;
                    case 3:
                        if (fila.vacia() == true) {
                            System.out.println("\nFila vacia");
                        } else {
                            System.out.println("\nPersonas en la fila al revez");
                            fila.mostraralrevez();
                        }
                        System.out.println();
                        break;
                    case 4:
                        if (fila.vacia() != true) {
                            System.out.println("\nEliminando a: " + fila.inicio.elemento);
                            fila.eliminarTodo();
                        } else {
                            System.out.println("\nFila vacia");
                        }
                        System.out.println();
                        break;
                    case 5:
                        if (fila.vacia() != true) {
                            System.out.println("\nEliminando a: " + fila.fin.elemento);
                            fila.eliminarfinal();
                        } else {
                            System.out.println("\nFila vacia");
                        }
                        System.out.println();
                        break;
                    case 6:
                        fila.reiniciar();
                        System.out.println("\nFila reiniciada\n");
                        break;
                    case 7:
                        System.out.println("\nSaliendo...");
                        break;
                    case 8:
                        if (fila.vacia() == true) {
                            System.out.println("\nFila vacia");
                        } else {
                            System.out.println("Eliminar un elemento de la fila");
                            System.out.println("Nombre a eliminar: ");
                            nombre = lector.nextLine();
                            nombre = lector.nextLine();
                            fila.eliminaraux(nombre);

                        }
                        break;

                    default:
                        System.out.println("\nOpcion no valida");
                }
            } while (opcion != 8); 
        }
    }
}
}