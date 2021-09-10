package Parcial2;


public class NodeInt {
    
    public int data;
    public NodeInt next;
    
    /** Constructor parcial */
    public NodeInt(int d) {
        
        this.data = d;
        this.next = null;
        
    }
    
    /** Constructor total */
    public NodeInt(int d, NodeInt s) {
        
        this.data = d;
        this.next = s;
        
    }
    
}
