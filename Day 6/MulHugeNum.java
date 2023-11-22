public class MulHugeNum {
    public static void main(String[] args) {
        String n1="2";
        String n2="85751951856";
        mul(n1,n2);

    }
    public static void mul(String n1,String n2){
        int i=n1.length()-1;
        int j=n2.length()-1;
        StringBuilder result=new StringBuilder();
        int mul=1;
        int carry=0;
        while(i>=0 || j>=0){
            int x=(i>=0 ? Character.getNumericValue(n1.charAt(i)):1);
            int y=(j>=0 ? Character.getNumericValue(n2.charAt(j)):1);
            mul=(x*y)+carry;
            result.insert(0,mul%10);
            carry=mul/10;
            i--;
            j--;
        }
        if(carry>0)
        result.insert(0, carry);
        System.out.println(result);
    }
}

