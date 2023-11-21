/*
 *  Implement a function to find the number of smaller elements on the right side of
each element in an array.
Sample Input:[3, 4, 9, 6, 1]
Sample Output:
[1, 1, 2, 1, 0]
 */
public class RightElement {
    public static void main(String[] args) {
        int[] arr={3, 4, 9, 6, 1};
        findSmall(arr);
     }
     public static void findSmall(int[] arr){
        int index=0;
        for(int i=index;i<arr.length;i++){
            int count=0;
            // System.out.println(point);
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
               
                count+=1;
                }
            }
            System.out.println(arr[i]+" ,"+count);
        }
     }
}
