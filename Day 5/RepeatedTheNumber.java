/*
Form a number system with only 3 and 4. Find the nth number of the number system.
Eg.) The numbers are: 3, 4, 33, 34, 43, 44, 333, 334, 343, 344, 433, 434, 443, 444, 3333, 3334,
3343, 3344, 3433, 3434, 3443, 3444 ....

000   -0
001   -1
010  -2
011  -3
100  -4
101   -5
110  -6
111  -7




 */

/**
 * RepeatedTheNumber
 */
public class RepeatedTheNumber {

    public static void main(String[] args) {
        
        
    }
    public static int binary(int num){
        StringBuilder result=new StringBuilder();
        if(num==0){
            return "0";
        }
        while(num>0){
            int remainder=num%2;
            result.insert(0,remainder);
            num=num/2;
        }
    }
}
