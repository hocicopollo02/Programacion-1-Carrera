package Parcial2;

public class NodeChar {
    
    public char data;
    public NodeChar next;
    
    /** Constructor parcial */
    public NodeChar(char d) {
        
        this.data = d;
        this.next = null;
        
    }
    
    /** Constructor total */
    public NodeChar(char d, NodeChar s) {
        
        this.data = d;
        this.next = s;
        
    }
    
}
