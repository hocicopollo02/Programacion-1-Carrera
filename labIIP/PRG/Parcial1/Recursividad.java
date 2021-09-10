package Parcial1;

public class Recursividad {
    public static void main(String[] args) {

    }

    /*Precondición: b >= 0*/
    public static int mult(int a, int b) {

        if (b == 0) {

            return 0;

        } else {

            return a + mult(a, b-1);

        }

    }

    /* a / b
     * Precondición: a >= 0, b >= 0
     */
    public static int cociente (int a, int b) {

        if (a < b) {

            return 0;

        } else {

            return 1 + cociente(a - b, b); 

        }

    }

    public static int mult_rusa(int a, int b) {

        if (b == 0) {

            return 0;

        } else {

            if (b % 2 == 0) {

                return mult_rusa(2 * a, b / 2);

            } else {

                return a + mult_rusa(2 * a, b / 2);

            }

            /* int r = mult_rusa(2 * a, b / 2);
            if(b % 2 == 1) { return r + a; }
            else { return r; }*/

        }

    }

    /* a ^ b  donde a != 0 y b >= 0*/
    public static int potencia_rusa(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else {
            int r = potencia_rusa(a, b / 2) * potencia_rusa(a, b / 2);
            if(b % 2 == 0) { return r; }
            else { return r * a; }

        }
    }

    //Calcula el número de digitos de un número.
    public static int numDigitos(int n) {

        if (n < 10) { return 1; }

        else {

            return numDigitos(n / 10) + 1;

        }

    }

    public static int sumDigitos(int n) {

        if(n < 10) { return n; }

        else {

            return sumDigitos(n / 10) + (n % 10);

        }

    }

    public static int inverso(int n) {

        if (n / 10 == 0) {

            return n % 10;

        } else {

            int i = (int) Math.pow(10, (numDigitos(n) - 1));

            int r = (n % 10) * i;

            return r + inverso(n / 10);

        }

    }

    public static int decBin(int n) {

        if (n < 2) { return n; }

        else { return (n % 2) + (decBin(n / 2) * 10) ; }

    }

    public static void ordenDescendente(int n) {

        if (n == 1) { System.out.println(n); }

        else {

            System.out.println(n);

            ordenDescendente(n - 1);

        }

        /* 

        System.out.println(n);

        if (n > 1) { ordenDescendente(n - 1); }

         */

    }

    public static void ordenCreciente(int n) {

        if (n == 1) {

            System.out.println(n);

        } else {

            ordenCreciente(n - 1);

            System.out.println(n);

        }

    }
    
    /** Calcula de un número n al 0 y luego de vuelta hasta el número n */
    /* n >= 0. */
    public static void escribeRaro(int n) {

        if (n > 0) {

            System.out.print(n);

            escribeRaro(n - 1);

            System.out.print(n);

        }

        else { System.out.print(0); }
    }

    /** Calcula el inverso de un número .Ej: 123 --> 321 */
    public static void printInverso(int n) {

        /*
        if (n / 10 == 0) {

        System.out.println(n % 10);

        } else {

        int i = (int) Math.pow(10, (numDigitos(n) - 1));

        int r = (n % 10) * i;

        System.out.println(r + inverso(n / 10));

        }
         */

        if (n < 10) { System.out.print(n); }

        else { 

            System.out.print(n % 10);

            printInverso(n / 10);

        }

    }
    
    /** Devuelve por pantalla los elementos de un array desde la posición "pos" hasta el final*/
    public static void printElementos(int[] n, int pos) {
        
        if(pos < n.length) {
        
            System.out.println(n[pos]);
            
            printElementos(n, pos + 1);
        
        } 

    }
    
    /** Devuelve el número de elementos del array cuya longitud sea = n */
    
    // n > 0, s.length >= i >= 0, s != null
    public static int elementosLongitud(String[] s, int n, int i) {
        
        //Caso base
        if (i == s.length) {
        
            return 0;
        
        } else {
            //Caso general
            if(s[i].length() == n) {
            
                return 1 + elementosLongitud(s, n, i + 1);
                
            } else {
            
                return elementosLongitud(s, n, i + 1);
            
            }
        
        }
    
    }
    /** Devuelve true si el array que le pasamos está ordenado */
    public static boolean arrayOrdenado(double[] a, int i) {
        
        if (i == a.length - 1) { //Caso base: un array de tamaño 1 está ordenado por definición.
        
            return true;
            
        } else { //Caso general
        
            if (a[i] > a[i + 1]) { //Si un elemento es mayor que el elemento al que precede devuelve false.
            
                return false;
                
            } else { //Si no, continua la búsqueda aumentando el contador.
                
                return arrayOrdenado(a, i + 1);
            
            }
            
            /*
               return a[i] <= a[i + 1] && ordenado(a, i + 1);
               */
        
        }
    
    }
    
    /** Método que calcula dado un array de coordenadas Y de una recta, el punto del array donde 
     * la recta corta con el eje X. En el caso de que no corte o el array no esté ordenado, devolverá -1.*/
     //0 <= i <= a.length
    public static int puntoCorte(double[] a, int i) {
    
        if (i == a.length) {
        
            return -1;
        
        } else {
            
            /*
            if(arrayOrdenado(a, i) == false) { return -1; }
        
            else {
            
                if(a[i] == 0.0) {
                
                    return i;
                    
                } else {
                
                    return puntoCorte(a, i + 1);
                
                }
                
            } */
            
            
            if(a[i] == 0.0) { return i; }
            
            else if(a[i] > 0) { return -1; }
            
            else { return puntoCorte(a, i + 1); }
        
        }
    
    } 
    
    public static boolean multispoof(int[] a, int i, int p) {
    
        if (i == a.length || i >= a.length) {
        
            return p == 0? true : false;
        
        } else {
            
            int n = a.length - i;
            
            int casillas = n - 1;
            
            int x = a[i];
            
            int resto = p - x; 
            
            
            if(x > p ) { return false; }
            
            else if ( (casillas * 3) < resto) { return false; } 
            
            else { return multispoof(a, i + 1, resto); }
        
        }
    
    }
    
    //El parámetro i de inicio ha de ser a.length - 1
    public static int dec (int[] a, int i) {
    
        if(i == -1) {
        
            return 0;
        
        } else {
            
            
            return ( (int) Math.pow(2, i) * a[i] ) + dec(a, i - 1);
        
        }
    
    }
    
    
    public static int decJorge_asc(int[] a, int i) {
    
        if(i == a.length - 1) {
        
            return a[i];
        
        } else {
        
            return decJorge_asc(a, i + 1) * 2 + a[i];
        
        }
        
    }
    
    public static int decJorge_desc(int[] a, int i) {
    
        if (i < 0) {
        
            return 0; 
        
        }
        
        else {
            
            return decJorge_desc(a, i - 1) + ( (int) Math.pow(2, i) ) * a[i];
            
        }
    
    
    }
}

