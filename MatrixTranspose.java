public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("before matrix transpose:");
        printMatrix(matrix);

        int[][] transposed = transposeMatrix(matrix);

        System.out.println("after matrix transpose:");
        printMatrix(transposed);
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        // get the number of rows and columns of the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // create a new matrix to store the elements of the transposed matrix
        int[][] transposedMatrix = new int[cols][rows];

        // iterate through each element of the original matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // assign the value of the original matrix at [row][col] to the transposed matrix at [col][row]
                transposedMatrix[col][row] = matrix[row][col];
            }
        }

        // return transposed matrix
        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
