import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int r1, c1, r2, c2, sum = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no. of rows and column of first matrix: ");
        r1 = in.nextInt();
        c1 = in.nextInt();

        System.out.print("Enter no. of rows and column of second matrix: ");
        r2 = in.nextInt();
        c2 = in.nextInt();

        if (c1 != r2)
            System.out.println("\nMatrices cannot be multiplied.");
        else {
            int[][] a = new int[r1][c1];
            int[][] b = new int[r2][c2];
            int[][] m = new int[r1][c2];

            System.out.print("Enter elements of first matrix: ");
            for (int i = 0; i < r1; i++)
                for (int j = 0; j < c1; j++)
                    a[i][j] = in.nextInt();

            System.out.println("Entered matrix:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++)
                    System.out.print(a[i][j] + "\t");
                System.out.println();
            }

            System.out.print("Enter elements of second matrix: ");
            for (int i = 0; i < r2; i++)
                for (int j = 0; j < c2; j++)
                    b[i][j] = in.nextInt();

            System.out.println("Entered matrix:");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++)
                    System.out.print(b[i][j] + "\t");
                System.out.println();
            }

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < r2; k++)
                        sum += a[i][k] * b[k][j];
                    m[i][j] = sum;
                    sum = 0;
                }
            }
            
            System.out.println("Product of matrices:");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++)
                    System.out.print(m[i][j] + "\t");
                System.out.println();
            }
        }
    }
}
