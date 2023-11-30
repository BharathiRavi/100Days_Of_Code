// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// package Day 8;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] array={2,6,4,1,0,8,9};
        System.out.println(Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] array,int low ,int high){
        int pivot=(low+high)/2;
        int start=low;
        int end=high;
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
        quickSort(array,low,end);
        quickSort(array,start,high);
    }
}
