public class StringToNumber {
    public static void main(String[] args) {
        int n=2779;
        System.out.println(stringToNumber(n));
    }
    public static String stringToNumber(int n){
        StringBuilder result=new StringBuilder();
        while (n>0) {
            n--;
            int remainder=n%26;
            result.insert(0, (char)('A'+remainder));
            n=n/26;
            
        }
        return result.toString();
    }
}
