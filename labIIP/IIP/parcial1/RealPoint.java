package parcial1;

public class RealPoint {
    private double x, y;
    private char shape;
    private String name;
    
    //Métodos constructores
    public RealPoint() {
        this.x = this.y = 0.0;
        this.shape = 'X';
        this.name = "perro";
    }
    
    public RealPoint(double x, double y) {
        this.x = x;
        this.y = y;
        this.shape = 'O';
    }
    
    public boolean equals (Object other) {
        return other instanceof RealPoint && this.x == ((RealPoint)other).x && this.y == ((RealPoint)other).y && this.name.equals(((RealPoint)other).name);
    }
    
    public double dist(RealPoint i) {
        double  difX = this.x - i.x;
        double difY = this.y - i.y;
        return Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
    }
}
