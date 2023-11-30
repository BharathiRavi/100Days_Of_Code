public class LookAndSay {
    public static void main(String[] args) {
        int n=5;
        lookAndSay(n);
    }
    public static void lookAndSay(int n){
        String number="1";
        for(int i=1;i<=n;i++){
            System.out.println(number);
            number=generateterm(number);
        }
    }
    public static String generateterm(String number){
        StringBuilder result=new StringBuilder();
        int count=1;
        char currentElement=number.charAt(0);
        for(int i=1;i<number.length();i++){
            if(currentElement==number.charAt(i)){
                count++;
            }else{
                result.append(count);
                result.append(currentElement);
                count=1;
                currentElement=number.charAt(i);
            }
        }
        result.append(count);
        result.append(currentElement);
        return result.toString();
    }
}
