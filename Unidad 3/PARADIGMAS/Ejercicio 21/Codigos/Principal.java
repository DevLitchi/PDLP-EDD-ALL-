package Codigos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> BaseDeDatos = new ArrayList<>(); // Lista para almacenar los alumnos

        int op;
        String aux;
        Alumno estudiante = new Alumno();
        do {
            MetodosComunes.Lp();
            MetodosComunes.MENU();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    MetodosComunes.Lp();
                    System.out.println("Leer archivo");
                    System.out.println("Ingrese el nombre del archivo a leer");
                    aux = sc.nextLine();
                    try {
                        File myObj = new File(aux);
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            Alumno nuevoAlumno = new Alumno();
                            nuevoAlumno.setNombre(myReader.nextLine());
                            nuevoAlumno.setMatricula(myReader.nextLine());
                            nuevoAlumno.setPromedio(Double.parseDouble(myReader.nextLine()));
                            BaseDeDatos.add(nuevoAlumno);
                        }
                        myReader.close();
                        System.out.println("Se ha leido el archivo con exito");
                        MetodosComunes.Pausa();
                    } catch (FileNotFoundException e) {
                        System.out.println("Ha ocurrido un error al leer el archivo");
                        MetodosComunes.Pausa();
                        e.printStackTrace();
                    }

                    break;
                case 2:
                    MetodosComunes.Lp();
                    System.out.println("Alta de alumno nuevo");
                    Alumno nuevoAlumno = new Alumno(); // Crear una nueva instancia de Alumno
                    nuevoAlumno.setNombre(VAlumnos.leer());

                    // EVITAR QUE SE REPITA LA MATRICULA
                    boolean matriculaRepetida;
                    do {
                        nuevoAlumno.setMatricula(VAlumnos.leerNum());
                        matriculaRepetida = false;
                        for (Alumno alumno : BaseDeDatos) {
                            if (alumno.getMatricula().equals(nuevoAlumno.getMatricula())) {
                                System.out.println("La matricula ya existe, intente de nuevo");
                                matriculaRepetida = true;
                                break;
                            }
                        }
                    } while (matriculaRepetida);

                    nuevoAlumno.setPromedio(VAlumnos.leerPromedio());
                    BaseDeDatos.add(nuevoAlumno); // Agregar el alumno a la lista
                    System.out.println("Alumno agregado con exito...");
                    MetodosComunes.Pausa();
                    break;

                case 3:
                    MetodosComunes.Lp();
                    System.out.println("Dar de Baja a alumno");
                    if (BaseDeDatos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                        MetodosComunes.Pausa();
                    } else {
                        System.out.println("Ingrese la matricula del alumno a dar de baja");
                        aux = sc.nextLine();
                        boolean existe = false;
                        for (Alumno alumno : BaseDeDatos) {
                            if (alumno.getMatricula().equals(aux)) {
                                BaseDeDatos.remove(alumno);
                                System.out.println("Alumno eliminado con exito...");
                                MetodosComunes.Pausa();
                                existe = true;
                                break;
                            }
                        }
                        if (!existe) {
                            System.out.println("No se encontro el alumno con la matricula: " + aux);
                            MetodosComunes.Pausa();
                        }
                    }

                    break;
                case 4:
                    MetodosComunes.Lp();
                    System.out.println("Guardar archivo");
                    guardarCSV(BaseDeDatos);
                    MetodosComunes.Pausa();

                    // myWriter.write(alumno.getNombre() + "\n");
                    // myWriter.write(alumno.getMatricula() + "\n");
                    // myWriter.write(alumno.getPromedio() + "\n");
                    // }

                    break;
                case 5:
                    MetodosComunes.Lp();
                    System.out.println("Mostrar alumnos");
                    if (BaseDeDatos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (Alumno alumno : BaseDeDatos) {
                            // Imprimir los datos de cada alumno con el metodo toString
                            System.out.println("ALUMNO ID: " + (BaseDeDatos.indexOf(alumno) + 1));
                            System.out.println("________________________");
                            System.out.println(alumno.toString());
                            System.out.println("________________________");
                        }
                    }
                    MetodosComunes.Pausa();
                    break;
                case 0:
                    MetodosComunes.Lp();

                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 0);// Fin del ciclo 0 Salir
    }

    public static void guardarCSV(ArrayList<Alumno> BaseDeDatos) {
        String csvFilePath = "C:\\SEMESTREcuatro\\Repositorio\\PDLP-EDD-ALL-\\Unidad 3\\PARADIGMAS\\Ejercicio 21\\CSV\\alumnos.csv";

        // Verificar si el archivo ya existe
        File file = new File(csvFilePath);
        boolean fileExists = file.exists();

        try {
            if (!fileExists) {
                file.createNewFile();
                System.out.println("Archivo CSV creado correctamente.");
            }

            FileWriter writer = new FileWriter(csvFilePath);

            writer.append("ID,NOMBRE,MATRICULA,PROMEDIO\n");

            for (Alumno alumno : BaseDeDatos) {
                writer.append(BaseDeDatos.indexOf(alumno) + 1 + ",");
                writer.append(alumno.getNombre() + ",");
                writer.append(alumno.getMatricula() + ",");
                writer.append(alumno.getPromedio() + "\n");

                // // Agregar el numero de empleado
                // writer.append(empleados.indexOf(empleado) + 1 + ",");
                // writer.append(empleado.getNombre() + ",");
                // writer.append(empleado.getApellido() + ",");
                // writer.append(empleado.getNSS() + ",");
                // writer.append(empleado.actividad.getDescripcion() + ",");
                // writer.append(String.valueOf(empleado.actividad.getSalario() + ","));
                // writer.append(empleado.isOnline() + "\n");

            }

            writer.flush();
            writer.close();

            System.out.println("Archivo CSV guardado correctamente.");
        } catch (

        IOException e) {
            System.err.println("Error al guardar el archivo CSV: " + e.getMessage());
        }
    }
}