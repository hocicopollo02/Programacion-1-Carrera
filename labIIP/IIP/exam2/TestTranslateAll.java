package exam2;

import graph2D.Graph2D;
import others.Point;
import others.Polygon;
import java.awt.Color;
import java.util.Scanner;
/**
 * Clase programa para facilitar la prueba del codigo, desarrollado por
 * el alumno, para el metodo translateAll.
 * El main crea una secuencia con 3 cuadrados en escalera superpuestos:
 * verde en el origen, rojo desplazado a la derecha y arriba y 
 * azul desplazado tambien a la derecha y arriba.
 * Se realizan 4 pruebas partiendo siempre de la secuencia original
 * y llamando al metodo translateAll(Color, double, double) para ver que:
 * 1.- La figura no se modifica.
 * 2.- El cuadrado verde es el unico que se traslada.
 * 3.- El cuadrado rojo es el unico que se traslada.
 * 4.- El cuadrado azul es el unico que se traslada.
 * 
 * La prueba 5 parte de la secuencia con 3 cuadrados:
 * verde en elado tambien a la derecha y arriba.
 * Se llama al m origen, verde desplazado a la derecha y arriba y 
 * azul desplazetodo translateAll(Color, double, double) para ver que 
 * se trasladan los 2 cuadrados verdes.
 * 
 * La prueba 6 parte de la secuencia con 3 cuadrados:
 * verde en el origen, verde desplazado a la derecha y arriba y 
 * verde desplazado tambien a la derecha y arriba.
 * Se llama al metodo translateAll(Color, double, double) para ver que 
 * se trasladan todos.
 * 
 * Esta clase es para uso particular del alumno. 
 * No se entrega.
 *
 * @author Parcial 2 - Ejercicio 2 
 * @version IIP - Curso 2020-21
 */
public class TestTranslateAll {
    private TestTranslateAll() { } // No se usan objetos de esta clase
    
    public static void main(String[] args)  {
        Scanner keyB = new Scanner(System.in);
        // Crea un grupo de 3 cuadrados que se superponen formando escalera                    
        Graph2D gd = new Graph2D(-20, 20, -20, 20, 400, 400, Color.WHITE, 
            "Prueba translateAll(Color, double, double)");
        PolygonGroup g = makeGroup(0);      
        drawGroup(gd, g);
        System.out.println("Veras 3 cuadrados superpuestos formando escalera.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul"); 
        System.out.println("** Prueba 1: llamada a translateAll(Color.BLACK, -3, -3)");
        System.out.println("para trasladar todos los poligonos de color negro.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        String s = keyB.nextLine();
        g.translateAll(Color.BLACK, -3, -3);
        drawGroup(gd, g); 
        System.out.println("...Comprueba que la figura queda igual, sin cambios.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(0);  
        drawGroup(gd, g);
        System.out.println("Volvemos a la figura original.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul"); 
        System.out.println("** Prueba 2: llamada a translateAll(Color.GREEN, -3, -3)");
        System.out.println("para trasladar todos los poligonos de color verde.");      
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(Color.GREEN, -3, -3);
        drawGroup(gd, g);   
        System.out.println("...Comprueba que el unico que se ha trasladado es el verde.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(0);  
        drawGroup(gd, g);
        System.out.println("Volvemos a la figura original.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul"); 
        System.out.println("** Prueba 3: llamada a translateAll(Color.RED, -3, -3)");
        System.out.println("para trasladar todos los poligonos de color rojo."); 
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(Color.RED, -3, -3);
        drawGroup(gd, g);   
        System.out.println("...Comprueba que el unico que se ha trasladado el rojo.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(0);  
        drawGroup(gd, g);
        System.out.println("Volvemos a la figura original.");
        System.out.println("Secuencia: Verde -> Rojo -> Azul");
        System.out.println("** Prueba 4: llamada a translateAll(Color.BLUE, -3, -3)");
        System.out.println("para trasladar todos los poligonos de color azul."); 
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(Color.BLUE, -3, -3);
        drawGroup(gd, g);    
        System.out.println("...Comprueba que el unico que se ha trasladado es el azul.");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(5);      
        drawGroup(gd, g);
        System.out.println("Ahora veras 3 cuadrados superpuestos formando escalera.");
        System.out.println("Secuencia: Verde -> Verde -> Azul");        
        System.out.println("** Prueba 5: llamada a translateAll(Color.GREEN, -3, -3)");
        System.out.println("para trasladar todos los poligonos de color verde.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(Color.GREEN, -3, -3);
        drawGroup(gd, g); 
        System.out.println("...Comprueba que se han trasladado los 2 verdes.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        g = makeGroup(6);      
        drawGroup(gd, g);
        System.out.println("Ahora veras 3 cuadrados superpuestos formando escalera.");
        System.out.println("Secuencia: Verde -> Verde -> Verde");        
        System.out.println("** Prueba 5: llamada a translateAll(Color.GREEN, -3, -3)");
        System.out.println("para trasladar todos los poligonos de color verde.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.translateAll(Color.GREEN, -3, -3);
        drawGroup(gd, g); 
        System.out.println("...Comprueba que se han trasladado todos.");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();        
        System.out.println("Fin del proceso!!!"); 
        System.out.println("Envia ahora tu solucion a traves de la aplicacion de examen!!!");
    }
    
    /** 
     * Muestra en la salida grafica un grupo de poligonos dado.
     * @param gd Graph2D, el grafo.
     * @param p PolygonGroup, el grupo de poligonos.
     */
    private static void drawGroup(Graph2D gd, PolygonGroup g) {
        gd.clear(); 
        Polygon[] aPol = g.toArray();
        for (int i = 0; i < aPol.length; i++) {
            gd.fillPolygon(aPol[i].verticesX(), aPol[i].verticesY(),
                aPol[i].getColor(), 2);   
        }   
    }    
        
    /** 
     * Crea un grupo con 3 cuadrados en escalera, segun la prueba a realizar.
     * @param prueba int, el numero de prueba.
     * @return p PolygonGroup, el grupo de poligonos.
     */
    private static PolygonGroup makeGroup(int prueba) {
        Polygon[] group = new Polygon[3];
        // cuadrado verde de tamaño 6x6 y centrado en (0.0, 0.0), perimetro = 24
        double[] x0 = {-3.0, -3.0, 3.0, 3.0};
        double[] y0 = {-3.0, 3.0, 3.0, -3.0};
        group[0] = new Polygon(x0, y0);
        group[0].setColor(Color.GREEN);       
        // cuadrado rojo de tamaño 8x8 y centrado en (4.0, 4.0), perimetro = 32
        double[] x1 = {0.0, 0.0, 8.0, 8.0};
        double[] y1 = {0.0, 8.0, 8.0, 0.0};
        group[1] = new Polygon(x1, y1);        
        group[1].setColor(Color.RED);        
        // cuadrado azul de tamaño 10x10 y centrado en (10.0, 10.0), perimetro = 40
        double[] x2 = {5.0, 5.0, 15.0, 15.0};
        double[] y2 = {5.0, 15.0, 15.0, 5.0};
        group[2] = new Polygon(x2, y2);
        group[2].setColor(Color.BLUE);
                        
        if (prueba == 5) {            
            group[1].setColor(Color.GREEN);            
        }
        
        if (prueba == 6) {
            group[1].setColor(Color.GREEN); 
            group[2].setColor(Color.GREEN);
        }
        
        PolygonGroup g = new PolygonGroup();
        for (int i = 0; i < group.length; i++) {
            g.add(group[i]);
        }        
        return g;
    }
}
