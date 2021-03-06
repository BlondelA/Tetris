/**
/**
 * @author BlondelA
 * Le Main du TETRIS
 * 
 */
package Jeu;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Musiques.Musique;

public class Main extends JFrame {

    JLabel statusbar;


    public Main() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        Tableau tableau = new Tableau(this);
        add(tableau);
        tableau.start();

        setSize(200, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   public JLabel getStatusBar() {
       return statusbar;
   }

    public static void main(String[] args) {

        Main game = new Main();
        game.setLocationRelativeTo(null);
        game.setVisible(true);
    
        music = new Musique("Musiques/Tetris.wav");
    } 
    
    public static Musique music;
}
