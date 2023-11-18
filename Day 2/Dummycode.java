import java.util.Arrays;
public class Dummycode {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6}
        };
        for(int[] a:matrix){
            for(int ab:a){
                System.out.println(ab);
            }
            // System.out.println(Arrays.toString(a));
        }
    }
}
