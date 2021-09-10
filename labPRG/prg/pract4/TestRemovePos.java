package pract4;

import graph2D.Graph2D;
import java.awt.Color;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Clase programa para facilitar la prueba del codigo, desarrollado por 
 * el alumno, para el metodo removePos.
 * El main crea una secuencia con 4 cuadrados de igual tamanyo superpuestos:
 * gris en el origen, verde desplazado a la derecha y arriba, rojo tambien desplazado 
 * a la derecha y arriba y azul desplazado tambien a la derecha y arriba.
 * Se realizan cinco pruebas partiendo de la secuencia original
 * y eliminando mediante el metodo removePos(int) el poligono que ocupa una posicion 
 * dada:
 * 1.- Llamar al metodo removePos(4) sobre la secuencia de cuadrados con una posicion
 *     no valida y comprobar que no hace nada.
 * 2.- Llamar al metodo removePos(0) para eliminar el que ocupa la posicion 0 y
 *      comprobar que se elimina el rectangulo azul (el del frente), y es el rojo 
 *      el que queda al frente.
 * 3.- Llamar al metodo removePos(1) para eliminar el que ocupa la posicion 1 y 
 *      comprobar que se elimina el rectangulo verde (el de enmedio).
 * 4.- Llamar al metodo removePos(1) para eliminar el que ocupa la posicion 1 y 
 *      comprobar que se elimina el rectangulo gris (el del fondo).
 * 5.- Llamar al metodo removePos(0) para eliminar el que ocupa la posicion 0 y 
 *      comprobar que se elimina el rectangulo rojo y el grupo queda sin poligonos.     
 *     
 * Esta clase es para uso particular del alumno. 
 * No se entrega.
 *
 * @author PRG
 * @version Curso 2020-21
 */
public class TestRemovePos {
    private TestRemovePos() { } // No se usan objetos de esta clase
    
