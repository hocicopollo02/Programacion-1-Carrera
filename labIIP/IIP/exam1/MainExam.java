package exam1;

import java.util.Scanner;
/**
 * Clase MainExam: clase programa que usa la clase TimeInstantOK, 
 * identica a tu clase TimeInstant con el constructor TimeInstantOK(int) correcto. 
 * 
 * @author IIP
 * @version Curso 2020-21
 */
public class MainExam {
    // No se usan objetos de esta clase
    private MainExam() { }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca una cantidad de minutos "
            + "(transcurridos desde las 00:00): ");
        int m = teclado.nextInt();
        // Una vez leido el dato de minutos transcurridos desde las 00:00 desde el teclado y 
        // suponiendo que es correcto:
        // a) Crea un TimeInstantOK ti a partir de dicho dato, haciendo uso del constructor
        //    con un unico parametro
        TimeInstantOK ti;
        ti = new TimeInstantOK(m);
        
        // b) Muestra por pantalla ti (en el formato "hh:mm")        
        System.out.println(ti.toString());
        
        // c) Crea un TimeInstantOK ta con el valor del instante actual UTC, haciendo uso
        //    del constructor por defecto (sin parametros)
        TimeInstantOK ta;
        ta = new TimeInstantOK();
        
        // d) Muestra por pantalla ta (en el formato "hh:mm")        
        System.out.println(ta.toString());
        
    }
}