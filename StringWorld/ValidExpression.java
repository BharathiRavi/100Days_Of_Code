package StringWorld;


public class ValidExpression {
    public static void main(String[] args) {
        String exp="(a*b)--(b+a)";
        System.out.println(validExpression(exp));
    }
    public static boolean validExpression(String exp){
        int bracket=0;
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='('){
                bracket=bracket+1;
            }
            else if(exp.charAt(i)==')'){
                bracket=bracket-1;
            }
            else if(exp.charAt(i)=='+' ||exp.charAt(i)=='-'||exp.charAt(i)=='*' ||exp.charAt(i)=='/' ){
                if(i+1>exp.length() || !Character.isLetterOrDigit(exp.charAt(i+1)) && !((exp.charAt(i+1))==')')||
                !Character.isLetterOrDigit(exp.charAt(i-1)) && !((exp.charAt(i-1))=='(')){
                    return true;
                }
            }
        }
        return bracket==0;   
    }
}

