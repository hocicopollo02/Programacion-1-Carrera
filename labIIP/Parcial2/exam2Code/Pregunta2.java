package exam2Code;

/**
 * Clase Pregunta2. 
 * @author IIP - Parcial 2
 * @version 27/01/21
 */
public class Pregunta2 {
    private Pregunta2() { }   // No hay objetos de esta clase
    
    /** Devuelve el numero de parejas de dos arrays enteros a y b 
     *  que suman cero (a[i] + b[j] = 0).
     *  Precondicion: a.length > 0, b.length > 0     y puede ser 
     *  que a.length != b.length. 
     */
    public static int parejas(int[] a, int[] b) {
        
        //Inicializamos una variable que nos servirá de contador.
        int res = 0;
        
        /*Para encontrar la condición, habrá que anidar el bucle. Es decir, para cada elemento a[i] habrá que iterar a
        lo largo del bucle con b[j] de forma que si se cumple la condicion incrementamos nuestra variable res. */
        for(int i = 0; i < a.length; i++) {
            
            for(int j = 0; j < b.length; j++) {
                
                //La condicion que se nos pide es que un par de elementos resulte en 0.
                boolean c = a[i] + b[j] == 0;
                
                //Si c es verdadero, entonces incrementamos en uno el valor del contador.
                if (c) { res++; }
                
            }
            
        }
        
        return res;
        
    }    
    
         
}
