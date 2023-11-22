public class DecimalToBinary {
    public static void main(String[] args) {
        int num=1010;
        System.out.println(deci(num));
        binary(10);

    }
    public static void binary(int num){
        StringBuilder strb=new StringBuilder();
        while(num>0){
            int rem=num%2;
        num=num/2;
        strb.insert(0,rem);
        
        }
        System.out.println(strb);
    
    }
    
    public static int deci(int num){
        int n=0;
        int result=0;
        if(num==0){
            return 0;
        }
        while(num>0){
            int rem=num%10;
            int temp=rem*(int)(Math.pow(2, n));
            num=num/10;
            result=result+temp;
            n++;
        }
        return result;
    }
}
