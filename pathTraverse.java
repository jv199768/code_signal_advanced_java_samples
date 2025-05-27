import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> pathTraverse(int[][] grid, int startRow, int startCol) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {
            { -1, 0 },  // Up
            { 1, 0 },   // Down
            { 0, -1 },  // Left
            { 0, 1 }    // Right
        };
