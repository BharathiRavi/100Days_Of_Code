/* Implement a function to find the first missing positive integer in an array.
Sample Input:
[3, 4, -1, 1]
Sample Output:
2
 */
import java.util.Arrays;
public class MissingPositive {
    public static void main(String[] args) {
        int[] array={3, 2, -1, 1};
        missing(array);
    }
    public static void missing(int[] array){
        int ele=1;
        int [] arr=new int[array.length];
        for(int i=0;i<array.length;i++){
            arr[i]=ele;
            ele++;
        }
        printArray(arr);
        sort(array,0,array.length-1);
        printArray(array);
        compareMe(arr,array);
    }
    public static void printArray(int[] array){
        System.out.print("[ ");
        for(int arr:array)
        System.out.print(arr+" , ");
        System.out.println(" ]");
        
    }
    public static void sort(int[] array,int low,int high){
        int start=low;
        int end=high;
        int pivot=(low+high)/2;
        if(low>high){
            return;
        }
        while(start<=end){
            while(start<=end && array[start]<array[pivot])start++;
            while(start<=end && array[end]>array[pivot])end--;
            if(start<=end){
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                start++;
                end--;
            }
        }
        sort(array,low,end);
        sort(array,start,high);
        
    }
    public static void compareMe(int[] arr,int[] array){

        int first=0;
        int sec=0;
        for(int i=first;i<arr.length;i++){
            for(int j=sec;j<array.length;j++){
                if(arr[i]==array[j]){
                    first++;
                    sec++;
                    break;
                }else{
                    sec++;
                }
            }
           
        }
        System.out.println(arr[first]);
    }
    public static void esakkiEfficientMethod(int [] array){
        for(int i=0;i<array.length;i++){
            
        }
    }
}
