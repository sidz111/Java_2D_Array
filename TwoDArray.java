import java.util.*;

public class TwoDArray {

    public static boolean KeyFind(int matrix[][], int key) {
        // if you want to find some value as key in array you can use this method to find 
        // positions of that value in array
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("key is fouund at position (" +i+","+j+")");
                    return true;
                }
                else {
                    
                }
            }
        }
        System.out.print("key not found");
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        System.out.println();
        }

        KeyFind(matrix, 10);
    }
}