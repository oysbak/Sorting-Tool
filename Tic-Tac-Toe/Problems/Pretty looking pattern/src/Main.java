import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        // Read matrix
        char[][] matrix = new char[4][4];
        for (int i = 0; i < 4; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        String returnValue = "YES";

        // Check for 2x2 matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (hasTwoByTwoMatrix(matrix, i, j)) {
                    returnValue = "NO";
                }
            }
        }

        System.out.println(returnValue);
    }

    public static boolean hasTwoByTwoMatrix(char[][] matrix, int x, int y) {
        return matrix[x][y] == matrix[x][y + 1]
                && matrix[x][y] == matrix[x + 1][y]
                && matrix[x][y] == matrix[x + 1][y + 1];
    }
}
