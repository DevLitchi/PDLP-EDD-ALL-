import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   // Atributos
   public static ArrayList<Puesto> puestos = new ArrayList<Puesto>();
   public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

   // Limpiar la consola
   public static void clear() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
   }

   // Pausar el programa
   static Scanner pause = new Scanner(System.in);

   public static void pause() {
      System.out.print("Presiona Enter para continuar");
      pause.nextLine();
   }

   public static void empleadosexistentes() {
      File archivo = new File(
            "C:\\SEMESTREcuatro\\Profesora Laua\\Unidad 2\\PARADIGMAS UNIDAD 2\\Unidad 2\\Ejercicio16\\empleados.csv");
      if (archivo.exists()) {
         try {
            Scanner scanner = new Scanner(archivo);
            // brincarse el encabezado
            scanner.nextLine();

            while (scanner.hasNextLine()) {
               String linea = scanner.nextLine();
               String[] partes = linea.split(","); // El array de partes seria mas optimo que se acomode automaticamente
                                                   // no manual el segmentar los datos
               Empleado empleado = new Empleado();
               empleado.setNombre(partes[1].trim());
               empleado.setApellido(partes[2].trim());
               empleado.setNSS(partes[3].trim());
               Puesto puesto = new Puesto(partes[4].trim(), Integer.parseInt(partes[5].trim()));
               empleado.setActividad(puesto);
               empleados.add(empleado);
            }
            scanner.close();
         } catch (FileNotFoundException e) {
            System.out.println("No se pudo encontrar el archivo.");
         }
      }

   }

   // Cargar el archivo CSV
   public static void cargarCSV() {
      try {
         File archivo = new File(
               "C:\\SEMESTREcuatro\\Profesora Laua\\Unidad 2\\PARADIGMAS UNIDAD 2\\Unidad 2\\Ejercicio16\\puestos.csv");
         Scanner scanner = new Scanner(archivo);

         // Leer cada línea del archivo CSV
         while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] partes = linea.split(",");
            Puesto puesto = new Puesto(partes[0].trim(), Integer.parseInt(partes[1].trim()));
            puestos.add(puesto);
         }
         scanner.close(); // Cerrar el scanner
      } catch (FileNotFoundException e) {
         System.out.println("No se pudo encontrar el archivo.");
      }
   }

   // Función para guardar los empleados en un archivo CSV
   public static void guardarCSV(ArrayList<Empleado> empleados) {
      String csvFilePath = "C:\\SEMESTREcuatro\\Profesora Laua\\Unidad 2\\PARADIGMAS UNIDAD 2\\Unidad 2\\Ejercicio16\\empleados.csv";

      // Verificar si el archivo ya existe
      File file = new File(csvFilePath);
      boolean fileExists = file.exists();

      try {
         if (!fileExists) {
            file.createNewFile();
            System.out.println("Archivo CSV creado correctamente.");
         }

         FileWriter writer = new FileWriter(csvFilePath);

         writer.append("Id,Nombre,Apellido,NSS,Puesto,Salario,Estado\n");

         for (Empleado empleado : empleados) {
            // Agregar el numero de empleado
            writer.append(empleados.indexOf(empleado) + 1 + ",");
            writer.append(empleado.getNombre() + ",");
            writer.append(empleado.getApellido() + ",");
            writer.append(empleado.getNSS() + ",");
            writer.append(empleado.actividad.getDescripcion() + ",");
            writer.append(String.valueOf(empleado.actividad.getSalario() + ","));
            writer.append(empleado.isOnline() + "\n");

         }

         writer.flush();
         writer.close();

         System.out.println("Archivo CSV guardado correctamente.");
      } catch (

      IOException e) {
         System.err.println("Error al guardar el archivo CSV: " + e.getMessage());
      }
   }

   public static void main(String[] args) {

      empleadosexistentes();
      Scanner read = new Scanner(System.in);
      String opcion = "";
      boolean isRunning = true;

      cargarCSV();

      while (isRunning) {
         clear();
         System.out.println("EMPLEADOS");
         System.out.println("1. Dar de alta empleado");
         System.out.println("2. Dar de baja empleado");
         System.out.println("3. Mostrar empleados");
         System.out.println("4. Guardar archivo");
         System.out.println("0. Salir");
         System.out.print("Opción: ");
         opcion = read.nextLine();

         switch (opcion) {
            case "1":
               clear();
               System.out.println("Dar de alta empleado");
               Empleado empleadoTemp = new Empleado();
               System.out.print("Nombre: ");
               empleadoTemp.setNombre(read.nextLine());
               System.out.print("Apellido: ");
               empleadoTemp.setApellido(read.nextLine());
               System.out.print("NSS: ");
               empleadoTemp.setNSS(read.nextLine());
               System.out.println("puestos");
               for (int i = 0; i < puestos.size(); i++) {
                  System.out.println((i + 1) + ". " + puestos.get(i));
               }
               System.out.print("Puesto: ");
               int puesto = Integer.parseInt(read.nextLine());
               empleadoTemp.setActividad(puestos.get(puesto - 1));
               empleados.add(empleadoTemp);
               break;

            case "2":
               clear();
               System.out.println("Dar de baja empleado");
               System.out.print("empleado numero: ");
               int empleado = Integer.parseInt(read.nextLine());

               empleados.get(empleado - 1).setOnline(false);
               break;

            case "3":
               clear();
               System.out.println("Mostrar empleados\n");
               for (int i = 0; i < empleados.size(); i++) {
                  if (!empleados.get(i).isOnline()) {
                     continue;
                  }
                  System.out.println("Empleado " + (i + 1) + ":");
                  System.out.println(empleados.get(i) + "\n");
               }
               break;

            case "4":
               clear();
               System.out.println("Guardar archivo");
               guardarCSV(empleados);
               break;

            case "0":
               System.out.println("\nSaliendo...");
               isRunning = false;
               break;

            default:
               System.out.println("\nOpción no válida");
               break;
         }

         pause();
      }

      read.close();
   }
}