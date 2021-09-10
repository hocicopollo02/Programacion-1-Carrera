package examen_parcial1;

/**
 * Clase Pregunta1. 
 * @author PRG - Parcial 1
 * @version Curso 2020/21
 */
public class Pregunta1 {
    private Pregunta1() { }   // No hay objetos de esta clase

    /** Escribe en la salida estandar las parejas de 
     *  un array v de int desde el centro hacia fuera.
     *  Precondicion: i == 0 y f == v.length - 1 
     */
    public static void parejas(int[] v, int i, int f) {

        if(v.length != 0) {
            if(i == f - 1) { //El caso base será cuando lleguen los contadores al centro cuando es v.length es par

                System.out.print(v[i]);
                System.out.print(v[f]);

            } else if (i == f){ //El otro caso base es cuando lleguen los contadores al centro cuando v.length es impar
                System.out.print(v[i]);
                System.out.print(v[f]);
            } 
            else {//El caso general será llegar a uno de los casos bases y a partir de ahi retornar la llamada.

                parejas(v, i + 1, f - 1);
                System.out.print(v[i]);
                System.out.print(v[f]);

            }
        }

    }

    public static void main(String[] args) {
        int[] vMain = {1, 2, 3, 4, 5, 6};

        parejas(vMain, 0, vMain.length - 1);

    }        
}
