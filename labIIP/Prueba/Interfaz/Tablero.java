package Interfaz;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.*;
public class Tablero extends JPanel{
        public void paint(Graphics g){
            //Dibuja un tablero de 100x100
            g.fillRect(100, 100, 300, 300);
            //Va añadiendo 
            for(int i = 100; i <= 400; i+=100){
                for(int j = 100; j <= 400; j+=100){
                    g.clearRect(i, j, 50, 50);
                }
            }
        
            //Rellena el 
            for(int i = 150; i <= 450; i+=100){
                for(int j = 150; j <= 450; j+=100){
                    g.clearRect(i, j, 50, 50);
                }
            }
        }
        public static void main(String[] args){
            JFrame frame = new JFrame();
            //Establece el tamaño de la ventana emergente
            frame.setSize(600,600);
            frame.getContentPane().add(new Tablero());
            frame.setLocationRelativeTo(null);
            //Establece el fondo de color negro
            frame.setBackground(Color.LIGHT_GRAY);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Permite que se vea la pantalla
            frame.setVisible(true);
        }  
}


