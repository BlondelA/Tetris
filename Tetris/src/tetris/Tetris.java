/**
 * @author toto
 * Projet TETRIS :)
 * 
 */
package tetris;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tetris extends JFrame {

    JLabel statusbar;

    public Tetris() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);
        tableau tableau = new tableau(this);
        add(tableau);
        tableau.start();

        setSize(200, 400);
        setTitle("Tetris");
   }
    