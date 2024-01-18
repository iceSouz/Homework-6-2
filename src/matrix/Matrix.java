package matrix;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter size M: ");
        int sizeM = scanner.nextInt();

        System.out.println("Enter size N: ");
        int sizeN = scanner.nextInt();

        int[][] matrix1 = new int[sizeM][sizeN];
        int[][] matrix2 = new int[sizeN][sizeM];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = random.nextInt(10);
                matrix2[j][i] = matrix1[i][j];
            }

            System.out.println(Arrays.toString(matrix1[i]));
        }

        System.out.println();

        for (int i = 0; i < matrix2.length; i++) {
            System.out.println(Arrays.toString(matrix2[i]));
        }

        scanner.close();
    }
}
