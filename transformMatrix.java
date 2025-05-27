class Solution {

    public static int[][] transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = rows > 0 ? matrix[0].length : 0;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Initial matrix (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // Call our function on the matrix and output the result
        int[][] transposed = transformMatrix(matrix);
        for (int[] row : transposed) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
