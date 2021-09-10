package Parcial2;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class NASPRG {

    public static NodeStudent seq;

    public NASPRG () {

        this.seq = null;

    }

    /** Leer y crear una secuencia a partir de los datos del archivo (formato de cada línea: nota apellidos nombre) */
    public NASPRG(String s) throws FileNotFoundException {

        File f = new File(s);
        Scanner scan = new Scanner(f);
        
        while(scan.hasNext()) { 
        
            double nota = scan.nextDouble();
            String nombre = scan.next().trim();
            
            this.add(nombre, nota);
            //add(nombre, nota);
            
        }
        
        scan.close();

    }

    /** Inserta por orden alfabético un nuevo estudiante dentro de la secuencia */
    public static void add(String n, double g) {

        NodeStudent s = new NodeStudent(n, g);
        
        NodeStudent aux = seq;
        NodeStudent guardaespaldas = null;

        while(s.compareTo(aux) >= 0 && aux != null) {
            
            guardaespaldas = aux;
            aux = aux.next;
            
            if(aux == null) {}
        
        }
        
        if (guardaespaldas == null || aux == seq) {
            
            s.next = seq;
            seq = s;
            
            /* seq = s;
             * s = aux;
               
               */
        
        } else {
        
            guardaespaldas.next = s;
        
        }
        
        s.next = aux;
        
    }

    public static double searchByName(String n) { return 2.0; }

    public static void reviewGrade(String n, double g) {}

    /** Ordenar la secuencia (de mayor a menor nota) mediante el algoritmo de Selección Directa implementado sobre secuencias 
     * de nodos enlazados (este problema crea la necesidad de implementar el método de instancia compareTo dentro de la clase NodeStudent). */
    public static void sortByGrade() {}

    public static String toString(String s) { return s; }

}
