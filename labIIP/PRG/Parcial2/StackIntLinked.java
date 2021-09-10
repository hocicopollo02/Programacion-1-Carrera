package Parcial2;

import java.util.NoSuchElementException;

public class StackIntLinked {
    
    private NodeInt top;
    private int size;
    
    public StackIntLinked() {
        top = null;
        size = 0;
    }
    
    public StackIntLinked(int[] a) {
        for(int i = a.length - 1; i >= 0; i--) {
            this.push(a[i]);
        }
    }
    
    //Apila el dato en la Stack
    public void push (int x) {
        top = new NodeInt(x, top);
        size++;
    }
    
    //Desapila el dato de la cima de la Stack y lo devuelve 
    public int pop() {
        if (size == 0) { throw new NoSuchElementException(); }
        int x = top.data;
        top = top.next;
        size --;
        return x;
    }
    
    //Devuelve (sin desapilarlo) el dato de la cima de la Stack
    public int peek() {
        if (size == 0) { throw new NoSuchElementException(); }
        return top.data;
    }
    
    //Devuelve true si la Stack está vacía y false en caso contrario
    public boolean isEmpty() {
        return top == null;
        // o return size == 0;
    }
    
    //Devuelve el tamaño del Stack
    public int size() {
        return size;
    }
}
