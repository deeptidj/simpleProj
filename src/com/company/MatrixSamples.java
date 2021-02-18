package com.company;

public class MatrixSamples {
    private static final int N = 5;

    public static void main(String[] args) {
       int[][] mat = printPyramid(5);
        for (int i = 1; i < 6; i++) {
            printSumOfRowMat(mat, i);
        }


     /*   int[][] m1 = createMatrix(N);
        int[][] m2 = createMatrix(N);
        printMat(m1);
        printMat(m2);
        System.out.println();
        System.out.println(" Add ");
        int[][] res = addMat(m1, m2);
        printMat(res);
        System.out.println();
        System.out.println(" Sub ");
        int[][] diff = subMat(m1, m2);
        printMat(diff);
        System.out.println();
        System.out.println(" Mult ");
        int[][] prod = multMat(m1, m2);
        printMat(prod);
        System.out.println();
        System.out.println(" Transpose ");
        int[][] transposed = transpose(m1);
        printMat(transposed);
        System.out.println();
        System.out.println(" Is Identity ");
        boolean b = isIdentity(m1);
        System.out.println(b);
        int[][] iden = createIdentityMat(N);
        printMat(iden);
        b = isIdentity(iden);
        System.out.println(b);
        System.out.println();
        System.out.println(" Is Lower Trinagular Matrix ");
        int[][] lowTring = createLowerTringMat(N);
        printMat(lowTring);
        b = isLowerTrinagularMatrix(lowTring);
        System.out.println(b);
        System.out.println(" Is Lower Trinagular Matrix ");
        int[][] lowTring1 = createIdentityMat(N);
        printMat(lowTring1);
        b = isLowerTrinagularMatrix(lowTring1);
        System.out.println(b);
        System.out.println(b);
        System.out.println(" Is Lower Trinagular Matrix ");
        int[][] lowTring2 = createMatrix(N);
        printMat(lowTring2);
        b = isLowerTrinagularMatrix(lowTring2);
        System.out.println(b);
        System.out.println();
        System.out.println(" Is Upper Trinagular Matrix ");
        int[][] uppTring = createLowerTringMat(N);
        printMat(uppTring);
        b = isLowerTrinagularMatrix(uppTring);
        System.out.println(b);
        System.out.println(" Is Upper Trinagular Matrix ");
        int[][] uppTring1 = createIdentityMat(N);
        printMat(uppTring1);
        b = isLowerTrinagularMatrix(uppTring1);
        System.out.println(b);
        System.out.println();
        System.out.println(" Is Upper Trinagular Matrix ");
        int[][] uppTring2 = createMatrix(N);
        printMat(uppTring2);
        b = isLowerTrinagularMatrix(uppTring2);
        System.out.println();
        System.out.println(" Is Sparse Matrix ");
        int[][] sparse = createMatrix(N);
        printMat(sparse);
        b = isSparseMatrix(sparse);
        System.out.println(b);
        System.out.println();
        System.out.println(" Is Sparse Matrix ");
        int[][] sparse1 = createIdentityMat(N);
        printMat(sparse1);
        b = isSparseMatrix(sparse1);
        System.out.println(b);
        printPyramid(5);

      */
    }
    public static boolean isSparseMatrix(int[][] m) {
        int row = m.length;
        int col = m[0].length;
        int size = row * col, noOfZeroes=0, halfSize;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (m[i][j] == 0) noOfZeroes++;
            }
        }
        halfSize = size/2;
        if (noOfZeroes > halfSize) return true;
        else return false;
    }
    public static boolean isUpperTrinagularMatrix(int[][] m) {
        int row = m.length;
        int col = m[0].length;
        if (row != col) return false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i>j && m[i][j] != 0) return false;
            }
        }
        return true;
    }
    public static boolean isLowerTrinagularMatrix(int[][] m) {
        int row = m.length;
        int col = m[0].length;
        if (row != col) return false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (j>i && m[i][j] != 0) return false;
            }
        }
        return true;
    }
    public static boolean isIdentity(int[][] m1){
        int row = m1.length;
        int col = m1[0].length;
        if (row != col) {
            System.out.println("Matris is not square");
            return false;
        }
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j && m1[i][j] != 0) {
                    flag = false;break;
                }
                if (i==j && m1[i][j] != 1) {
                    flag = false;break;
                }

            }
        }

        return flag;

    }
    public static int[][] transpose(int[][] m1){
        int n = m1.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = m1[j][i] ;
            }
        }
        return res;

    }
    public static int[][] addMat(int[][] m1, int[][] m2){
        int n = m1.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return res;

    }
    public static int[][] multMat(int[][] m1, int[][] m2){
        int n = m1.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = m1[i][j] * m2[i][j];
            }
        }
        return res;

    }

    public static int[][] subMat(int[][] m1, int[][] m2){
        int n = m1.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return res;

    }
    public static int[][] createIdentityMat(int N){
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i==j) m[i][j] = 1;
                else  m[i][j] = 0;
            }
        }
        return m;
    }
    public static int[][] createLowerTringMat(int N){
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j>i) m[i][j] = 0;
                else  m[i][j] = i*j;
            }
        }
        return m;
    }
    public static int[][] createUpperTringMat(int N){
        int[][] m = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i>j) m[i][j] = 0;
                else  m[i][j] = i*j;
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
    public static int[][] printPyramid(int n){
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j<=i) {
                    System.out.print(j+1);
                    mat[i][j] = j + 1;
                }
            }
            System.out.println();
        }
      return mat;
    }
    public static void printSumOfRowMat(int[][] mat, int rowSum) {
        int sum =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if((i) == rowSum-1) {
                    sum = sum+mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
