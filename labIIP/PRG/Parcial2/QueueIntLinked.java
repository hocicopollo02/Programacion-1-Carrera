package Parcial2;

import java.util.NoSuchElementException;
public class QueueIntLinked {
    private NodeInt first, last;
    private int size;
    
     /**  Método add con el parametro first*/
    public QueueIntLinked() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    /**  Método add sin el parametro first*/
    public QueueIntLinked(int x) {
        this.last = null;
        this.size = 0;
    }

    public void print() {

        
        
    }
    
    /**  Método add con el parametro first*/
    public void add1(int x) {
        NodeInt nuevo = new NodeInt(x);
        if (last != null) { last.next = nuevo; }
        else { first = nuevo; }
        last = nuevo;
        size++;
    }
    
    /**  Método add sin el parametro first*/
    public void add2(int x) {
        
        NodeInt nuevo = new NodeInt(x);
        if (this.last != null) { 
            
            nuevo.next = this.last.next; 
            this.last.next = nuevo;
        
        }
        else { nuevo.next = nuevo; } 
        this.last = nuevo;
        this.size++;
        
    }
    
    
    /**  Método add sin el parametro first*/
    public int remove1() {
        if (size == 0) { throw new NoSuchElementException(); }
        int x = first.data;
        first = first.next;
        if (first == null) { last = null; }
        size--;
        return x;
    }
    
    /**  Método remove sin el parametro first*/
    public int remove2() {
        if (this.size == 0) { throw new NoSuchElementException(); }
        int x = this.last.next.data;
        this.last.next = this.last.next.next;
        //En el caso de haber borrado el unico elemento != null.
        if(this.size == 1) { this.last = null; }
        this.size--;
        return x;
    }
    
    /** Método element con el parámetro first */
    public int element1() {
        if (this.size == 0) { throw new NoSuchElementException(); } 
        return this.last.next.data; 
    }
    
    /** Método element sin el parámetro first */
    public int element2() {
        if (this.size == 0) { throw new NoSuchElementException(); } 
        return this.last.next.data; 
    }

    public boolean isEmpty() { 
        return this.last == null; 
    }

    public int size() { 
        return this.size; 
    }
    
    //La cola no contiene datos repetidos.
    /** El método elimina el nodo que contiene el dato x */
    public boolean eliminarX(int x) {
        
        NodeInt aux = first, ant = null;
        
        if(this.size == 0) { return false; }
    
        while(aux.data != x && aux != null) { 
            
            ant = aux;
            
            aux = aux.next;
        
        }
        
        if(aux == null) { return false; }
        else { 
            
            if(aux == first || ant == null /* Son equivalentes */) { //Borrado en cabeza
                
                first = first.next;
                
            
            } else{ //Borrado en cualquier otra posicion
                
                ant.next = aux.next;
                
            }
            
            if(aux == last) {
            
                last = ant;
            
            }
            
            this.size--;
            
            return true;
        
        }
    
    }

}