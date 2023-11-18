import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,4},
            {7,8,5},
            {3,6,0}
        };
        int deg=360;
        // printArray(matrix);
        // transpose(matrix);
        printArray(matrix);
        while(deg>0){
            
            rotate(matrix);
            deg=deg-90;
        }
        printArray(matrix);
    }
    public static void printArray(int[][] mat){
                for(int[] i:mat)

                        System.out.println(Arrays.toString(i));
    }
    public static void transpose(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
    }
    public static void rotate(int[][] matrix){
        transpose(matrix);
        int n=matrix.length;
        for(int i=0;i<n;i++){

            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }
    }
}
