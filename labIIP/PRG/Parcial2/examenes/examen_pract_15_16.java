package Parcial2.examenes;

import java.io.*;
import java.util.*;

public class examen_pract_15_16 {
    
    public Apunte[] toArray() {
    
            Apunte[] apuntes = new Apunte[talla];
            NodeApunte aux = primero;
            
            for(int i = 0; i < talla; i++) {
            
                apuntes[i] = aux.data;
                aux = aux.next;                
                
            }
            
            return apuntes;
            
        
    }
    
    public double promedioApuntes() {
    
            double p = 0;
            
            if(numCuentas != 0) {
            
                NodoCuenta aux = new NodoCuenta();
                
                while(aux != null) {
                
                    promedio += aux.data;
                    aux = aux.next;
                    
                }
                p /= numCuentas;
            }
            
            
            return p;
        
    }
    
    public String gestionarRemesa(Scanner remesa){
    
        String s = "";
        final int MAX_NUM_RECIBO = 100, MIN_NUM_RECIBO = 1;
        
        int numC = 0;
        double importe = 0;
        long numR = 0;
        
        while( remesa.hasNext() ) {
        
            try {
                
                numC = remesa.nextInt();
                importe = remesa.nextDouble();
                numR = remesa.nextLong();
                
                Cuenta cuenta = this.getCuenta(numC);
                if(cuenta != null) {
                
                    if(numR >= MIN_NUM_RECIBO && numR <= MAX_NUM_RECIBO) {
                    
                        c.retirar(importe);
                        s += numR + "\n";
                        
                    } else { System.err.println("Numero de recibo erroneo."); }
                
                } else { System.err.println("Cuenta erronea."); }
            
            }  catch (InputMismatchException e1) {
                
                System.err.println("Línea errónea.");
                
            } catch (IllegalArgumentException e2 ) {
            
                 System.err.println("Importe incorrecto");
                
            } finally {
            
                remesa.nextLine();
                
            }
            
        }
        
        return s;
        
    }
    
    
}
