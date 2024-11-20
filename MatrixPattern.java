public class MatrixPattern {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        fillMatrixWithPattern(matrix);

        System.out.println("matrix filled with pattern:");
        printMatrix(matrix);
    }

    public static void fillMatrixWithPattern(int[][] matrix) {
        // iterate through each row of the matrix
        for (int i = 0; i < matrix.length; i++) {
            // iterate through each column of the current row
            for (int j = 0; j < matrix[i].length; j++) {
                // fill the matrix with numbers, starting from 1 and incrementing
                matrix[i][j] = i * matrix[i].length + j + 1;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
