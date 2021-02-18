package CrackingCodingInterviewStringArrays;

public class RowColZeros {
    public static void main(String[] args) {
        System.out.println("sdf");
        int[][] m = {
                {1,  2,  3,  4},
                {5,  0,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        printMat(m);
        int[][] res = changeZeroes(m);
        printMat(res);

        int[][] d = createMatrix(6);
        printMat(d);
        int[][] res1 = changeZeroes(d);
        printMat(res1);


    }
        public static int[][] createMatrix(int N){
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                m[i][j] = i+1;
            }
        }
        return m;
    }
        public static int[][] changeZeroes(int[][] m) {
        int n = m.length;
        int[] rowHavingZero = new int[n];
        int[] colHavingZero = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(m[i][j] == 0) {
                    rowHavingZero[i] = 1;
                    colHavingZero[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(rowHavingZero[i] == 1 || colHavingZero[j] == 1)
                    m[i][j] = 0;
            }
        }
        return m;
    }
        public static void printMat(int[][] m) {
        int N = m.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
