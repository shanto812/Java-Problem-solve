public class Task8 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        boolean isIdentity = true;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j && A[i][j] != 1 || i != j && A[i][j] != 0) {
                    isIdentity = false;
                    break;
                }
            }
        }

        System.out.println(isIdentity ? "Identity Matrix" : "Not an Identity Matrix");
    }
}
