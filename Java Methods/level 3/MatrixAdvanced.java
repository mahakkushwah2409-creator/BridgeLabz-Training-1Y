class MatrixAdvanced {

    // Method to display matrix
    static void display(double[][] M) {
        for (double[] row : M) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
        System.out.println();
    }

    // Transpose of matrix
    static double[][] transpose(double[][] M) {
        double[][] T = new double[M[0].length][M.length];
        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M[0].length; j++)
                T[j][i] = M[i][j];
        return T;
    }

    // Determinant of 2x2 matrix
    static double det2x2(double[][] M) {
        return (M[0][0] * M[1][1]) - (M[0][1] * M[1][0]);
    }

    // Determinant of 3x3 matrix
    static double det3x3(double[][] M) {
        return M[0][0] * (M[1][1] * M[2][2] - M[1][2] * M[2][1])
             - M[0][1] * (M[1][0] * M[2][2] - M[1][2] * M[2][0])
             + M[0][2] * (M[1][0] * M[2][1] - M[1][1] * M[2][0]);
    }

    // Inverse of 2x2 matrix
    static double[][] inverse2x2(double[][] M) {
        double det = det2x2(M);
        if (det == 0) return null;

        double[][] inv = {
            { M[1][1] / det, -M[0][1] / det },
            { -M[1][0] / det, M[0][0] / det }
        };
        return inv;
    }

    public static void main(String[] args) {
        double[][] M = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };

        System.out.println("Original Matrix:");
        display(M);

        System.out.println("Transpose:");
        display(transpose(M));

        System.out.println("Determinant (3x3): " + det3x3(M));

        double[][] A = {
            {4, 7},
            {2, 6}
        };

        System.out.println("\n2x2 Matrix:");
        display(A);

        System.out.println("Inverse of 2x2:");
        display(inverse2x2(A));
    }
}
