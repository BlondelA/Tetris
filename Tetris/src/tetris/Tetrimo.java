/**
 * @author toto
 * ici les pièces
 * 
 */
package tetris;

import java.util.Random;
import java.lang.Math;


public class Tetrimo {

    enum Tetrimos { Vide, bare, cube, T, L, J, S, Z };

    private Tetrimos piece;
    private int coordonne[][];
    private int[][][] coordonneTable;


    public Tetrimo() {

        coordonne = new int[4][2];
        setTetromino(Tetrimos.Vide);

    }

    public void setTetromino(Tetrimos Tetromino) {

         coordonneTable = new int[][][] {
            { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
            { { 2, 0 },   { 1, 0 },   { 0, 0 },   { -1, 0 } },
            { { 0, -1 },   { 0, 0 },   { -1, -1 },   { -1, 0 } },
            { { 0, -1 },   { 0, 0 },   { 0, 1 },   { -1, 0 } },
            { { 1, -1 },   { 0, -1 },   { -1, -1 },   { -1, 0 } },
            { { 1, 0 },   { 0, 0 },   { -1, -1 },   { -1, 0 } },
            { { 0, -1 },   { 0, 0 },   { -1, 0 },   { -1, 1 } },
            { { 0, -1 },   { 0, 0 },   { -1, -1 },   { 1, 0 } }
        };

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                coordonne[i][j] = coordonneTable[Tetromino.ordinal()][i][j];
            }
        }
        piece = Tetromino;

    }

}