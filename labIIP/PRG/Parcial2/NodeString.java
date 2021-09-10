package Parcial2;


public class NodeString {
    
    public String data;
    public NodeString next;
    
    /** Constructor parcial */
    public NodeString(String d) {
        
        this.data = d;
        this.next = null;
        
    }
    
    /** Constructor total */
    public NodeString(String d, NodeString s) {
        
        this.data = d;
        this.next = s;
        
    }
    
}