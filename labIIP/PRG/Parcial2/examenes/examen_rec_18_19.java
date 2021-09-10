package Parcial2.examenes;

import java.io.*;
import java.util.*;
import Parcial2.QueueIntLinked;

public class examen_rec_18_19 {
    
    public static File detectarErrores(String fileIn, String fileOut) throws FileNotFoundException {
    
        File fIn = new File(fileIn), fOut = new File(fileOut);
        
        Scanner scan = new Scanner(fIn);
        PrintWriter printer = new PrintWriter(fOut);
        
        int c = 0;
        
        try{
        
            String linea = scan.nextLine(); 
            c++;
            
            String[] words = linea.split("([ \t])+");
            
            if(words.length != 4) {
            
                printer.println("Error línea " + c + ": Incorrecto el número de datos." );
                
            } else {
            
                int edad = Integer.parseInt(words[1]);
                int puntos = Integer.parseInt(words[2]);
                int torneos = Integer.parseInt(words[3]);
                
                if(edad < 0 || puntos  < 0 || torneos < 0) {
                    
                    printer.println("Error línea " + c + ": Valor negativo.");
                    
                }
            }
            
        } catch (NumberFormatException e) {
        
            printer.println("Error línea " + c + ": Formato de entero no válido.");
        
        }
        
        printer.close(); 
        scan.close();
        
        return fOut;
        
        
    }
    
    public static void recular(QueueIntLinked q, int x) {
    
        int size = q.size();
        int i = 0;
        
        //Bucle de busqueda
        while(i < size && q.element1() != x) {
            
            q.add1(q.remove1());
            i++;
        
        }
        
        if(i < size) {
            
            q.remove1();
        
            for(int j = i + 1; j < size; j++) { q.add1(q.remove1()); }
            
            q.add1(x);
        
        }
    
    }
    
}
