package parcial2;
import java.util.Scanner;

public class Utils{
    
    public static void main(String[] args) {
        
        String palabra = "";
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Dime una palabra: ");
        String s = scan.next();
        
        
        //1. Llamar al método que la convierte en un array de caracteres
        char[] a = stringToArray(palabra);
        // bucle para mostrar el contenido del array
        for(int i = 0; i < a.length; i++) {
            
            System.out.println(a[i]);
            
        }
        
        // 2. Llamar al método que convierte al array en un String.
        String p = arrayToString(a);
        // mostrar el String por  pantalla
        System.out.println("La palabra que has introducido es: " + p);
        
    }

    /* Método que calcula n! 
    Toma como parámetros un número entero n
     */

    public static int fact(int n) {

        int r = 1;

        for(int i = 1; i <= n; i++) {
            r = r * i;
        }

        return r;

    }

    public static int sumaEdad() {

        Scanner scan = new Scanner(System.in);
        int e, n = 0;

        do {
            System.out.println("Introduce tu edad: ");
            e = scan.nextInt();
            n += e;
        } while(e != 0);

        return n;

    }

    public static double serie(double x, double epsilon) {

        double r = 0.0;
        boolean a;

        do {
            r = (x - 1) * x;      
            a = (1 / (x - (x - 1))) < epsilon;
        } while(a != true);

        if (r < 0) { return -1; } else { return r; }

    }

    public static int examen(double x, double epsilon) {

        int n = 3;
        double actual, anterior, condicion;

        anterior = x;
        actual = 2 * x;

        condicion = 1 / (actual - anterior); 

        while(condicion > epsilon) {
            anterior = actual;
            actual = anterior * n;
            condicion = 1 / (actual - anterior);
            n++;
        }

        return n - 1;

    }

    /** Método que hace la media del conjunto de números de un array. */
    
    public static double media(int[] a) {

        int s = 0;

        for(int i = 0; i < a.length; i++) {
            s += a[i];
        }

        return s / a.length;

    }

    /** Método que transforma un String en un array de caracteres. */

    public static char[] stringToArray(String s) {

        char [] a = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {

            a[i] = s.charAt(i);

        }

        return a;

    }
    
    /** Método que transforma un array de caracteres en un String.*/

    public static String arrayToString(char [] a) {

        String s = "";

        for(int i = 0; i < a.length; i++) {

            s += a[i];

        }

        return s;

    }

}









