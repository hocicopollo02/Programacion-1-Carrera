package Parcial2.examenes;

import java.io.*;
import java.util.*;

public class examen17_18_pract {

    public static void sumInt(String fileIn, String fileOut) throws FileNotFoundException {

        File fIn = new File(fileIn);
        File fOut = new File(fileOut);

        Scanner scan = new Scanner(fIn);
        PrintWriter printer = new PrintWriter(fOut);

        int s = 0;

        while(scan.hasNext() ) {
            
            try {
                
                int x = scan.nextInt();
                printer.println(x);
                s += x;
            
            } catch (InputMismatchException e) {
            
                printer.println("Error:" + scan.next() );
                
            }

        }
        
        printer.println("Suma: " + s);
        
        scan.close();
        printer.close();
        
    }
    
    public void testNegData(Scanner s, PrintWriter err) {
    
        int c = 0;
        
        while(s.hasNext() ) {
            
            c++;
        
            try {
            
                int dia = s.nextInt();
                int mes = s.nextInt();
                int año = s.nextInt();
                
                if(dia < -1 || mes < -1|| año < -1) {
            
                    err.println(c + " " + dia + " " + mes + " " + año);
                
                }   
            
            } catch (InputMismatchException e) {
            
                s.nextLine();
            
            }
            
        }
    
    }
    
    public SetString subsetMaxLength (int t) {
        
        SetString s = new SetString();
        NodeString aux = first, lastNode = null;
    
        while(aux != null) {
        
            if(aux.data.length() <= t) {
            
                NodeString n = new NodeString(aux.data);
                
                if(s.first == null) {
                
                    s.first = nuevo;
                    
                } else {
                
                    lastNode.next = nuevo;
                
                }
                
                lastNode = nuevo;
                s.size++;
            
            }
            aux = aux.next;
        }
        
        return s;
    
    }
    
    

}
