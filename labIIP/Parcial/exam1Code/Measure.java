package exam1Code;

/**
 * Clase Measure: medida del ruido en un instante determinado en 
 * una estacion de medicion de ruido en via publica.
 *
 * @author IIP
 * @version Curso 2020/21
 */
public class Measure {    
    //a.(0.5 puntos) Tres atributos estaticos, publicos y constantes, siendo: 
    //  - dos de tipo double, para representar mediante un codigo numerico el ruido 
    //  maximo permitido, tanto para el periodo diurno como para el periodo nocturno.
    //  Sus identificadores y valores son, respectivamente:
    //  MAX_DAY_TIME, con valor 65.0; MAX_NIGHT_TIME, con valor 30.0.
    //  - uno de tipo String, para representar el nombre por defecto de una estacion 
    //  de medida. Su identificador y valor es: DEFAULT_STATION, con valor "AYUNTAMIENTO".
    public static final double MAX_DAY_TIME = 65.0, MAX_NIGHT_TIME = 30.0;
    public static final String DEFAULT_STATION = "AYUNTAMIENTO";
    
    
    //b.(0.5 puntos) Cuatro atributos de instancia y privados, para representar los  
    //  elementos asociados a una Measure. Sus identificadores (y tipos Java) son: 
    //  instant (TimeInstant); noise (double); station (String); period (int).
    private TimeInstant instant;
    private double noise;
    private String station;
    private int period;
    
   
    // c.(0.75 puntos) Metodo constructor con parametros, que crea una Measure 
    //   tomada en la estacion e, en el periodo correspondiente al instante de tiempo t 
    //   y con nivel de ruido r. 
    //   Se supone como Precondicion que los valores de estos parametros son correctos.
    public Measure(TimeInstant t, double r, String e) {
        this.station = e;
        this.noise = r;
        this.period = t.getPeriod();
    }
        
    
    //d.(0.75 puntos) Metodo constructor por defecto, que crea una Measure 
    //  tomada en la estacion "AYUNTAMIENTO", en el periodo correspondiente 
    //  al instante de tiempo UTC actual y cuyo ruido es un valor aleatorio en 
    //  el intervalo [20.0, 201.0[.
    //  Importante: para obtener el valor aleatorio del ruido debes usar el 
    //  metodo privado aleatory que se te proporciona en la clase.  
    public Measure() {
        this.station = DEFAULT_STATION;
        TimeInstant p = new TimeInstant();
        this.period = p.getPeriod();
        this.noise = aleatory(20.0, 200.0);
    }
        
    
    /** Genera un valor real aleatorio en [inf, sup + 1[, siendo inf <= sup. */
    private double aleatory(double inf, double sup) {
        return Math.random() * (sup - inf + 1) + inf;
    }
    
    //e.(0.5 puntos) Metodos consultor y modificador del atributo noise. 
    //  Se supone como Precondicion que el valor del parametro del modificador es correcto. 
    public double getNoise () {return noise;} 
    public void setNoise(double n) {noise = n;}
    
    
        
    //f.(1.25 puntos) Metodo equals, que sobrescribe el de Object y comprueba si 
    //  una Measure (this) es igual a otra, en concreto, si ambas se han producido 
    //  en el mismo instante y tienen el mismo nivel de ruido, con independencia 
    //  de la estacion en la que se tome la medida. 
    public boolean equals(Object  other) {
        return other instanceof Measure 
                && this.instant.equals(((Measure) other).instant)
                && this.noise == ((Measure) other).noise;
    }     

    
    //g.(0.75 puntos) Metodo exceedsMax, que devuelve true si la medida supera 
    //  el maximo permitido en el periodo en el que se realizo dicha medida; 
    //  y false en caso contrario. 
    public boolean exceedsMax() {
        boolean x = MAX_DAY_TIME < this.noise  && this.instant.getPeriod() == TimeInstant.DAY_TIME;
        boolean y = MAX_NIGHT_TIME < this.noise && this.instant.getPeriod() == TimeInstant.NIGHT_TIME;
        return x || y;
    }     

 
    //h.(1 punto) Metodo toString, que sobrescribe el de Object y que devuelve 
    //  la descripcion de la medida, es decir, el instante, la estacion de medida 
    //  y el nivel de ruido medido, redondeado este valor a dos decimales.
    //  Por ejemplo, para una medicion en la estacion del Ayuntamiento a las 10:30h, 
    //  con un nivel de ruido obtenido de 23.67825 dBA, el metodo devolvera:
    //  "10:30 AYUNTAMIENTO 23.68 dBA"
    public String toString() {
        double noiseRedondeado = Math.round(this.noise * Math.pow(10, 2)) / Math.pow(10, 2);
        String s = this.instant.toString() + " " + this.station + " " + noiseRedondeado + " dBA";
        return s;
    }
    
    
}
