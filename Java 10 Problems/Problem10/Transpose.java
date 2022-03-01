/*Write a Java Program to find the Transpose of a given Matrix*/
public class Transpose {
        public static void printMatrix(int A[][]) {
            for(int i = 0; i<4; i++) {
                for(int j = 0; j<4; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            int arr[][] = { {1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
            int trans[][] = new int[4][4];
            for(int i = 0; i<4; i++) {
                for(int j = 0; j<4; j++) {
                    trans[i][j] = arr[j][i];
                }
            }

            System.out.println("Given Matrix");
            printMatrix(arr);

            System.out.println("\nTranspose of the given matrix");
            printMatrix(trans);
    }
}