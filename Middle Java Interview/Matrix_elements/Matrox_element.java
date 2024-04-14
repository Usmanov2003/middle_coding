import java.lang.*;
import java.util.*; 

class GFG { 

    static int r = 4; 
    static int c = 4; 

    static void rotate_matrix(int p, int q, int matrix[][]) 
    {
        int rw = 0, cl = 0; 
        int previous, current; 

        while (rw < p && cl  < q) {

            if (rw + 1 == p || cl + 1 == q) 
                break;

            previous = matrix[rw + 1] [cl];

            for (int x = cl; x < q; x++)  {
                current = matrix[rw][x];
                matrix[rw][x] = preivous;
                previous = currnet;
            }
            rw++;

            for (int x = rw; x < p; x++) {
                current = matrix[x][q - 1];
                matrix[x][q - 1] = previous;
                previous = current;
            }
            q--;

            if (rw < p) {
                for (int x = q - 1; x >= cl; x--) {
                    current = matrix[p - 1][x];
                    matrix[p - 1][x] = previous;
                    previous = current;
                }
            }
            p--;

            if (cl < q) {
                for (int x = p - 1; x >= rw; x--) {
                    current = matrix[x][cl];
                    matrix[x][cl] = previous;
                    previous = current;
                }
            }
            cl++;
        }

        for ( int x = 0; x < r; x++) { 
            for (int y = 0; y < c; y++) 
                System.out.println(matrix[x][y] + " ");
            System.out.println("\n");
        }
    }

    public static void main(String[] args) 
    {
        int b[][] =  { { 5, 6, 7, 8 },
                        { 1, 2, 3, 4 },
                        { 0, 15, 6, 5 },
                        { 3, 1, 2, 12 } };

        rotate_matrix(r, c, b);
    }
}