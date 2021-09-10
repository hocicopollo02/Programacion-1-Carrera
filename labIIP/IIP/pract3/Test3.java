    package pract3;

import java.util.*;

public class Test3 { 
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Lectura de teclado de una hora.");
        System.out.print("   -> Introduzca las horas (entre 0 y 23): ");
        int h = kbd.nextInt();
        System.out.print("   -> Introduzca los minutos (entre 0 y 59): ");
        int m = kbd.nextInt();
        
        String horas = "0" + h;
        String minutos = "0" + m;
        int longitudHoras = horas.length();
        int posHoras = longitudHoras - 2;
        int longitudMinutos = minutos.length();
        int posMinutos = longitudMinutos - 2;
        
        horas = horas.substring(posHoras);
        minutos = minutos.substring(posMinutos);
        String horaIntroducida = horas + ":" + minutos;
        
        System.out.println("Hora introducida: " + horaIntroducida);
        horaActual(h, m);
        System.out.println("¿Es la hora introducida capicúa? " + isCapicua(horaIntroducida));
    }
    
    public static void horaActual (int h, int m) {
        long horaActual = System.currentTimeMillis();
        horaActual = horaActual / 60000;
        int minutosActuales = (int) (horaActual % (24 * 60));
        int hora = (minutosActuales / 60);
        int minuto = minutosActuales % 60;
        
        String horaAct = "0" + hora;
        String horaEsp = "0" + (hora + 1);
        String minutoAct = "0" + minuto;
        int longitudHora = horaAct.length();
        int posHora = longitudHora - 2;
        int longitudMinuto = minutoAct.length();
        int posMinuto = longitudMinuto - 2;
        int longitudHoraEsp = horaEsp.length();
        int posHoraEsp = longitudHoraEsp - 2;
        
        horaAct = horaAct.substring(posHora);
        minutoAct = minutoAct.substring(posMinuto);   
        horaEsp = horaEsp.substring(posHoraEsp);
        
        System.out.println("Hora actual UTC: " + horaAct + ":" + minutoAct);
        System.out.println("Hora actual en España: " + horaEsp + ":" + minutoAct);
        
        int dif = dif(h, m, hora,minuto);
        int hDif = dif / 60;
        int mDif = dif % 60;
        System.out.println("La  diferencia entre la hora introducida y la hora actual UTC es de: " + dif + " minutos(" + hDif + " h. y " + mDif + " min.)");
        
        boolean anterior = (h < hora) || (h == hora && m < minuto);
        System.out.println("¿Es anterior la hora introducida a la hora actual UTC? " + anterior);
        
    } 
    
    public static int dif(int hora, int minutos, int horaAct, int minutoAct) {
        return Math.abs(((hora * 60) + minutos)- ((horaAct * 60) + minutoAct));
    }
    public static boolean isCapicua(String s) {
        return s.charAt(0) == s.charAt(4) && s.charAt(1) == s.charAt(3);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
