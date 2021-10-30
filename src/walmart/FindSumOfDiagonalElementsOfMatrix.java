package walmart;

import java.util.Collection;
import java.util.Scanner;

public class FindSumOfDiagonalElementsOfMatrix {

    public static void main(String[] args) {
        sumOfDiagonalElements();
    }

    public static void sumOfDiagonalElements() {
        int row, column, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Row Number: ");
        row = scanner.nextInt();
        System.out.println("Enter the Column Number: ");
        column = scanner.nextInt();

        int[][] mat = new int[row][column];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The elements of the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) //this condition checks for diagonal
                {
                    sum = sum + mat[i][j];
                }
            }
        }
        System.out.println(sum);

    }
}