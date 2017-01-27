/**
 * @author toto
 * Ici je m'occupe des Tetrominos: les pièces.
 */

package tetris;

public class Tetromono {

    enum Tetrolist { Vide, bare, cube, T, L, J, S, Z };

    private Tetrolist pieceTetromino;
    private int coord[][];
    private int[][][] coordTable;


    public Tetromino() {

        coords = new int[4][2];
        setShape(Tetrolist.Vide);

    }

    public void setTetromino(Tetrolist tetromino) {

         coordTable = new int[][][] {
            { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
            { { 2, 0 },   { 1, 0 },   { 0, 0 },   { -1, 0 } },
            { { 0, -1 },   { 0, 0 },   { -1, -1 },   { -1, 0 } },
            { { 0, -1 },   { 0, 0 },   { 0, 1 },   { -1, 0 } },
            { { 1, -1 },   { 0, -1 },   { -1, -1 },   { -1, 0 } },
            { { 1, 0 },   { 0, 0 },   { -1, -1 },   { -1, 0 } },
            { { 0, -1 },   { 0, 0 },   { -1, 0 },   { -1, 1 } },
            { { 0, -1 },   { 0, 0 },   { -1, -1 },   { 1, 0 } },
        };

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                coord[i][j] = coordTable[tetromino.ordinal()][i][j];
            }
        }
        pieceTetromino = tetromino;

    }
}
