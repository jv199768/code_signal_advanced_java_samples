class Solution {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Finding the number of rows
        int numFloors = array.length;
        System.out.println(numFloors);  // Outputs: 3

        // Finding the number of columns
        int numUnits = array[0].length;
        System.out.println(numUnits);  // Outputs: 3
    }
}
