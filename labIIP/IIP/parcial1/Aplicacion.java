package parcial1;

import java.util.*;

public class Aplicacion {
    public static void main (String[] args) {
        //Variables del programa
        Scanner tec = new Scanner(System.in).useLocale(Locale.US);
        Aritmetica a = new Aritmetica();
        boolean salir = false;
        
        
        //Menú del programa
        do{
            System.out.println("MENÚ DE OPCIONES");              
            System.out.println("\n1.- Ecuaciones de segundo grado(1º solución)");
            System.out.println("2.- Ecuaciones de segundo grado(2º solución)");
            System.out.println("3.- Área de una esfera");
            System.out.println("4.- Volumen de una esfera");
            System.out.println("5.- Volumen de la esfera a partir del área");
            System.out.println("6.- Celsius a Fahrenheit");
            System.out.println("7.- Fahrenheit a Celsius");
            System.out.println("8.- Cálculo del precio + el IVA");
            System.out.println("9.- Duración de un viaje en minutos");
            System.out.println("10.- Problema del caminante (altura en CM");
            System.out.println("\n0. Salir ");
        
            System.out.print("\n\n¿Qué problema quieres resolver? ");
            int n = tec.nextInt();
        
            switch (n) {
                case 1: //Primera solución de la ecuación
                    System.out.println("Ha escogido la opción " + n); 
                    System.out.print("Introduzca la componente A: ");
                    int A1 = tec.nextInt();
                    System.out.print("Introduzca la componente B: ");
                    int B1 = tec.nextInt();
                    System.out.print("Introduzca la componente C: ");
                    int C1 = tec.nextInt();
                    double res1 = a.p01(A1, B1, C1);
                    System.out.println("El resultado de la ecuación es: " + res1);
                break;
                case 2: //Segunda solución de la ecuación
                    System.out.println("Ha escogido la opción " + n); 
                     System.out.print("Introduzca la componente A: ");
                    int A2 = tec.nextInt();
                    System.out.print("Introduzca la componente B: ");
                    int B2 = tec.nextInt();
                    System.out.print("Introduzca la componente C: ");
                    int C2 = tec.nextInt();
                    double res2 = a.p01(A2, B2, C2);
                    System.out.println("El resultado de la ecuación es: " + res2);
                break;
                case 3: //Area de la esfera
                    System.out.println("Ha escogido la opción " + n);
                    System.out.print("¿Qué radio quieres?: ");
                    int radio = tec.nextInt();
                    double area = a.area(radio);
                    System.out.println("El área es: " + area + " metros cuadrados");
                break;
                case 4: //Volumen de la esfera
                    System.out.println("Ha escogido la opción " + n);
                    System.out.print("¿Qué radio quieres?: ");
                    int radio2 = tec.nextInt();
                    double vol1 = a.volumenRadio(radio2);
                    System.out.println("El volumen es: " + vol1 + " metros cúbicos");
                break;
                case 5: //Volumen de la esfera a partir del área
                    System.out.println("Ha escogido la opción " + n); 
                    System.out.print("¿Qué área quieres?: ");
                    double area1 = tec.nextDouble();
                    double vol2 = a.volumenArea(area1);
                    System.out.println("El volumen a partir del área es: " + vol2 + " metros cúbicos");
                break;
                case 6: //Celsius a Fahrenheit
                    System.out.println("Ha escogido la opción " + n);
                    System.out.print("¿Qué temperatura hace?(en Celsius) ");
                    double celsius1 = tec.nextDouble();
                    double fahr1 = a.c2f(celsius1);
                    System.out.println("La temperatura en Fahrenheit es: " + fahr1 + " ºF");
                break;
                case 7: //Fahrenheit a Celsius
                    System.out.println("Ha escogido la opción " + n);
                    System.out.print("¿Qué temperatura hace?(en Fahrenheit) ");
                    double fahr2 = tec.nextDouble();
                    double celsius2 = a.f2c(fahr2);
                    System.out.println("La temperatura en Celsius es: " + celsius2 + " ºC");
                break;
                case 8: //Cálculo del precio + el IVA
                    System.out.println("Ha escogido la opción " + n);
                    System.out.println("¿Cuánto vale el producto? ");
                    double precio = tec.nextDouble();
                    System.out.println("¿Y cuánto IVA es? ");
                    int IVA = tec.nextInt();
                    double precioFinal = a.masIVA(precio, IVA);
                    System.out.println("El precio final será: " + precioFinal + " €");
                    
                break;
                case 9: //Duración del viaje en minutos
                    System.out.println("Ha escogido la opción " + n);
                    System.out.println("Hora de salida: ");
                    int horaSal = tec.nextInt();
                    System.out.println("Minutos de salida: ");
                    int minSal = tec.nextInt();
                    System.out.println("Hora de llegada: ");
                    int horaLleg = tec.nextInt();
                    System.out.println("Minutos de llegada: ");
                    int minLleg = tec.nextInt();
                    int duracion = a.duracion(horaSal, minSal, horaLleg, minLleg);
                    System.out.println("La duración del viaje es: " + duracion + " minutos");
                break;
                case 10: //Problema del caminante
                    System.out.println("Ha escogido la opción " + n);
                    System.out.print("¿Qué altura desea?: ");
                    int alt = tec.nextInt();
                    double x = a.caminante(alt);
                    System.out.print("¿Cuántos decimales quieres? ");
                    int dec = tec.nextInt();
                    x = a.redondear(x, dec);
                    System.out.println("La diferencia de altura es: " + x + " metros");
                break;
                case 0 : 
                     System.out.println("¡Hasta luego!");
                     salir = true; 
                break;
          } 
          System.out.println("\n");
        } 
        while(!salir);
    }
}
