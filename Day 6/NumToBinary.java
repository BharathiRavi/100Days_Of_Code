public class NumToBinary {
    public static void main(String[] args) {
        
    }
    public static String binary(int n){
        StringBuilder result=new StringBuilder();
        if(n==0){
            return "0";
        }
        if(n>0){
            int rem=n%10;
            result.insert(0,rem);
            n=n/2;
        }
    }
}
