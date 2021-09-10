package Parcial2.examenes;

import java.io.*;
import java.util.*;

public class examen17_18 {

    public static File arrayToFile(int[] a){

        File f = new File("ArrayElements.txt");
        PrintWriter printer = null;

        try {
            
            printer = new PrintWriter(f);
            
            for(int i = 0; i < a.length; i++) {
            
                printer.println(a[i]);
                
            }
            
        }catch (FileNotFoundException e) {

            System.err.println("No se ha encontrado el archivo" + f);

        } finally {
            
            if(printer != null) { printer.close(); }
        
        }

        return f;
    }
    
    public static NodeChar stringToChar(String s) {
    
        NodeChar r = null;
        
        if(s != null) { 
        
            int i = s.length() - 1;
            
            while(i >= 0) {
                
                char c = s.charAt(i);
                i--;
                r = new NodeChar(c);
            
            }
        
        }
        
        return r;
    
    }

}
