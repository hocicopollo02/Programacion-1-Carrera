package exam1Code;

import java.util.Locale;
import java.util.Scanner;
/**
 * Clase TestMeasure: clase programa que prueba la funcionalidad de Medida.
 *
 * @author IIP
 * @version Curso 2020-21
 */
public class TestMeasure {
    /** No se usan objetos de esta clase. */
    private TestMeasure() { }
    
    public static void main(String[] args) {
        //a.(0.25 puntos) Crear una medida por defecto Measure m1.
        Measure m1 = new Measure();

      
        //b.(0.75 puntos) Crear un Scanner kbd con el que leer los siguientes datos: 
        //  el nombre de una estacion de toma de medidas y el nivel de ruido de una medida. 
        Scanner kbd = new Scanner(System.in);
        System.out.println("¿Cómo se llama la estación?");
        String s = kbd.next();
        System.out.println("¿Y cúanto ruido hay?");
        double r = kbd.nextDouble();
        
        //c.(0.5 puntos) Crear otra medida Measure m2 con la estacion y nivel de ruido 
        //  leidos de teclado y con un periodo correspondiente al instante de tiempo UTC actual. 
        TimeInstant t = new TimeInstant();
        Measure m2 = new Measure(t, r, s);      

       
        //d.(0.25 puntos) Actualizar el nivel de ruido de la medida m1 a la mitad del que tiene. 
        double newNoise = m1.getNoise();
        m1.setNoise(newNoise / 2);
        
 
        
        //e.(0.25 puntos) Mostrar por pantalla las medidas m1 y m2.
        System.out.println("La medida m1 es: " + m1.toString());
        System.out.println("La medida m2 es: " + m2.toString());

        
        //f.(0.5 puntos) Mostrar por pantalla el resultado de comprobar si tanto el nivel de 
        //  ruido de la medida m1 como el de la medida m2 superan o no el valor maximo de ruido 
        //  permitido, true o false respectivamente.
        System.out.println("¿Supera m1 el máximo permitido? " + m1.exceedsMax());
        System.out.println("¿Supera m2 el máximo permitido? " + m2.exceedsMax());

        
        //g.(0.5 puntos) Mostrar por pantalla el resultado de comprobar si las medidas m1 y m2 
        //  son iguales o no, true o false respectivamente. 
        boolean x = m1.equals(m2);
        System.out.println("¿Son las dos medidas iguales?" + x);
        
    }
}
