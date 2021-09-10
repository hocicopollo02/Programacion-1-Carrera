package exam2Code;

/**
 * Clase DailyNoiseLevels: representa un registro de las medidas de ruido 
 * realizadas  a lo largo de las 24h de un dia en una estacion de medicion 
 * dada situada en via publica.
 * 
 * @author IIP - Parcial 2
 * @version Curso 2020/21 
 */
public class DailyNoiseLevels {   
    // a) (0.5 puntos) Atributos:
    // - HOURS: atributo estatico, publico, constante y de tipo int, que indica 
    //   el numero de horas que tiene un dia (24), o numero maximo de medidas que 
    //   se pueden registrar en la estacion en 24h. 
    // - measures: atributo de instancia y privado, un array de Measure y tamanyo HOURS 
    //   que almacena cada una de las medidas de ruido que se tomen en una estacion a lo 
    //   largo de las 24h de un dia. 
    //   Asi, cada uno de sus elementos, measures[i] (0 <= i < HOURS), almacena la medida 
    //   de ruido realizada a las i horas de un dia, null si a dicha hora no se ha tomado 
    //   ninguna medida.
    // - exceedsMaxDCount y exceedsMaxNCount: dos contadores, atributos de instancia y 
    //   privados de tipo int, cada uno de los cuales indica cuantas de las medidas tomadas 
    //   en los horarios Diurno y Nocturno, respectivamente, exceden los valores maximos 
    //   permitidos en dichos horarios.
    public static final int HOURS = 24;
    
    private Measure[] measures;
    private int exceedsMaxDCount, exceedsMaxNCount;
    
    // (0.5 puntos) Metodo constructor, que crea un DailyNoiseLevels vacio, 
    // sin medidas de ruido.
    public DailyNoiseLevels() {
        this.measures = new Measure[HOURS];
        this.exceedsMaxDCount = 0;
        this.exceedsMaxNCount = 0;
    } 
    
    // (0.75 puntos) Metodo add, que registra una medida m en un DailyNoiseLevels. 
    // Como precondicion, supongase que m es correcta y que en la hora en la que 
    // se ha tomado NO figura registrada ninguna medida.    
    public void add(Measure m) {
        
        int index = m.getInstantHours();
        this.measures[index] = m;
        
    }
    
    // (1 punto) Metodo firstOccupied, que devuelve la posicion de la primera medida 
    // de un DailyNoiseLevels, -1 si esta vacio.
    public int firstOccupied() {
        
        int i = 0;
        
        while( i < this.measures.length && (this.measures[i].equals(null)) ) {
            
            i++;
            
        }
        
        if (i < this.measures.length) { return i; } else { return -1; }
    }
    
    // (1.25 puntos) Metodo getMaxIndex, que devuelve la posicion de la medida con el 
    // maximo nivel de ruido de un DailyNoiseLevels, -1 si esta vacio. 
    // Para ello, este metodo DEBE invocar en su cuerpo al metodo firstOccupied.
    public int getMaxIndex() {
        
        double prevRuido = 0;
        int indice = 0;
        
        for( int i = firstOccupied(); i < this.measures.length; i++) {
        
            double ruido = this.measures[i].getNoise();
            
            if(ruido > prevRuido) {
            
                prevRuido = ruido;
                
                indice = i;
                
            } 
        
        }
        
        return indice;
    }
    
    // (1.5 puntos) Metodo filterByMaxExceeded, que devuelve un array con aquellas medidas 
    // de un DailyNoiseLevels que hayan superado el maximo permitido, tanto en horario diurno 
    // como en nocturno.
    // NOTA: el tamanyo del array resultado debe ser igual al numero de medidas que han 
    // superado el maximo permitido, siendo cero si ninguna medida lo ha superado.
    public Measure[] filterByMaxExceeded() {
        
        Measure[] exceed;
        int tamaño = 0;
        int j = 0;
        
        for(int i = 0; i < this.measures.length; i++) { 
        
            if( !(this.measures[i].equals(null) ) && this.measures[i].exceedsMax() ) {
                
                tamaño++;
            
            }
            
        }
        
        exceed = new Measure[tamaño];
        
        for( int i = 0; i < this.measures.length; i++ )  {
            
            boolean c = this.measures[i].exceedsMax();
            
            if( !(this.measures[i].equals(null) ) && c ) 
            
            {
                
                exceed[j] = this.measures[i]; 
                j++; 
                
            }
            
        }
        
        return exceed;
        
    }    
}