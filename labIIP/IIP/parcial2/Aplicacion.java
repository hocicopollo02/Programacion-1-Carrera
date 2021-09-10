package parcial2;

import java.util.*;

public class Aplicacion {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int [] temperaturas;
        
        System.out.println("¿Con cúantos datos vas a trabajar? ");
        int n = scan.nextInt();
        temperaturas = new int[n];
        
        for(int i = 0; i < n; i++) {
            System.out.print("Dato " + i + ": ");
            temperaturas[i] = scan.nextInt();
            System.out.println();
        }
        
        double tempMedia = Utils.media(temperaturas);
        System.out.println("La temperatura media es " + tempMedia);
    }
}