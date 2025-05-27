class Solution {
    public static void main(String[] args) {
        String[][] array = {
            {"Apt 101", "Apt 102", "Apt 103"},
            {"Apt 201", "Exit Floor", "Apt 203"},
            {"Apt 301", "Apt 302", "Apt 303"}
        };

        // Loop through 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}

/*
Prints:
Apt 101, Apt 102, Apt 103,
Apt 201, Exit Floor, Apt 203,
Apt 301, Apt 302, Apt 303,
*/
