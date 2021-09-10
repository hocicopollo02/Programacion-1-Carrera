package Parcial2;

public class NodeStudent {
    
    public String name;
    public double grade;
    public NodeStudent next;
    
    /** Constructor parcial */
    public NodeStudent(String nombre, double nota) {
        
        this.name = nombre;
        this.grade = nota;
        this.next = null;
    
    }
    
    /** Constructor total */
    public NodeStudent(String nombre, double nota, NodeStudent s) {
    
        this.name = nombre;
        this.grade = nota;
        this.next = s;
    
    }
    
    public int compareTo(NodeStudent o) { return this.name.compareTo(o.name); }
    
}
