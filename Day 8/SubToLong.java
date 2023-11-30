public class SubToLong {
    public static void main(String[] args) {
        String str1="systeeemerror";
        String str2="erro";
        subToLong(str1,str2);
        System.out.println(subToLong(str1,str2));
    }
    public static int subToLong(String str1,String str2){
        int l1=str1.length();
        int l2=str2.length();
        for(int i=0;i<(l1-l2);i++){
            boolean match=true;
            // System.out.println(i);
            for(int j=0;j<l2;j++){
                // System.out.println(str2.charAt(j));
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    match=false;
                    break;
                }
            }
            if(match==true){
                return i;
            }
        }
        return -1;
    }
}
