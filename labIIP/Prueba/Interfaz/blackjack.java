package Interfaz;

import java.util.*;


public class blackjack {
    
    public static String pedida;

    public static double fondos;

    public static int apuesta, mano, manoCrupier, num1, num2, num3, num4;

    public static boolean otraCarta;
    public static boolean continuar;

    public static Random azar = new Random();
    public static Scanner intr = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {

        
        // comprueba que los fondos sean mayores que 0.
        // en caso contrario se vuelve a preguntar por los fondos
        do {
            System.out.println("Introduzca sus fondos");
            fondos = intr.nextDouble();

            if(fondos<=0) {
                System.out.println("¡Fondos invalidos!");
            }
            
            System.out.println("");
        } while (fondos <= 0);

        // el programa se ejecuta hasta que el jugador diga que no quiere seguir jugando
        do {
            //comprueba que la apuesta sea válida
            do {
                System.out.println("Introduzca su apuesta");
                apuesta = intr.nextInt();
                
                if(apuesta <= 0 || apuesta > 100 || apuesta > fondos){
                    System.out.println("¡Apuesta inválida!");
                    System.out.println("");
                }
    
            } while (!(apuesta > 0 && apuesta <=100 && apuesta < fondos));
            
            System.out.println("Apuesta aceptada");
            System.out.println("---------------------");
            
            num1 = azar.nextInt(10) + 1;
            num2 = azar.nextInt(10) + 1;
            num3 = azar.nextInt(10) + 1;
            num4 = azar.nextInt(10) + 1;
            
            mano = num1 + num2;
            manoCrupier = num3 + num4;
    
            System.out.println("Tu primer número es el " + num1);
            System.out.println("Tu segundo número es " + num2);
            System.out.println("------------------");
            System.out.println("Tu mano vale: " + mano);
            System.out.println("------------------");
            
            System.out.println("");
            System.out.println("----------------------------");
            System.out.println("El número del crupier es " + num3);
            System.out.println("----------------------------");
    
    
            if (mano == 21){
    
                System.out.println("Blackjack");
                fondos += apuesta * 1.5;
                System.out.println("Tus fondos son: " + fondos);
    
            } else if (manoCrupier == 21){
            
                System.out.println("La banca gana");
                fondos -= apuesta;
                System.out.println("Tus fondos son: " + fondos);
    
            } else {
                otraCarta();            
            }

            continuar = preguntar("¿Quieres jugar otra vez?");
        } while (continuar == true);
    }
    
    //Comprueba el valor de las cartas del jugador y de la banca
    //
    public static void comprobarVictoria(int userPunt, int crupierPunt){
        System.out.println("El numero del crupier es " + num4);
        System.out.println("La mano del crupier es " + crupierPunt);
        System.out.println("");

        while(crupierPunt <= 16){

            crupierPunt += azar.nextInt(10) + 1;
            
        }

        System.out.println("---------------------");
        System.out.println("La nueva mano del crupier es " + crupierPunt);
        System.out.println("---------------------");
        System.out.println("");
        
        
        if (userPunt > 21) {

            fondos -= apuesta;

            System.out.println("Te has pasado.");
            System.out.println("La banca gana.");
            System.out.println("");

            System.out.println("Tus fondos son: " + fondos);

            otraCarta = false;
            
        } else if (userPunt == 21){

            fondos += apuesta;
            System.out.println("Blackjack");
            System.out.println("");

            System.out.println("Tus fondos son: " + fondos);

            otraCarta = false;

        } else if (userPunt == crupierPunt){

            System.out.println("Has empatado");
            System.out.println("");

            System.out.println("Tus fondos son: " + fondos);

            otraCarta = false;

        } else if (crupierPunt > userPunt && crupierPunt <= 21){

            fondos -= apuesta;
            System.out.println("La banca gana.");
            System.out.println("");

            System.out.println("Tus fondos son: " + fondos);

            otraCarta = false;
            
        } else if (userPunt > crupierPunt && userPunt <= 21){
            
            fondos += apuesta;
            System.out.println("Has ganado");
            System.out.println("");

            System.out.println("Tus fondos son: " + fondos);

            otraCarta = false;

        } else if (crupierPunt > 21 && userPunt < 21) {

            fondos += apuesta;
            System.out.println("Has ganado");
            System.out.println("");

            System.out.println("Tus fondos son: " + fondos);

            otraCarta = false;

        } 
    }

    // Pregunta si el jugador quiere otra carta
    // en caso afirmativo le da una carta
    // en caso contrario sale del bucle
    public static void otraCarta(){
        System.out.println("");

        while (preguntar("¿Quieres otra carta?") == true){
                
            int num = azar.nextInt(10) + 1;
            mano += num;
            
            otraCarta = true;

            System.out.println("Tu número es " + num);
            System.out.println("----------------------------");
            System.out.println("Tu nueva mano vale: " + mano);
            System.out.println("----------------------------");
            System.out.println("");
        
            if(mano >= 21) {
                comprobarVictoria(mano, manoCrupier);
                break;
            }
   
        }
        System.out.println("---------------------");
        System.out.println("Te has plantado con " + mano);
        System.out.println("---------------------");

        otraCarta = false;
        comprobarVictoria(mano, manoCrupier);
    }

    //método para obtener "true" si responde que si
    public static boolean preguntar(String pregunta){

        System.out.println(pregunta); 
        System.out.println("");

        boolean respuesta;
        String aux;

        aux = intr.next();
        respuesta = aux.equalsIgnoreCase("si") ? true : false;
        System.out.println("");

        return respuesta;
    }

}




    
