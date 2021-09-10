package Interfaz;
import java.util.*;

public class Raya{
    
    public static char [][] tablero = {{' ', '|',' ','|',' '},
                                        {'-','+','-','+','-'},
                                       {' ', '|',' ', '|', ' '},
                                        {'-','+','-','+','-'},
                                       {' ', '|',' ', '|', ' '}};
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        dibujarTablero(tablero);
        System.out.println("Selecciona posición para colocar la marca(0 - 8):");
        int pos = scan.nextInt();
        
        switch(pos) {
            case 0: tablero[0][0] = 'X'; break;
            case 1: tablero[0][2] = 'X';break;
            case 2: tablero[0][4] = 'X';break;
            case 3: tablero[2][0] = 'X';break;
            case 4: tablero[2][2] = 'X';break;
            case 5: tablero[2][4] = 'X';break;
            case 6: tablero[4][0] = 'X';break;
            case 7: tablero[4][2] = 'X';break;
            case 8: tablero[4][4] = 'X';break;
        }
        
        dibujarTablero(tablero);
        
    }
    
    public static void dibujarTablero(char[][] tablero){
        
        for (char[] r : tablero) {
            for(char c : r) {
                System.out.print(c);
            }
            System.out.println();
        }
        
    }
}