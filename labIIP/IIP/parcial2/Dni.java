package parcial2;
import java.util.Scanner;
import java.lang.*;

public class Dni{
    
    /** Método main dentro de la clase Dni que solicite al usuario su DNI, a continuación llame 
     *  al método filtroLongitud, y si la llamada se evalúa a true, lo muestre por pantalla 
     *  con el siguiente formato "El DNI introducido es ..."; 
     *  si  la llamada ha devuelto false se debe mostrar el siguiente mensaje por pantalla: "Longitud incorrecta".*/
     
    public static void main(String[] argumentos) {
        
        boolean stop = false;
        int reps = 0;
        String v = "";
        Scanner kbd = new Scanner(System.in);
        
        while(stop == false) {
            
            System.out.print("¿Cuál es su DNI? ");
            String dni = kbd.next();
            
            if (filtroLetraCorrecta(dni) == false) { 
                
                System.out.println("Error 404");
                reps += 1;
                
            }else{ 
                
                System.out.println("El DNI introducido es el: " + dni);
                
                switch(reps) {
                    
                    case 0: v+= "No se ha repetido el bucle"; break;
                    case 1: v+= "Se ha repetido el bucle " + reps + " vez"; break;
                    default: v+= "Se ha repetido el bucle " + reps + " veces"; break;
                    
                }
                
                System.out.println(v);
                stop = true;
                
            }
            
        }
        
    }   
    
    /** Método llamado filtroLongitud dentro de la clase Dni que, tomando como dato de entrada una cadena de texto
     *  que representa el valor de un DNI, compruebe que dicha cadena tiene 9 caracteres, devolviendo true en ese caso;
     *  en caso contrario (la cadena recibida no tiene 9 caracteres), entonces el método debe devolver false. */
     
    public static boolean filtroLongitud(String dni) {
        
        return dni.length() == 9 ? true : false;
        
    }
    
    /** Método llamado filtroDigitosLetra dentro de la clase Dni que, tomando como dato de entrada una cadena de texto
     *  que representa el valor de un DNI, compruebe en primer lugar si dicha cadena tiene 9 caracteres, y entonces sólo 
     *  en ese caso, deberá obtener por un lado la subcadena con los 8 primeros caracteres (String), y por otro, 
     *  el último carácter (char); a continuación deberá comprobar que efectivamente la subcadena está formada íntegramente
     *  por dígitos y que el último carácter es una letra mayúscula. 
     *  Si el método pasa todos los filtros, devolverá true; en caso contrario, entonces el método debe devolver false.*/
     
    public static boolean filtroDigitosLetra(String dni) {
        
        //Declara una variable de tipo boolean a la que llamaremos correcto. Esta variable la usaremos a modo de bandera.
        //Inicializa la variable correcto a true (inicialmente supondremos que el DNI recibido es correcto)
        boolean correcto = true;
        /* En caso de que la longitud del DNI sea distinta de 9, entonces:
           1. Mostrar el texto "Longitud incorrecta"
           2. Pon la variable correcto a false
        */
        if (filtroLongitud(dni) == false) {
            
            System.out.println("Longitud incorrecta"); 
            correcto = false;
            
        } else {
            /* En caso contrario (es decir, sabemos con seguridad que el DNI recibido tiene 9 caracteres):
                 1.Obtén el substring formado por los ocho primeros caracteres del DNI.
                 2.Obtén el último carácter del DNI. 
           */
          /* Si la subcadena con los ocho primeros caracteres no está formada íntegramente por dígitos, entonces: 
               1. Muestra el mensaje "Formato incorrecto: los 8 primeros caracteres deben ser números''
               2. Pon la variable correcto a falso  */
               /* Si el último carácter no es una letra mayúscula, entonces:
               1. Muestra el mensaje "Formato incorrecto: el último carácter debe ser una letra"
               2. Pon la variable correcto a false
            */
            char letra = dni.charAt(8);
            String parteNumerica = dni.substring (0,8);
            
            if(isInt(parteNumerica) == false) {
                
                System.out.println("Formato incorrecto: los 8 primeros caracteres deben ser números");
                correcto = false;
                
            } else if (Character.isUpperCase(letra) == false) {
                
                System.out.println("Formato incorrecto: el último caracter debe ser una letra mayúscula ");
                correcto = false;
                
            }
            
        }
        
        return correcto;
        
    }
    
    /** 
    Convierte la parte numérica del DNI a un entero mediante Integer.parseInt
    Obtén el resto de dividir ese número por 23
    Declara una variable String con el siguiente contenido "TRWAGMYFPDXBNJZSQVHLCKE"
    Emplea el método charAt para obtener, dentro de esta cadena, el carácter que ocupa la 
    posición correspondiente al cálculo del resto obtenido anteriormente
    Estructura if: Si la letra calculada no coincide con la introducida por el usuario, entonces:
        1. Muestra el mensaje "DNI incorrecto: la letra de control del número ... debería ser la ..."
        2. Pone la variable correcto a false
    */
    
    public static boolean filtroLetraCorrecta(String dni) {
        
        if (filtroDigitosLetra(dni) == true) {
            
            //int numero = Integer.parseInt(dni.substring(0,8)) % 23;
            int numero = parseInt(dni.substring(0,8)) % 23;
            String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
            char letraTabla = tabla.charAt(numero);
            
            if (dni.charAt(8) == letraTabla) { 
                return true; 
            } else { 
                System.out.println("DNI incorrecto: la letra de control del número " +
                                    numero + " debería ser la " + letraTabla );
                return false; 
            }
        } else { return false; }
        
    }
    
    /** Convierte la parte numérica del String a un int */
    
    public static int parseInt(String s) {
        
        int expo = 0, r = 0, num = 0;
        
        for (int i = 0; i < s.length();) {
            
            expo = s.length() - 1 - i;
            
            num = s.charAt(i) - '0';
            
            r += num * ((int) Math.pow(10, expo));
            
            i++;
            
        }
        
        return r;
      
    }
    
    /** Devuelve true si el String introducido está compuesto únicamente por números enteros */
    
    public static boolean isInt(String s) {
        
        boolean r = true;
        int i = 0;
        /*
        while (i < s.length()) {
            
            char a = s.charAt(i);
            
            boolean x = a >= '0' && a <= '9';
            
            if (x) { r = true; } 
            else { r = false; }
            
            i++;
        }
        
        //return r;
        */
        while ((i < s.length()) && (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
        
            i++;
        
        }
        
        if (i < s.length()) { return false; } 
        else { return true; }
        
    }
    
}