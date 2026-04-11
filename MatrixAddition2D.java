class MatrixAddition2D {
    public static void main(String[] args) {

        int a[][] = {
            {1, 2},
            {3, 4}
        };

        int b[][] = {
            {5, 6},
            {7, 8}
        };

        int result[][] = new int[2][2];

        // Addition
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print Result
        System.out.println("Matrix Addition Result:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}