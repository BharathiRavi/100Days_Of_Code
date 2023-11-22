public class SubString {
    public static int findSubstringIndex(String str1, String str2) {
        int lenStr1 = str1.length();
        int lenStr2 = str2.length();
// "test123string";
        for (int i = 0; i <= lenStr1 - lenStr2; i++) {
            boolean match = true;
            for (int j = 0; j < lenStr2; j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example usage:
        String str1Example1 = "test123string";
        String str2Example1 = "123";
        int resultExample1 = findSubstringIndex(str1Example1, str2Example1);
        System.out.println("Example 1: " + resultExample1);

        String str1Example2 = "testing12";
        String str2Example2 = "1234";
        int resultExample2 = findSubstringIndex(str1Example2, str2Example2);
        System.out.println("Example 2: " + resultExample2);
    }
}


