package exam1Code;


public class Exercise3 {

    private Exercise3() { }

 

    public static void main(String[] args) {

        int h = 15;

        TimeInstant t = new TimeInstant(h, 0);

        m(t, h);

    }

  

    private static void m(TimeInstant t, int h) {

        t = new TimeInstant(h, 0);

        h = h + 5;

        t.setHours(h);

        System.out.println("En m se ha adelantado 5 horas: " + t);

    }

}