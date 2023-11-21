/*
 * Given an array of integers, rearrange the array so that the even numbers appear
before the odd numbers.
Sample Input:
    [3, 1, 2, 4 ,7]
Sample Output:
[2, 4, 3, 1]
 */
public class OddEvenOrdering {
    public static void main(String[] args) {
        int[] array={3, 1, 2, 4,0,7};
        /*
         * 2 1 3 4 7 0
         * 2 4 3 1 7 0
         * 2 4 0 1 7 3
         */
        // int[] array={3, 1, 2, 4,5 ,6,7,0};
        rearrange(array);
        printArray(array);
    }
    public static void printArray(int[] array){
        System.out.print("[");
        for(int arr:array){
            System.out.print(arr+",");
        }
        System.out.println("]");
    }
    public static void rearrange(int [] array){
     //3, 1, 2, 4 
     int index=0;
     int point=0;
     for(int i=0;i<array.length;i++){
        if(array[i]%2==0){
           int temp=array[index];
           array[index]=array[point] ;
           array[point]=temp;
           index++;
           point++;
        }else{
            point++;
        }
     }   
    }
}
