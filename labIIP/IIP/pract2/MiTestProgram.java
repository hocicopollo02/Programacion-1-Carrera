package pract2;



public class MiTestProgram {
    public static void main(String[] args) {
        
        Blackboard miPizarra = new Blackboard("Dibujo", 500, 500);
        
        Circle circulo = new Circle(100, "blue", 100, 100);
        miPizarra.add(circulo);
        
        Rectangle rectangulo = new Rectangle(100, 100, "yellow", 200, 200);
        miPizarra.add(rectangulo);
        
        TrIsosceles triangulo = new TrIsosceles(50, 100, "green", 300, 300);
        miPizarra.add(triangulo);
        
    }
}
