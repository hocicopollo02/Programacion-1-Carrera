package parcial2;
import java.util.Scanner;

/**
 * Write a description of class Arrays here.
 *
 * @author (Pablo)
 * @version (Diciembre 2020)
 */
public class Arrays {
    
    //Muestra el array que introduce por pantalla.
    public static void mostrar(int[] a) {
        
         for(int i = 0; i < a.length; i++) {
             
            System.out.println(a[i]);
            
        }
        
    }
    
    public static double media(int[] a) {
    
        double r = 0.0;
        
        for(int i = 0; i < a.length; i++) {
        
            r += a[i];
            
        }
        
        return r / a.length;
        
    }
    
    //Muestra el array que se ha introducido por pantalla pero invertido.
    public static void mostrarInvertido(int[] a) {
        
        for(int i = a.length - 1; i >= 0 ; i--) {
             
            System.out.println(a[i]);
            
        }
    
    }
    
   //Método void que recibe un array y lo invierte.
    public static void invertirVoid(int[] a) {
        
        int [] b = new int[a.length];
        
        //Invierte el  array
        for (int i = 0; i < a.length; i++) {
        
            b[i] = a[(a.length - 1) - i]; 
            
        }
        
        //Asigna el valor del array invertido al array original
        for (int i = 0; i < a.length; i++) {
        
            a[i] = b[i];    
            
        }
        
        //Comprueba que el array está invertido
        mostrar(a);
        
    }
    
    // Método que recibe un array y lo devuelve invertido.
    public static int[] invertirArray(int[] a) {
    
        int [] b = new int[a.length];
        
        for (int i = 0; i < b.length; i++) {
        
            b[i] = a[(a.length - 1) - i];
            
        }
            
        return b;
        
    }
    
    public static int[] generarArray(int n) {
        
        int [] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            a[i] = (int) (Math.random() * 11);
            
        }
        
        return a;
        
    }
    
    public static void mostrarArray(int [] a) {
        
        for (int i = 0;i < a.length; i++) {
           
            System.out.print(a[i] + " ");
           
        }
        
    }
    
    public static int calcularModa(int [] a) {
        
        int [] notas = new int[11];
        
        for(int i = 0; i < a.length; i++) {
        
            int n = a[i];
            notas[n]++;
            
        }
        
        int maximo = -1, posMax = -1;
        
        for (int i = 0; i < notas.length; i++) {
        
            if(notas[i] > maximo) {
                
                maximo = notas[i];
                posMax = i;
                
            }
        
        }
        
        return posMax;
    
    }
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la aplicacion de alumnos.");
        System.out.println("¿Cuantos alumnos tengo?");
        int x = scanner.nextInt();
        mostrarArray(generarArray(x));
        
    }
    
}
