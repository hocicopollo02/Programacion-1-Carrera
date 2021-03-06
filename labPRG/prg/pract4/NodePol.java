package pract4;
/**
 * Clase NodePol: representacion de una estructura que asocia 
 * un dato (de tipo Polygon) y el enlace al dato siguiente.
 * Se usa para implementar secuencias enlazadas de poligonos.
 *
 * @author PRG - Practica 4
 * @version Curso 2020/21
 */
public class NodePol {
    
    Polygon data;
    NodePol next;
    
    
    /**
     * Crea un NodePol con dato p y que no tiene siguiente.
     * @param p Polygon, dato del nuevo nodo.
     */
    public NodePol(Polygon p) {
        this.data = p; 
        this.next = null;
        // o de manera equivalente: this(p, null); 
    }
    
    /**
     * Crea un NodePol con dato p, enlazado a un nodo preexistente n. 
     * @param p Polygon, dato del nuevo nodo.
     * @param n NodePol, nodo siguiente al que enlazar el nuevo nodo.
     */
    public NodePol(Polygon p, NodePol n) {
        this.data = p;
        this.next = n;    
    }
}