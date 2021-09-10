package Parcial2.examenes;

import java.io.*;
import java.util.*;

public class examen18_19 {
    
    public static void sumInt(String fileIn, String fileOut) throws FileNotFoundException {
    
        File fIn = new File(fileIn), fOut = new File(fileOut);
        Scanner scan = new Scanner(fIn);
        PrintWriter printer = new PrintWriter(fOut);
        
        int c = 0;
        
        while( scan.hasNext() ) {
        
            try{
                
                int i = scan.nextInt();
            
                printer.println(i);
                
                c += i;
                
            
            } catch (InputMismatchException e) {
            
                printer.println("Error: (" + scan.next() + ")");
                
            }
            
            printer.println("Suma: " + c);
            
            printer.close();
            scan.close();
            
        }
        
    }
    
    public void split(int x) {
    
        NodeInt aux = this.front;
        
        while(aux != null && aux.data != x) {
        
            aux = aux.next;
            
        }
        
        if(aux.data == x) {
        
            aux.data = x / 2;
            aux.next = new NodeInt( (x / 2)  + (x % 2) );
            
            if(aux == this.last) { this.last = aux.next; }
            
            this.size++;
        
        }
        
    }
    
}
