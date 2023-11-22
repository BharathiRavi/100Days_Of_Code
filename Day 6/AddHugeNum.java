

public class AddHugeNum {
    public static void main(String[] args) {
        String num1="12345";
        String num2="356";
        add(num1,num2);
    }
    public static void add(String n1,String n2){
        int i=n1.length()-1;
        int j=n2.length()-1;
        StringBuilder result=new StringBuilder();
        int sum=0;
        int carry=0;
        while(i>=0 || j>=0){
            int x=(i>=0 ? Character.getNumericValue(n1.charAt(i)):0);
            int y=(j>=0 ? Character.getNumericValue(n2.charAt(j)):0);
            sum=x+y+carry;
            result.insert(0, sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        if(carry>0)
        result.insert(0, carry);
        System.out.println(result);


    }
}
