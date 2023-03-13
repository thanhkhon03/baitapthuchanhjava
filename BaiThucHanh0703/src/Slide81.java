import java.util.Scanner;

public class Slide81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng của ma trận: ");
        int row = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];

        System.out.println("Nhập các phần tử cho ma trận:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("matrix[" + i + "][" + j + "]= ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxElement = matrix[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là: " + maxElement);
    }
}
