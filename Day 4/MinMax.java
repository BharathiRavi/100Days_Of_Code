
/* Write a function to find the minimum and maximum elements in an array.
Sample Input:
[3, 1, 4, 1, 5, 9, 2, 6, 5]
Sample Output:
Minimum: 1, Maximum: 9
 */

public class MinMax {
        public static void main(String[] args) {
            int[] array={3, 1, 4, 1, 5, 9, 2, 6, 5};
            min(array);
            max(array);
        }
        public static void min(int[] array){
            int min=Integer.MAX_VALUE;
            for(int arr:array){
                if(min>=arr){
                    min=arr;
                }
            }
            System.out.println(min);
        }
        public static void max(int[] array){
            int max=Integer.MIN_VALUE;
            for(int arr:array){
                if(max<arr){
                    max=arr;
                }
            }
            System.out.println("maximum "+max);
        }
}
