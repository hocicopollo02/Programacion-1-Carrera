package Parcial2.examenes;

public class examen_15_16 {

    public static void m1(String[] lS) {

        int k = 0;
        boolean fin = false;
        try{
            while (!fin) {

                System.out.print("Posicion " + k + ": ");
                try{
                    System.out.println(lS[k].length() + " caracteres");
                } catch(NullPointerException e1) {

                    System.out.println("0 caracteres");

                }
                k++;

            }
            
        }catch (ArrayIndexOutOfBoundsException e2) {

            System.out.println("Posicion" + k + ": "+ "Inexistente. Fin del array");

        }

    }
    
    public int desencolar(int x) {
    
        if(this.talla == 0) { throw new NoSuchElementException("Cola vacia"); }
        
        NodoInt aux = this.primero, ant = null;
        
        while (aux != null & aux.data != x) {
        
            ant = aux;
            aux = aux.next;
            
        }
        
        if(aux != null) {
        
            if(this.primero == aux) { this.primero = aux.next;}
            else { ant.next = aux.next; }
            
            if(aux == this.ultimo) { this.ultimo = ant; }
            this.talla--;
            return x;
            
        } else { throw new NoSuchElementException(x + " no se ha encontrado"); }
        
    }

}
