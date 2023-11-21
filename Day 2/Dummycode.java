// import java.util.Arrays;
// public class Dummycode {
//     public static void main(String[] args) {
//         int [] arr=new int[2];
//         arr[0]=3;
//         arr[1]=5;
//         System.out.println(Arrays.toString(arr));
        // int[][] matrix={
        //     {1,2,3},
        //     {4,5,6}
        // };
        // for(int[] a:matrix){
        //     for(int ab:a){
        //         System.out.println(ab);
        //     }
        //     // System.out.println(Arrays.toString(a));
        // }
//     }
// }
public class Dummycode {
    public static void rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int evenIndex = 0;
        int oddIndex = n - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num;
            } else {
                result[oddIndex--] = num;
            }
        }

        // Copy the result array back to the original array
        System.arraycopy(result, 0, nums, 0, n);
    }

    public static void main(String[] args) {
        int[] sampleInput = {3, 1, 2, 4, 0, 7};
        rearrangeArray(sampleInput);

        // Display the rearranged array
        System.out.print("Output: {");
        for (int i = 0; i < sampleInput.length; i++) {
            System.out.print(sampleInput[i]);
            if (i < sampleInput.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

