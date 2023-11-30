/**
 * RomanToNumerials
 */
import java.util.HashMap;
public class RomanToNumerials {

    public static void main(String[] args) {
        String value="VII";
        System.err.println(romanToNumerials(value));
    }
    public static int romanToNumerials(String value){
        HashMap<Character,Integer> romanMap= new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        int result=0;
        for(int i=0;i<value.length();i++){
            int cur=romanMap.get(value.charAt(i));
            if(i+1<value.length() && romanMap.get(value.charAt(i+1))>cur){
                result=result-cur;
                
            }else{
                result=result+cur;
            }
        }
        return result;
    }
}