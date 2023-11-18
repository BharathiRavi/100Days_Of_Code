
/*
 Create a two-dimensional matrix of numbers like
[[5, 10, 15],
[20, 25, 30],
[35, 40, 45]]
Find the sum of elements in each row and each column and print the results as
follows:
Row sums: [30, 75, 120]
Column sums: [60, 75, 90]
*/
import java.util.Arrays;
public class Sum {
    public static void main(String[] args) {
        int[][] array={
            {5,10,15},
            {20,25,30},
            {35,40,45}
        };
        System.out.println(array.length);
        rowAdding(array);
        columnAdding(array);
    }
    public static void  rowAdding(int[][] array){
        int k=0;
        int[] fresh=new int[array.length];
        for(int [] element:array){
          int sum=0;  
            for(int endEle:element){
                sum=sum+endEle;
                
            }System.out.println(sum);
            fresh[k]=sum;
            k++;
           
        } System.out.println(Arrays.toString(fresh));
    }
            // {5,10,15},
            // {20,25,30},
            // {35,40,45}
                             
      


    public static void columnAdding(int[][] array){
        int k=0;
        int[] fresh2=new int[array.length];
        for(int i=0;i<array.length;i++){
            int sum=0;
            for(int j=0;j<array.length;j++){
                
                sum=sum+array[j][i];
                
            }System.out.println(sum);
            fresh2[k]=sum;k++;
        }System.out.println(Arrays.toString(fresh2));


        // i am back






        
        // for(int i=0;i<array.length;i++){
        //     for(int j=i;j<array.length;j++){
        //         int temp=array[i][j];
        //         array[i][j]=array[j][i];
        //         array[j][i]=temp;
        //     }
            
        
        // }
        // rowAdding(array);
        // for(int[] abc:array){
            
        //         // System.out.println(Arrays.toString(abc));
           
        // }
        
    }
}
