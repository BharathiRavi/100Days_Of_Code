

public class BtoD {
    public static void main(String[] args) {
        int num=10;
        binaryToDecimal(num);
        System.out.println(binaryToDecimal(num));
    }
    public static String binaryToDecimal(int num){
        StringBuilder res=new StringBuilder();
        while(num>0){
            int rem=num%2;
            res.insert(0,rem+"");
            num=num/2;
        }
        return res.toString();
    }
}
