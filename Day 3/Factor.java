/*Given a list of strings such as ["apple", "banana", "cherry", "date", "elderberry"],
calculate the sum of weights based on the following conditions:
5 if the length of the string is a perfect square
4 if the length of the string is a multiple of 3
3 if the length of the string is even
Sort the strings based on their weights and print them along with their
respective weights. Display the strings in increasing order.
 */
import java.util.ArrayList;
public class Factor {

    public static void main(String[] args) {
        String [] fruit={"apple", "banana", "cherry", "date", "elderberry"};
        
        ArrayList<Factors> result=new ArrayList<>();
        for(String singleFruit:fruit){
            int weight=0;
            if(square(singleFruit)) weight+=5;
            if(multipleOf3(singleFruit)) weight+=4;
            if(even(singleFruit)) weight+=3;
            System.out.println(singleFruit+" "+weight);
            Factors factors=new Factors(singleFruit,weight);
            result.add(factors);
        
        }
        result.sort(null);
        System.out.println(result);
        
    }
    public static boolean square(String singleFruit){
            for(int i=1;(i*i)<singleFruit.length();i++){
                if(i*i==singleFruit.length())
                return true;
            }
            return false;
    }
    public static boolean multipleOf3(String singleFruit){
            if(singleFruit.length()%3==0)
                return true;
            return false;
    }
    public static boolean even(String singleFruit){
            if(singleFruit.length()%2==0)
                 return true;
            return false;
    }
}