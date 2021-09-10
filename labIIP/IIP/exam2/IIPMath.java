package exam2;

/**
 * Clase IIPMath: clase de utilidades que implementa
 * algunas operaciones matematicas.
 * 
 * @author Parcial 2 - Ejercicio 1 
 * @version IIP - Curso 2020-21
 */
public class IIPMath {
    /** No se pueden crear objetos de este tipo. */
    private IIPMath() { }

    /** Devuelve el numero de terminos a sumar de la serie:
     *     a_1 = 2 
     *     a_i = a_(i-1) + 5 * i, i > 1
     *  para que dicha suma sea mayor o igual que value.
     *  PRECONDICION: value >= 2
     */
    public static int numTerms(int value) {

        int s = 2;
        int i = 1;
        
        boolean c = true;

        while(c) {
            
            s += 5 * i;
            
            if(s >= value) { c = false; }
            
            i++;
        }
        
        return i;

    }
}