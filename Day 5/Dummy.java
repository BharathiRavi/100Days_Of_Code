public class Dummy {
    public static void main(String[] args) {
        int num=5;

       System.out.println(prime(num));
       fact(num);
        System.out.println(metho(num));
        fibo(5);
        reverse(464);
        gcd(48,18);
    }
    public static String prime(int num){
        for(int i=2;i<Math.sqrt(num);i++){
            
                if(num%i==0){
                    return "not prime";
                   
                }
                    
            

        }return "prime";
    }
    public static void fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }System.out.println(fact);
    }
    public static int metho(int num){
        if(num==1){
            return 1;
        }
        return num*metho(num -1);
    }
    public static void fibo(int num){
        int b=1;
        int a=0;
        for(int i=1;i<=num;i++){
            System.out.print(a);
            int temp=b;
            b=a+b;
            a=temp;
        }
        
    }
    public static void reverse(int n){
        int res=0;
        int num=n;
        System.out.println(" ");
       while(num>0){
         int rem=num%10;
         num=num/10;
         res=(res*10)+rem;
         
       }System.out.println(res);
       System.out.println(n);
       if(res==n){
        System.out.println("pali");
       }else{
        System.out.println("not pali");
       }
    }
    public static void gcd(int a,int b){
        
        while(b!=0){
           int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}
