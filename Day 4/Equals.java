/*
 * Given an array of integers, find the maximum length of a subarray with an equal
number of 0s and 1s.
Sample Input:
[0, 1, 0, 1, 0, 0, 1, 1]
Sample Output:
8
 */
import java.util.Arrays;
public class Equals {
    public static void main(String[] args) {
        int[] array={0, 1, 0, 1, 0, 0, 1, 0};
        equal(array);
        // returningSubArray(array);
    }
    // public static void subMatrix(int[] array){
    //     if(!equal(array)){
    //         int firstPoint=0;
    //         int endPoint=array.length-1;

    //     }
   
        
       
    // }
    public static void equal(int[] array){
        
    //     int zerocount=0;
    //     int onecount=0;
    //     for(int arr:array){
    //         if(arr==0){
    //             zerocount+=1;
    //         }else{
    //             onecount+=1;
    //         }   
    //     }
    //     if(zerocount==onecount){
    //         System.out.println(Arrays.toString(array));
    //     }
    // }
        int zerocount=0;
        int onecount=0;
        int firstPoint=0;
        int endPoint=array.length-1;

        for(int arr:array){
            if(arr==0){
                zerocount+=1;
            }else{
                onecount+=1;
            }   
        }
        
       
        if(zerocount==onecount){
            System.out.println(Arrays.toString(array));
        }else{
            if(zerocount<onecount){
                System.out.println(zerocount+zerocount);
            }else{
                System.out.println(onecount+onecount);
            }
        }
    }
    // public static void returningSubArray(int[] array){
    //     //{0, 1, 0, 1, 0, 0, 1, 1}
    //     int firstPoint=0;
    //     int endPoint=array.length-1;
    //     for(int arr:array){
            
    //     }
    // }

}
