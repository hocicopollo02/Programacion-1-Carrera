package Parcial2.examenes;

import java.io.*;
import java.util.*;

public class examen_rec_15_16 {
    
    public static void m1(String[] lS) {
        for (int i = 0; i < lS.length; i++) {
            System.out.print("Pos: " + i + ": ");
            try{

                if (lS[i].length() > 0) {
                    double valor = Double.parseDouble(lS[i]);
                    System.out.println("Valor: " + valor);
                }
                else { System.out.println("String de longitud cero."); }
            } catch (NumberFormatException e1) {

                System.out.print("Número mal formado.");

            } catch (NullPointerException e2) {
                
                System.out.print("String inexistente.");

            }
            
        } 
    }
    
    public static File PilaIntEnlaToFile(PileIntEnla p) {
        
        PileIntEnla aux = new PilaIntEnla();
        File f = new File("ContenidoDePila.txt");
        
        try{
            
            PrintWriter printer = new PrintWriter(f);
            while( !p.isEmpty() ) {
                
                aux.add( p.remove() );    
                
            } 
            while( !aux.isEmpty() ) {
            
                p.add( aux.remove() );
                printer.println( p.first );
                
            }
            
            printer.close();
        
        
        } catch(FileNotFoundException e) {
        
            System.out.println("No se ha podido crear el archivo.");
            
        }
        
        p = aux;
        return f;
    
    }
    
    public void recular(int x) {
    
        NodeInt aux = first, ant = null;
        
        while(aux != null && aux.data != x) {
        
            ant = aux;
            aux = aux.next;
        }
        
        if(aux != null && aux != this.last) {
        
            if(aux == this.first) { first = first.next; }
            else{ ant.next = aux.next; }
            
            last.next = aux;
            aux.next = null;
            
            this.last = aux;
        }
    
    }

}
