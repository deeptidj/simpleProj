package CrackingCodingInterviewStringArrays;

public class RotateMatrix {
    /*
    Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
    write a method to rotate the image by 90 degrees. Can you do this in place?
     */
    private static final int N = 5;

    public static void main(String[] args) {
        //int[][] m = createMatrix(N);
        int[][] m = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        printMat(m);
        int[][] res = rotateMatrix(m);
        printMat(res);
    }
    public static int[][] rotateMatrix(int[][] m) {
        int len = m.length;
        for (int layer = 0; layer < len / 2; ++layer) {
            int first = layer;
            int last = len-1-layer;
            for (int i = first; i < last; ++i) {
                int offset = i - first;
                //save top
                int top = m[first][i];
                // left -> top
                m[first][i] = m[last-offset][first];
                //bottom -> left
                 m[last-offset][first] = m[last][last-offset];
                //right -> bottom
                 m[last][last-offset] = m[i][last];
                //top -> right
                m[i][last] = top;
            }
        }
        return m;
    }
    public static int[][] createMatrix(int N){
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                m[i][j] = i;
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
