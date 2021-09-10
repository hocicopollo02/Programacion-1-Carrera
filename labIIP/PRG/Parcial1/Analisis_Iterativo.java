package Parcial1;

public class Analisis_Iterativo {

    public static boolean esPrefijoIt(int[] a, int[] b) {

        if(a.length > b.length) { return false; }
        else {

            int pos = 0;

            while(pos < a.length && a[pos] == b[pos]) {

                pos++;

            }

            return pos == a.length;

        }

    }

}
