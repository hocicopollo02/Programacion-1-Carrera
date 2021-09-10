package parcial2;


/**
 * Write a description of class Estudiante here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Estudiante {
    
    //Atributos de instancia
    private int edad;
    
    private String dni;
    
    private double nota;
    
    private String apellidos;
    
    private String nombre;
    
    
    //Método constructor
    public Estudiante (String apellidos) {
    
        this.apellidos = apellidos;
        this.nombre = "fulano";
        this.nota = Math.round((10 * Math.random()) * 10) / 10.0;
    
    }
    
    public boolean equals(Object other) {
    
        return other instanceof Estudiante 
               && this.apellidos.equals(((Estudiante) other).apellidos) 
               && this.nombre.equals(((Estudiante) other).nombre);
    
    }
    
    public int compareTo (Estudiante e) {
    
        int resta = this.apellidos.compareTo(e.apellidos);
        
        if (resta != 0) { return resta;}
        else { return this.apellidos.compareTo(e.nombre); }
    
    }
    
    public double getNota() { return this.nota; }
    
}
