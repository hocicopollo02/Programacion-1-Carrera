package exam1;

/**
 * Clase MyString: Ejercicio Practica 2 - Parcial 1 Lab
 * 
 * @author PRG 
 * @version Curso 2020-21
 */
public class MyString {    
    /** No hay objetos de esta clase */
    private MyString() { }
    
    /**
     * Devuelve true si el char c es una vocal y,
     * en caso contrario, devuelve false.
     */
    private static boolean isVowel(char c) {
        final String VOWELS = "aeiouAEIOU";
        return VOWELS.indexOf(c) != -1;
    }
    
    /**
     * Devuelve el String que resulta de eliminar 
     * todas las vocales del String s.
     */
    public static String removeVowels(String s) {     
        
        
        if(s.length() == 1) {
        
            if(isVowel( s.charAt(0) ) == true ) { return " "; }
            else {  s.charAt(0) ;}
        
        } else {
            
            char a = s.charAt(0);
            String r = "";
            
            if(isVowel(a) == false) {
                
                r += a;
                return r + removeVowels( s.substring(1) );
            
            } else {
                
                r += " ";
                return r + removeVowels( s.substring(1) );
            
            }
            
            
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        /* COMPLETAR */
        return "";
    } 
    
    /** Muestra el resultado del metodo para un String ejemplo.
     *  Puedes probar con otros Strings.  
     */
    public static void main(String[] args) {
        String s = "Shine On Until Tomorrow, Let It Be";
        System.out.print(s + "\n" + removeVowels(s));
    }
}