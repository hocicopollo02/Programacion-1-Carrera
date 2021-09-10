package Parcial1;

public class estudio1 {
   
    public static boolean capicua(int[] a, int k, int i, int f) {
    
        if(i >= f) {
        
            return true;
        
        } else {
            
                int diff = Math.abs(a[i] - a[f]);
                return diff < k && capicua(a, k - 1 , i + 1, f - 1);
           
        }
        
    }
    
    public static int longitud(String[] v, int n, int i) {
    
        if(i >= v.length) {
        
            return 0;
        
        } else {
        
            if( v[i].length() == n ) { return 1 + longitud(v, n, i + 1); } 
            
            else { return longitud(v, n, i + 1); }
        
        }
    
    
    } 
    
    public static int puntoCorte(double[] a, int i) {
    
        if(i >= a.length) {
        
            return -1;
            
        } else {
        
            if(a[i] == 0.0) { return i; }
            
            else if(a[i] > 0) { return -1; }
            
            else { return puntoCorte(a, i + 1); }
        
        }
    
    }
    
    public static int multiplos(int[] a, int x, int i) {
    
        if (i >= a.length) {
            
            return 0;
        
        } else {
        
            if(a[i] % x == 0) { return 1 + multiplos(a, x, i + 1); }
            
            else { return multiplos(a, x, i + 1); }
        
        }
    
    }
    
    private static void crearSucesion(int[] a, int n) {
    
        if(n < a.length) {
        
            a[n] = n * (n + 1) / 2;
            
            crearSucesion(a, n + 1);
        
        }
    
    }
    
    public static int[] crearSucesion(int n) {
    
        int[] a = new int[n];
        
        crearSucesion(a, n - 1);
        
        return a;
    
    } 
    
    public static int suma(int[] a, int x, int i) {
    
        if(i >= a.length) {
            
            return 0;
        
        } else {
        
            if(a[i] < x) { return a[i] + suma(a, x, i + 1); }
            else { return 0; }
        
        }
    
    }
    
    public static boolean fibo (int[] a, int i) {
    
        if(i == 0) {
        
            return a[0] == 0;
        
        } else if(i == 1) { 
            
            return a[1] == 1 && a[0] == 0;
        
        } else {
        
            return a[i] == a[i - 1] + a[i - 2] && fibo(a, i - 1); 
        
        }
    
    }
    
    /*Dado un array a de int con al menos un elemento, escribir un método recursivo que compruebe
     * si todos los valores del array son pares y están almacenados en orden creciente.*/
    public static boolean parCreciente(int[] a, int i) {
    
        if (i == a.length - 1) {
        
            return a[i] % 2 == 0;
        
        } else {
            
            return a[i] % 2 == 0 && a[i] <= a[i + 1] && parCreciente(a, i + 1);
        
        }
        
    }
    
    public static int sumaCapicua(int[] a, int i, int f) {
    
        if(i > f) {
        
            return 0;
        
        }  else if(i == f) {
        
            return a[i];
        
        } else {
        
            if(a[i] == a[f]) { return a[i] + a[f] + sumaCapicua(a, i + 1, f - 1); }
            
            else { return 0; } 
        
        }
    
    }
    
    public static void prefijosSumanMenosQue(int[] a, int x) {
        int suma = 0, i = 0;
        while (i < a.length) {
            suma += a[i]; 
            if (suma < x) {
                for (int k = 0; k <= i ; k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println("(suman " + suma + ").");
            }
            i++;
        }
    } 
    
    
}
