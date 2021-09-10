package Parcial2;

public class Externa {    
    
    public static boolean buscarEliminarRecursivo(NodeInt ant, NodeInt aux, int x) {
    
        if(aux == null) {
        
            return false;
        
        } else {
        
            if (aux.data == x) {
            
                return true;
            
            } else {
                
                return buscarEliminarRecursivo(aux, aux.next, x);
            
            }
        
        }
    
    
    }
    
    
    public boolean buscarEliminarRecursivo(StackIntLinked s, int x) {
    
        if (s.isEmpty()) {
        
            return false;
        
        } else {
        
            if(s.peek() == x) {
            
                s.pop();
                return true;
                
            } else {
            
                int z = s.pop();
                boolean res = buscarEliminarRecursivo(s, x);
                s.push(z);
                return res;
                
            }
        
        }
    
    }
    
    public static void invertir(QueueIntLinked q) {
        /* 
        if (q.size() >= 1) {
        
            q = q; // o {}
            
        }
        
        else {
            
            int x = q.remove1();

            invertir(q);
            
            q.add1(x);
            
        }
        */
       
        if(q.size() > 2) { 
        
            int x = q.remove1();

            invertir(q);
            
            q.add1(x);
        
        }
    
    }
    
    public static QueueIntLinked pilaToCola(StackIntLinked s) {
        
        if( s.isEmpty() ) { 
        
            QueueIntLinked q = new QueueIntLinked();
            return q;
        
        }
        
        else {
            
            
            int a = s.pop();
            
            QueueIntLinked p = pilaToCola(s);
            
            p.add1(a);
            
            s.push(a);
            
            return p;
        
        }
    
    }

    public static void printStackRec(StackIntLinked s) {
        
        if (!s.isEmpty()) {
            
            int aux = s.pop();
            System.out.println(aux);
            printStackRec(s);
            s.push(aux);
            
        }
        
        
    }

    public static void printStackRecReverse(StackIntLinked s) {
        
        if (!s.isEmpty()) {
            
            int aux = s.pop();
            printStackRec(s);
            System.out.println(aux);
            s.push(aux);
            
        }
        
    }

    public static StackIntLinked invertir(StackIntLinked s) {
        
        StackIntLinked res = new StackIntLinked();
        StackIntLinked aux = new StackIntLinked();
        
        
        while (!s.isEmpty()) {
            
            int x = s.pop();
            aux.push(x);
            res.push(x);
            
        }

        while (!aux.isEmpty()) {
            
            int x = aux.pop();
            System.out.println(x);
            s.push(x);
            
        }

        return res;
        
    }

    public static void printStack(StackIntLinked s) {
        
        //input s con datos 
        StackIntLinked aux = new StackIntLinked();
        
        while (!s.isEmpty()) {
            
            int x = s.pop();
            aux.push(x);
            
        }

        while (!aux.isEmpty()) {
            
            int x = aux.pop();
            System.out.println(x);
            s.push(x);
            
        }

    }
    
    public static void printQueue(QueueIntLinked q) {
    
        for(int i = 0; i < q.size(); i++) {
        
            int a = q.remove1();
            
            System.out.println(a);
            
            q.add1(a);
            
        }
        
    }
    
    public static void filterQueue(QueueIntLinked q) {
        
        int l = q.size();
        
        for(int i = 0; i < l; i++) {
        
            int a = q.remove1();
            
            if(a >= 18) { q.add1(a); }
            
        }
        
    }

    public static NodeInt obtenerPares(NodeInt sec) {
        
        NodeInt res = null;
        NodeInt ultimoRes = null;
        NodeInt aux = sec;
        boolean primeraVez = true;
        
        while (aux != null) {
            //tratar aux.data
            if (aux.data % 2 == 0) {
                
                NodeInt nuevo = new NodeInt(aux.data);
                
                if (primeraVez) {
                    
                    res = nuevo;
                    primeraVez = false;
                    
                }
                else {
                    
                    ultimoRes.next = nuevo;
                    
                }
                
                ultimoRes = nuevo;
                
            }
            
            aux = aux.next;
            
        }
        
        return res;
        
    }

    public static String examenInverso(NodeChar sec) {
        //Recorrido ascendente 
        String res = "";
        NodeChar aux = sec;
        
        while (aux != null) {
            
            //char c = aux.data;
            res = res + aux.data; //tratar(aux.data)
            aux = aux.next;

        }
        
        return res;
        
    }
    // Se puede hacer también por bucle ascendente, pero en este caso
    // el descendente es más sencillo 
    public static NodeChar examen (String s) {
        
        NodeChar sec = null;
        
        for (int i = s.length() -1; i >= 0; i--) {
            
            char c = s.charAt(i);
            sec = new NodeChar(c, sec);
            
        }
        
        return sec;
        
    }

    // ahora en ascendente
    public static NodeChar examenA (String s) {
        
        NodeChar sec = null; 
        NodeChar ultimo = null;
        
        for (int i = 0; i < s.length() -1; i++) {
            
            char c = s.charAt(i);
            NodeChar nuevo = new NodeChar(c);
            
            if (i == 0) {
                
                sec = nuevo;
                
            }
            else {
                
                ultimo.next = nuevo;
                
            }
            
            ultimo = nuevo;
            
        }
        
        return sec;
        
    }
    
}

