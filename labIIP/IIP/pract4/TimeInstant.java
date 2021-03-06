package pract4;

/**
 * Clase TimeInstant. 
 *
 * Esta clase permite representar instantes o marcas de tiempo
 * (Timestamp) con detalle de horas y minutos. Así, la clase 
 * representa un instante de tiempo o momento del día, en este
 * caso, las horas y los minutos de un día cualquiera.
 * 
 * 
 *  @author IIP. Grado en Informatica. ETSINF, UPV 
 *  @version Curso 2020-21
 */
public class TimeInstant {
    // ATRIBUTOS:
    /** 
     *  Variable entera para almacenar las horas. 
     *  Debe pertenecer al rango [0..23].
     */
    
    private int hours;
    
    /** 
     *  Variable entera para almacenar los minutos. 
     *  Debe pertenecer al rango [0..59]. 
     */
    
    private int minutes;   
    
    // CONSTRUCTORES:
   
    /**
     *  Crea un TimeInstant con el valor de las horas y 
     *  los minutos que recibe como argumentos,iniHours
     *  y iniMinutes, respectivamente.
     *  Precondición: 0 <= iniHours < 24, 0 <= iniMinutes < 60.
     */
   
    public TimeInstant (int iniHours, int iniMinutes) {
        this.hours = iniHours;
        this.minutes = iniMinutes;
    }
        
    /**
     * Crea un TimeInstant con el valor del instante
     * actual UTC (tiempo universal coordinado).
     */
    
    public TimeInstant () {
        long tMinTotal = System.currentTimeMillis() / (60 * 1000);
        int tMinCurrent = (int) (tMinTotal % (24 * 60));
        this.hours = tMinCurrent / (60);
        this.minutes = tMinCurrent % 60;
    }
   
    // CONSULTORES Y MODIFICADORES:
    
    /** Devuelve las horas del TimeInstant. */ 
    public int getHours (){
        return this.hours;
    }
    
    /** Devuelve los minutos del TimeInstant. */
    public int getMinutes() {
        return this.minutes;
    }
    
    /** Actualiza las horas del TimeInstant. */ 
    public void setHours(int hh) {
        this.hours = hh;
    }
   
    /** Actualiza los minutos del TimeInstant. */ 
    public void setMinutes(int mm) {
        this.minutes = mm;
    }
   
    // OTROS MÉTODOS:
    /** Devuelve el TimeInstant en el formato "hh:mm". */
    public String toString () {
        String horas = "0" + this.hours;
        String minutos = "0" + this.minutes;
        int longitudHoras = horas.length();
        int posHoras = longitudHoras - 2;
        int longitudMinutos = minutos.length();
        int posMinutos = longitudMinutos - 2;
        
        horas = horas.substring(posHoras);
        minutos = minutos.substring(posMinutos);
        
        return horas + ":" + minutos;
    }
   
    /** Devuelve true si "o" es un objeto de la clase
     *  TimeInstant y sus horas y minutos coinciden con
     *  los del objeto en curso this. 
     */
    public boolean equals(Object o) {
        return o instanceof TimeInstant && this.hours == ((TimeInstant)o).hours && this.minutes == ((TimeInstant)o).minutes;
    }
    
    /** Devuelve el número de minutos transcurridos desde las 00:00 
     *  hasta el instante representado por this.
     */
    public int toMinutes () {
        return (this.hours * 60) + this.minutes;
    }
    
    /** Compara cronológicamente el instante del objeto en curso con 
     *  el del objeto de la clase TimeInstant referenciado por tInstant.
     *  El resultado es negativo si this es anterior a tInstant,
     *  cero si son iguales, y positivo si this es posterior a tInstant. 
     *  Se calcula como la resta entre la conversión a minutos
     *  de ambos objetos.
     */
    public int compareTo (TimeInstant tInstant) {
        return toMinutes() - tInstant.toMinutes();
    }

    // ACTIVIDAD EXTRA:
    /** Devuelve un TimeInstant a partir de la descripción 
     *  textual (String) en formato "hh:mm".
     */
    public static TimeInstant valueOf(String textInstant) {
        char charH1 = textInstant.charAt(0);
        System.out.println(charH1);
        char charH2 = textInstant.charAt(1);
        System.out.println(charH2);
        char charM1 = textInstant.charAt(3);
        System.out.println(charM1);
        char charM2 = textInstant.charAt(4);
        System.out.println(charM2);
        
        int x1 = 10 * (charH1 - '0');
        int x2 = charH2 - '0';
        int x = x1 +x2;
        int y1 = 10 * (charM1 - '0');
        int y2 = charM2 - '0';
        int y = y1 +y2;
        
        TimeInstant t = new TimeInstant(x, y);
        
        return t; 
    }
  
}
