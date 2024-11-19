public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        System.out.println("matrix A:");
        printMatrix(matrixA);

        System.out.println("matrix B:");
        printMatrix(matrixB);

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
        
        System.out.println("matrix multiplication result:");
        printMatrix(resultMatrix);
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        // get the number of rows and columns of matrixA and matrixB
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // ensure that the number of columns in A is equal to the number of columns in B
        if (colsA != rowsB) {
            System.out.println("matrix A's column must equal to matrix B's column");
            return new int[][]{};
        }

        // create a new matrix to store the result of the multiplication
        int[][] resultMatrix = new int[rowsA][colsB];

        // perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                resultMatrix[i][j] = 0;

                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return resultMatrix;
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
