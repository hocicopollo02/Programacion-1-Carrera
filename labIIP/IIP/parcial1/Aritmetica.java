package parcial1;

public class Aritmetica {
    public static double redondear (double n, int exp) {
        n *= Math.pow(10, exp);
        n = Math.round(n);
        n /= Math.pow(10, exp);
        return n;
    }
    
    public static double p01(int a, int b, int c) {
        int dentroRaiz = b * b - 4 * a * c;
        double raiz = Math.sqrt(dentroRaiz);
        double numerador = raiz - b;
        int denominador = 2 * a;
        double resultado = numerador / denominador;
        
        return resultado;
    }
    
    public static double p02(int a, int b, int c) {
        int dentroRaiz = b * b - 4 * a * c;
        double raiz = Math.sqrt(dentroRaiz);
        double numerador = - raiz - b;
        int denominador = 2 * a;
        double resultado = numerador / denominador;
        
        return resultado;
    }  
    
    public static double area (double radio) {
        double areaEsfera = 4 * Math.PI * Math.pow(radio, 2);
        
        return areaEsfera;
    }
    
    public static double volumenRadio (double radio) {
        double volumen;
        volumen = 4.0 / 3 * Math.PI * Math.pow(radio, 3);
        
        return volumen;
    
    }
    
      public static double volumenArea (double area) {
        double radio;
        double denom = 4 * Math.PI;
        radio = Math.sqrt(area / denom);
        double volumen = 4.0 / 3 * Math.PI * Math.pow(radio, 3);
        
        return volumen;
        
    }
    
     public static double c2f (double tempC) {
        double tempF;
        double conversion = (tempC * 9) / 5;
        tempF = conversion + 32;
        
        return tempF;
    }
    
    public static double f2c (double tempF) {
        double tempC;
        double conv = (tempF - 32) * 5;
        tempC = conv / 9;
        
        return tempC;
    }
    
    
    public static double masIVA (double precioSinIVA, int IVA) {
        double precio;
        precio = precioSinIVA + ((precioSinIVA / 100) * IVA);
        precio = redondear(precio, 2);
        
        return precio;
    }
    
    public static int duracion (int horaSal, int minSal, int horaLleg, int minLleg) {
        int horaDuracion = horaLleg - horaSal, minDuracion = minLleg - minSal ;
      
        horaDuracion *= 60;     
        
        int duracionMin = minLleg - minSal;
        
        int duracione = horaDuracion + duracionMin;
        return duracione;
    }
    
    public static double caminante (int alturaEnCM) {
        
        return 2.0 * Math.PI * alturaEnCM / 100;
    }
    
     
}
