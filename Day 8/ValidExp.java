/**
 * ValidExp
 */
public class ValidExp {

    public static void main(String[] args) {
        String exp="((a+b)+2+(a-b))";
        isValidExp(exp);
        System.err.println(isValidExp(exp));
    }
    public static boolean isValidExp(String exp){
        int brackets=0;
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='('){
                brackets=brackets+1;
            }else if(exp.charAt(i)==')'){
                brackets=brackets-1;
            }else if(exp.charAt(i)=='+' ||exp.charAt(i)=='-' 
            ||exp.charAt(i)=='*' ||exp.charAt(i)=='/'){
                if(i+1>exp.length() || (!Character.isLetterOrDigit(exp.charAt(i-1)))&&
                !(exp.charAt(i-1)==')') ||(!Character.isLetterOrDigit(exp.charAt(i+1)))&&
                !(exp.charAt(i+1)=='(')){
                    return false;
                }

            }
        }
        return brackets==0;
    }
}