        int row = 0, col = 0, dir = 1;
        for (int i = 0; i < rows * cols; ++i) {  // Loop runs for the total number of cells in the matrix.
            traversal.add(matrix[row][col]);  // Append the current cell value to traversal.
            
            // Logic to control direction based on edges:
            if (dir == 1) {  // Moving down-left
                if (row == rows - 1) {
                    col += 1;
                    dir = -1;
                } else if (col == 0) {
                    row += 1;
                    dir = -1;
                } else {
                    row += 1;
                    col -= 1;
                }
            } else {  // Moving up-right
                if (col == cols - 1) {
                    row += 1;
                    dir = 1;
                } else if (row == 0) {
                    col += 1;
                    dir = 1;
                } else {
                    row -= 1;
                    col += 1;
                }
            }
}
