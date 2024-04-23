import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Encontrar el numero mayor");
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.print(num1);
        num1 = lector.nextInt();
        System.out.print(num2);
        num2 = lector.nextInt();
        System.out.print(num3);
        num3 = lector.nextInt();

        if (num1 >= num2 && num1 >= num3)
            System.out.println("Num 1 es mayor a los demas: " + num1);
        else if (num2 >= num1 && num2 >= num3)
            System.out.println("Num 2 es mayor a los demas: " + num2);
        else

        if (num3 >= num1 && num3 >= num2)
            System.out.println("Num 3 es mayor a los demas: " + num3);
        else if (num1 == num2 || num1 == num3 || num2 == num3)
            System.out.println("Son iguales");

    }
}