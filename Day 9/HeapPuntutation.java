/**
 * HeapPuntutation
 */
public class HeapPuntutation {

    public static void main(String[] args) {
        String statement="fjcrej'/;'/ /""/ uhg";
        heapPuntutation(statement);
    }
    public static void heapPuntutation(String statement){
        StringBuilder result=new StringBuilder(statement);
        int left=0;
        int right=statement.length()-1;
        while(left<=right){
            while(left<=right && !Character.isLetter(statement.charAt(left))){
                left++;
            }
            while(left<=right && !Character.isLetter(statement.charAt(right))){
                right--;
            }
            char temp=statement.charAt(right);
            result.setCharAt(right, statement.charAt(left));
            result.setCharAt(left, temp);
            left++;
            right--;
        }
        System.out.println(result);
    }
}