public class estatico {
    // Funicones puras
    public static boolean bisiesto(int num) {
        return num % 4 == 0;
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // Funcion no-pura
    public static int suma5(int num) {
        return num + 5;
    }
    
}
