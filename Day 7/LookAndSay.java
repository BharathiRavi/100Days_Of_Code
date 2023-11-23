/*
 * 1
 * 11
 * 21
 * 1211
 * 111221
 */

public class LookAndSay {
    public static void main(String[] args) {
        int n=5;
        lookAndSay(n);
    }
    public static void lookAndSay(int n){
        String number="1";
        for(int i=1;i<=n;i++){
            System.out.println(number);
            number=genNewTerm(number);
        }
    }
    public static String genNewTerm(String number){
        StringBuilder res=new StringBuilder();
        int count=1;
        char curEle=number.charAt(0);
        for(int i=1;i<number.length();i++){
            if(curEle==number.charAt(i)){
                count++;
            }else{
                res.append(count);
                res.append(curEle);
                count=1;
                curEle=number.charAt(i);
            }
        }
        res.append(count);
        res.append(curEle);
        return res.toString();
    }
}
