package Parcial2.examenes;

import java.io.*;
import java.util.*;
import Parcial2.NodeInt;

public class examen_rec_16_17 {
    public static int sumInt(String file) {
        File f = new File(file);
        int x = 0;
        Scanner scanner = null;
        try{
            scanner = new Scanner(f);

            while( scanner.hasNext() )  {

                String[] linea = scanner.nextLine().trim().split(" ");
                for(int i = 0;  i < linea.length; i++) {
                    try{
                        x += Integer.parseInt(linea[i]);
                    }catch (NumberFormatException e1) {

                        System.out.println(linea[i]);

                    }
                }

            }

        } catch (FileNotFoundException e2) {
            System.out.println("No se ha encontrado el fichero.");
        }

        if(scanner != null) { scanner.close(); }
        return x;
    }
    
    public void adelantar(int x) {
    
        NodeInt aux = this.first, ant = null;
        
        while(aux != null && aux.data != x) {
        
            ant = aux;
            aux = aux.next;
            
        }
        
        if(aux != null) {
        
            if(ant == null) { 
            
                ant = aux;
                
                while(ant.next != null) {
                
                    ant = ant.next;
                    
                }
                
                aux.data = ant.data;
                ant.data = x;
            
            }
        
        }
    
    }
    
    public static int ColaAInt(ColaIntEnla q) {
    
        int x = 0;
        for(int i = 0; i < q.talla; i++) {
        
            int r = q.remove1();
            x = x * 10 + r;
            q.add1(r);
            
        }
        
        return x;
    
    }
}
