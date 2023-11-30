/**
 * A1B10
 */
public class A1B10 {

    public static void main(String[] args) {
        String a="A1b10";
        a1B10(a);
    }
    public static void a1B10(String a){
        if(a.isEmpty()){
            return;
        }
        StringBuilder res=new StringBuilder();
        char wordToPrint=a.charAt(0);
        int times=0;
        for(int i=1;i<a.length();i++){
            char cur=a.charAt(i);
            if(Character.isDigit(cur)){
                times=(times*10)+Character.getNumericValue(cur);
            }else if(Character.isAlphabetic(cur)){
                res.append(String.valueOf(wordToPrint).repeat(times));
                wordToPrint=cur;
                times=0;
            }
        }
        res.append(String.valueOf(wordToPrint).repeat(times));
        System.out.println(res);
    }
}