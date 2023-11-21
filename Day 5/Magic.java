/**
 * Magic
 */
public class Magic {

    public static void main(String[] args) {
        int num=406;
        System.out.println(isMagicNumber(num));
        dupeMagic(num);
    }
    public static boolean isMagicNumber(int n){
        int total=0;
        int num=n;
        while(num>0){
            int rem=num%10;
            rem=rem*rem*rem;
            num=num/10;
            total=total+rem;
        }
        System.out.println(total);
        // if(total!=n)
        //     return false;
        // return true;
        return total==n;
        
   
        
    }
    public static void dupeMagic(int n){
        int num=n;int total=0;
        while(num>0){
            int rem=num%10;
            total=total+rem;
            num=num/10;
        }
        System.out.println(total);
    }
}