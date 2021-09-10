package exam1;

/**
 * Clase TimeInstant: permite representar instantes o marcas de tiempo
 * (Timestamp) con detalle de horas y minutos. Asi, esta clase representa 
 * el momento que define un instante de tiempo, en este caso, las horas y 
 * los minutos de un dia cualquiera.
 * 
 *  @author IIP 
 *  @version Curso 2020-21
 */
public class TimeInstant {
    /** 
     *  Variable entera para almacenar el atributo horas. 
     *  Debe pertenecer al rango [0..23].
     */
    private int hours;
    /** 
     *  Variable entera para almacenar el atributo minutos. 
     *  Debe pertenecer al rango [0..59]. 
     */
    private int minutes;
    
    /**
     *  Dada una cantidad de minutos m >= 0, transcurridos desde 
     *  las 00:00, crea un TimeInstant con el valor de las horas 
     *  y los minutos que representan dicha cantidad de minutos.  
     */
    public TimeInstant(int m) {
        this.hours = m / 60;
        this.minutes = m % 60;
    }
    
    /**
     *  Crea un TimeInstant con el valor de las horas y 
     *  los minutos que recibe como argumentos, iniHours y 
     *  iniMinutes, respectivamente.
     *  Precondicion: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */
    public TimeInstant(int iniHours, int iniMinutes) {
        this.hours = iniHours;
        this.minutes = iniMinutes;
    }
    
    /**
     * Crea un TimeInstant con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    public TimeInstant() { 
        long tMinTotal = System.currentTimeMillis() / (60 * 1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));        
        hours = tMinCurrent / 60;        
        minutes = tMinCurrent % 60; 
    }
   
    /** Devuelve el TimeInstant this en el formato "hh:mm". */
    public String toString() {
        String hh = "0" + this.hours;
        hh = hh.substring(hh.length() - 2);
        String mm = "0" + this.minutes;
        mm = mm.substring(mm.length() - 2);
        return hh + ":" + mm;
    }   
}
