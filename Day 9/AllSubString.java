public class AllSubString {
    public static void main(String[] args) {
        String word="abcde";
        allSubString(word);
    }
    public static void allSubString(String word){
        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                System.out.println(word.substring(i, j));
            }
        }
    }
}
