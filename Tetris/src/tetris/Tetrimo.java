/**
 * @author toto
 * ici les pièces
 * 
 */
package tetris;

import java.util.Random;
import java.lang.Math;

/**
 * Je défini à quoi reçemblent chaques pièces en donnant leurs coordonées dans
 * un tableau de 4 x 2 
 */

public class Tetrimo {

    enum Tetrimos { Vide, Z, S, Barre, T, Bloc, L, J };

    private Tetrimos pieceTetrimo;
    private int coords [][];
    private int[][][] coordsTable;


    public Tetrimo() {

        coords = new int[4][2];
        setPiece(Tetrimos.Vide);

    }

    public void setPiece(Tetrimos piece) {

         coordsTable = new int[][][] {
            { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
            { { 0, -1 },  { 0, 0 },   { -1, 0 },  { -1, 1 } },
            { { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } },
            { { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } },
            { { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } },
            { { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } },
            { { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } },
            { { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } }
        };

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                coords[i][j] = coordsTable[piece.ordinal()][i][j];
            }
        }
        pieceTetrimo = piece;

    }

/**
 * Je donne ici les coordonnées de spawn puis spawn de manière random
 */   
    private void setX(int index, int x) { coords[index][0] = x; }
    private void setY(int index, int y) { coords[index][1] = y; }
    public int x(int index) { return coords[index][0]; }
    public int y(int index) { return coords[index][1]; }
    public Tetrimos getShape()  { return pieceTetrimo; }

    public void setRandomShape()
    {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;
        Tetrimos[] values = Tetrimos.values(); 
        setPiece(values[x]);
    }

    public int minX()
    {
      int m = coords[0][0];
      for (int i=0; i < 4; i++) {
          m = Math.min(m, coords[i][0]);
      }
      return m;
    }


    public int minY() 
    {
      int m = coords[0][1];
      for (int i=0; i < 4; i++) {
          m = Math.min(m, coords[i][1]);
      }
      return m;
    }
/**
 * Rotation des pièces
 */
    public Tetrimo rotateLeft() 
    {
        if (pieceTetrimo == Tetrimos.Bloc)
            return this;

        Tetrimo result = new Tetrimo();
        result.pieceTetrimo = pieceTetrimo;

        for (int i = 0; i < 4; ++i) {
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }
        return result;
    }

    public Tetrimo rotateRight()
    {
        if (pieceTetrimo == Tetrimos.Bloc)
            return this;

        Tetrimo result = new Tetrimo();
        result.pieceTetrimo = pieceTetrimo;

        for (int i = 0; i < 4; ++i) {
            result.setX(i, -y(i));
            result.setY(i, x(i));
        }
        return result;
    }
}