    public static void main(String[] args)  {
        Scanner keyB = new Scanner(System.in);
        // Crea un grupo de 4 cuadrados que se superponen formando escalera                    
        Graph2D gd = new Graph2D(-20, 20, -20, 20, 600, 400, Color.WHITE, 
            "Prueba removePos");
      
        // Eliminar el poligono de una posicion no valida
        PolygonGroupExam g = makeGroup();
        Polygon[] arrayPol = g.toArray();
        drawGroup(gd, g);
        System.out.println("Veras 4 cuadrados superpuestos formando escalera.");
        System.out.println("Secuencia: Gris -> Verde -> Rojo -> Azul");
        System.out.println("Pulsa INTRO para continuar..."); 
        String s = keyB.nextLine();
        System.out.println("** Prueba 1: llamar removePos para eliminar el poligono ");
        System.out.println("   en la posicion 4 (posicion no valida).");        
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.removePos(4);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el grupo no ha cambiado.");
    boolean okFront = g.getFront() != null && equals(g.getFront().data, arrayPol[3]);
    boolean okBack = g.getBack() != null && equals(g.getBack().data, arrayPol[0]);
    if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }     
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        // Eliminar el poligono que ocupa la posicion 0 (el del frente)
        System.out.println("** Prueba 2: llamar removePos para eliminar el poligono ");
        System.out.println("   en la posicion 0 (el del frente): el rectangulo azul... ");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.removePos(0);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el rectangulo azul se ha eliminado, ");
        System.out.println("    ahora es el rojo el del frente.");  
        okFront = g.getFront() != null && equals(g.getFront().data, arrayPol[2]);
    okBack = g.getBack() != null && equals(g.getBack().data, arrayPol[0]);
    if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }      
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        // Eliminar el poligono que ocupa la posicion 1 (el del enmedio)
        System.out.println("** Prueba 3: llamar removePos para eliminar el poligono ");
        System.out.println("   en la posicion 1 (el de enmedio): el rectangulo verde... ");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();        
        g.removePos(1);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el rectangulo verde se ha eliminado, ");
        System.out.println("    ahora solo quedan dos: Gris -> Rojo.");   
        okFront = g.getFront() != null && equals(g.getFront().data, arrayPol[2]);
    okBack = g.getBack() != null && equals(g.getBack().data, arrayPol[0]);
    if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }     
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        
        // Eliminar el poligono que ocupa la posicion 1 (el del fondo)
        System.out.println("** Prueba 4: llamar removePos para eliminar el poligono ");
        System.out.println("   en la posicion 1 (el del fondo): el rectangulo gris... ");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.removePos(1);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que el rectangulo gris se ha eliminado, ");
        System.out.println("    ahora solo queda el rectangulo rojo.");      
        okFront = g.getFront() != null && equals(g.getFront().data, arrayPol[2]);
    okBack = g.getBack() != null && equals(g.getBack().data, arrayPol[2]);
    if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }  
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();     
        
        // Eliminar el poligono que ocupa la posicion 0 (el del frente)
        System.out.println("** Prueba 5: llamar removePos para eliminar el poligono ");
        System.out.println("   en la posicion 0: el rectangulo rojo. ");
        System.out.println("Pulsa INTRO para continuar..."); 
        s = keyB.nextLine();
        g.removePos(0);
        drawGroup(gd, g); 
        System.out.println("... Comprueba que no quedan polígonos en el grupo.");
        okFront = g.getFront() == null;
    okBack = g.getBack() == null;
    if (!okFront || !okBack) {
            System.out.println("    --> ERROR: Problemas con las referencias front y/o back");
        }
        System.out.println("Fin del proceso!!!");
    }
    
    /** 
     * Muestra en la salida grafica un grupo de poligonos dado.
     * @param gd Graph2D, el grafo.
     * @param p PolygonGroup, el grupo de poligonos.
     */
    private static void drawGroup(Graph2D gd, PolygonGroupExam g) {
        gd.clear(); 
        Polygon[] aPol = g.toArray();
        for (int i = 0; i < aPol.length; i++) {
            gd.fillPolygon(aPol[i].verticesX(), aPol[i].verticesY(),
                aPol[i].getColor(), 2);   
        }   
    }
    
    /** 
     * Crea un grupo con 3 cuadrados en escalera.
     * @return p PolygonGroup, el grupo de poligonos.
     */
    private static PolygonGroupExam makeGroup() {
        PolygonGroupExam g = new PolygonGroupExam();
        // Crea un rectangulo gris centrado en (-6.0, -6.0) de tamanyo 6   
        double[] x0 = {-12.0, -12.0, 0.0, 0.0};
        double[] y0 = {-12.0, 0.0, 0.0, -12.0};
        Polygon pol = new Polygon(x0, y0);
        pol.setColor(Color.GRAY);
        g.add(pol);
        
        // el cuadrado verde centrado en el origen del mismo tamanyo
        double[] x1 = {-6.0, -6.0, 6.0, 6.0};
        double[] y1 = {-6.0, 6.0, 6.0, -6.0};
        pol = new Polygon(x1, y1);
        pol.setColor(Color.GREEN);
        g.add(pol);
        // el cuadrado rojo del mismo tamanyo y centrado en (6.0, 6.0)
        double[] x2 = {0.0, 0.0, 12.0, 12.0};
        double[] y2 = {0.0, 12.0, 12.0, 0.0};
        pol = new Polygon(x2, y2);
        pol.setColor(Color.RED);
        g.add(pol);
        // el cuadrado azul del mismo tamanyo y centrado en (12.0, 12.0)
        double[] x3 = {6.0, 6.0, 18.0, 18.0};
        double[] y3 = {6.0, 18.0, 18.0, 6.0};
        pol = new Polygon(x3, y3);
        pol.setColor(Color.BLUE);
        g.add(pol);
        
        return g;
    }
    
    /** Comprueba si dos poligonos son iguales.
     *  @param p Polygon.
     *  @param q Polygoon.
     *  @return boolean, true si son iguales; en caso contrario, false. 
     */
    private static boolean equals(Polygon p, Polygon q) {
        return p != null && q != null 
            && p.getColor().equals(q.getColor())
            && Arrays.equals(p.verticesX(), q.verticesX())
            && Arrays.equals(p.verticesY(), q.verticesY());
    }
}
