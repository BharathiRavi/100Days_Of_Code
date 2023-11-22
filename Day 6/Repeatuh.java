public class Repeatuh {
    public static void main(String[] args) {
        String input="a1b10";
        repeat(input);
    }
    public static void repeat(String input){
        String data=""+input.charAt(0);
        int time=0;
        StringBuilder result=new StringBuilder();
        for(int i=1;i<input.length();i++){
            char curchar=input.charAt(i);
            if(Character.isDigit(curchar)){
                time=(time*10)+Character.getNumericValue(curchar);
            }else if(Character.isLetter(curchar)){
                result.append(data.repeat(time));
                time=0;data=""+curchar;
            }
        }
        result.append(data.repeat(time));
        System.out.println(result);
    }
}
