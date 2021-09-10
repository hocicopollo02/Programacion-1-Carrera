package exam2Code;

/**
 * Clase Pregunta3. 
 * @author IIP - Parcial 2
 * @version 27/01/21
 */
public class Pregunta3 {
    private Pregunta3() { }   // No hay objetos de esta clase
    
    /** Devuelve el numero de iteraciones necesarias para que la diferencia
     *  en valor absoluto entre el valor de Math.PI y el valor de pi calculado
     *  usando el desarrollo en serie de Leibniz sea menor o igual que un epsilon 
     *  (double) dado.
     *  Precondicion: 0 <= epsilon < 1.
     */
    public static int iteraciones (double epsilon) {
        //inicializamos la variable contador.
        int it = 0;
        double pi = 4.0;
        //La condicion de nuestro bucle es que itere mientras que no se cumpla.
        boolean c = true;
        
        double diferencia = 0.0;
        
        while(c) {
            
            pi = Math.pow(-1, it) * (4 / (2 * it + 1));
            diferencia = pi - Math.PI;
            it++;
            
            if(Math.abs(diferencia) <= epsilon) {
                c = false;
            }
            
        }
        
        return it;
    } 
    
    
}
