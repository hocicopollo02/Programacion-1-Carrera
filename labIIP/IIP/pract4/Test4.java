package pract4;
import java.util.Scanner;
/**
 *  Clase Test4.
 *  Clase de prueba de TimeInstat.
 *  @author IIP 
 *  @version Curso 2020-21
 */
public class Test4 {
    
    /** No hay objetos de esta clase */
    private Test4() { }
    
    public static void main(String[] args) {
       Scanner kbd = new Scanner(System.in);
      
       System.out.println("Lectura de teclado de una hora.");
       System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
       int h = kbd.nextInt();
       System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");        
       int m = kbd.nextInt();
       
       TimeInstant t1 = new TimeInstant(h, m);  //hora que preestablecemos
       TimeInstant t2 = new TimeInstant(); //hora actual
       
       int dif = t2.toMinutes()-t1.toMinutes();
       int difAbs = Math.abs(dif);
       boolean anterior = t1.toMinutes() < t2.toMinutes();
     
       System.out.println("Hora introducida: " + t1.toString());
       System.out.println("Hora actual: " + t2.toString());
       System.out.println("Diferencia en minutos entre ambas horas: " + difAbs);
       System.out.println("Es anterior la hora introducida a la hora actual? " + anterior);
    }    
 
}   
