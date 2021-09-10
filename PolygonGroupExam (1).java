package pract4;

/**
 * Clase PolygonGroupExam. Grupo de poligonos en el plano.
 * Los poligonos estan en orden segun la secuencia en que se anyaden
 * al grupo, de manera que se considera que cada poligono esta mas 
 * arriba en el grupo que los poligonos anteriores, o dicho de otro 
 * modo, se superpone a los anteriores. 
 * Se supone que el orden del grupo da la secuencia en que se dibujan
 * los poligonos, de manera que cada uno se dibuja por encima de los
 * anteriores, superponiendose a aquellos con los que solape.
 *  
 * La manera de seleccionar un poligono es dando un punto visible 
 * del poligono, es decir, dando un punto que no pertenezca
 * a los poligonos que aparecen superpuestos en el dibujo.
 *
 * @author PRG
 * @version Curso 2020-21
 */
public class PolygonGroupExam {
    private NodePol front, back;
    private int size;

    /** Crea un grupo de 0 poligonos. */
    public PolygonGroupExam() {
        front = null;
        back = null;
        size = 0;
    }

    /** Anyade al grupo, arriba del todo, un poligono dado. 
     *  @param pol Polygon, el poligono.
     */
    public void add(Polygon pol) {  
        front = new NodePol(pol, front);
        if (back == null) { back = front; }
        size++;
    }

    /** Devuelve el numero de poligonos del grupo,  
     *  esto es, la talla del grupo.
     *  return int, la talla.
     */
    public int getSize() { return size; }

    /** Devuelve la referencia al nodo con el poligono  
     *  del frente del grupo.
     *  return NodePol, nodo con el poligono del frente.
     */
    public NodePol getFront() { return front; }

    /** Devuelve la referencia al nodo con el poligono 
     *  del fondo del grupo.
     *  return NodePol, nodo con el poligono del fondo.
     */
    public NodePol getBack() { return back; }

    /** Devuelve un array con la secuencia de poligonos del grupo, 
     *  por orden desde el de mas abajo al de mas arriba.
     *  @return Polygon[], el array.
     */
    public Polygon[] toArray() {
        Polygon[] result = new Polygon[size];
        NodePol aux = front;
        for (int i = size - 1; i >= 0; i--) {           
            result[i] = aux.data;
            aux = aux.next;
        }
        return result;
    } 

    /** Busca en el grupo el poligono que ocupa la posicion pos. 
     *  Devuelve un array de NodePol tal que:
     *  - la componente 1 es el nodo con el poligono que ocupa la posicion pos 
     *    (null si dicho nodo no existe)  
     *  - la componente 0 es el nodo anterior, esto es, el nodo con el poligono
     *    que ocupa la pocion pos - 1 (null si no esta definido).
     *  @param pos int, la posicion.   
     *  @return NodePol, el resultado.
     */
    private NodePol[] searchPos(int pos) {
        NodePol aux = front, prevAux = null;
        int k = 0;
        while (aux != null && k < pos) {
            prevAux = aux;
            aux = aux.next;
            k++;
        }
        NodePol[] s = new NodePol[2];
        if (pos >= 0 && pos <= size - 1 && k == pos) { s[0] = prevAux; s[1] = aux; }
        else { s[0] = null; s[1] = null; }
        return s;
    }

    /** Elimina del grupo el poligono que ocupa la posicion pos, si 0 <= pos <= size - 1. 
     *  El metodo no hace nada si pos no es una posicion valida.
     *  Se supone que los poligonos ocupan las posiciones 0 a size - 1 numerados desde 
     *  el del frente hasta el del fondo.
     *  @param pos int, la posicion del poligono a eliminar.
     */   
    public void removePos(int pos) {
        if (pos >= 0 && pos <= this.size - 1 ) {
            NodePol[] n = searchPos(pos);
            NodePol r = n[1], ant_r = n[0];

            if(n != null) {

                if(n[1] == this.front) { 
                    
                    this.front = this.front.next; 
                
                }else{
                    
                    n[0].next = n[1].next; 
                
                } 

                if(n[1] == this.back) {

                    this.back = n[0];

                }

                this.size--;

            }

        }
    }

}
