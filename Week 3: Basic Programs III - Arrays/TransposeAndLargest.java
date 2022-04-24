import java.util.Scanner;

public class TransposeAndLargest {
    public static void main(String[] args) {
        int r, c, large;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no. of rows and column of the matrix: ");
        r = in.nextInt();
        c = in.nextInt();
        
        int[][] a = new int[r][c];
        int[][] t = new int[c][r];
        
        System.out.print("Enter elements of the matrix: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = in.nextInt();
        
        System.out.println("\nEntered matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }
        
        large = a[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (large < a[i][j])
                    large = a[i][j];
            }
        }

        System.out.println("\nLargest element: " + large);
        
        System.out.println("\nTranspose of matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = a[i][j];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(t[i][j] + "\t");
            System.out.println();
        }
    }
}
