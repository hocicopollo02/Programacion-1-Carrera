package parcial2;


public class Grupo {

    private static final int MAX = 100;

    //Atributos de instancia
    private Estudiante[] array;

    private int n;

    //Método constructor
    public Grupo () {

        this.array = new Estudiante[MAX];

        this.n = 0;

    }

    public Grupo (int n) {
        
        this.n = n;
        
        this.array = new Estudiante[MAX];

        for(int i = 0; i < n ; i++) {

            int j = 65 + i;

            String s = "" + (char) j;
            
            this.array[i] = new Estudiante(s);

        }
        
    }
    public boolean buscar(Estudiante e) {
        int i = 0;
        //Condicion de busqueda ==> lo encuentro = son iguales = compareTo return 0 = me he pasado
        while ((i < this.n) && /*(!this.array[i].equals(e))*/ this.array[i].compareTo(e) < 0) {
            i++;
        }
        if(i < this.n) { //éxito en la busqueda
            if (array[i].equals(e)) { return true; }
            else { return false; }

        } else { return false;} //fracaso en la busqueda

        //return i < this.n? true : false;

    }

    public boolean insertar (Estudiante e) {

        int i = 0;

        while ((i < this.n) && /*(!this.array[i].equals(e))*/ this.array[i].compareTo(e) < 0) {

            i++;

        }

        if(i < this.n) { 

            if (array[i].equals(e)) { 

                return false; 

            } else { //Situación a
                // Insertar y desplazar
                for (int j = this.n -1; j >= i; j--) {
                    // Copiar casilla array[j] a la derecha
                    this.array[j + 1] = this.array[j];

                }

                this.array[i] = e;
                this.n++;

                return true;

            }

        } else { 
            // Insertar
            this.array[i] = e;
            this.n++;

            return true;

        } 

    }
    
    public int[] numAptos() {
        
        int i = 0, noAptos = 0;
        
        int[] array = new int[3];
        
        while(i < this.n) {
            
            if (this.array[i].getNota() >= 5 && this.array[i].getNota() < 7) { array[0]++; }
            else if (this.array[i].getNota() >= 7 && this.array[i].getNota() < 9) { array[1]++; }
            else if (this.array[i].getNota() >= 9) { array[2]++; }
            else { noAptos++; }
        
            i++;
        }
        
        return array;
    }
    
    public boolean estanTodosAprobados() {
        
        int i = 0;
        
        while (i < this.n && !(this.array[i].getNota() >= 5)){
                 
                i++;
                
        }
            
        if (i < this.n) { return false; }
        else { return true; }
        
    }
        
}
    