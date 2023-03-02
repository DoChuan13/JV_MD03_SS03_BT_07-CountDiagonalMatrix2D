package CountDiagonalMatrix2D;

import java.util.Scanner;

public class CountDiagonalMatrix2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array size: ");
        int size = input.nextInt();
        double[][] arr2D = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Input element [%d][%d]: ", (i + 1), (j + 1));
                arr2D[i][j] = input.nextInt();
            }
        }
        System.out.println("Current Array: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%-20f", arr2D[i][j]);
            }
            System.out.println("");
        }
        double sumDiagonal = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sumDiagonal += arr2D[i][j];
                }
            }
        }
        System.out.printf("Sum value in diagonal column is: %f", sumDiagonal);

    }
}
