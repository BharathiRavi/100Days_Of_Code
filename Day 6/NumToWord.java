public class NumToWord {
    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        StringBuilder words = new StringBuilder();
        
        if (number >= 100) {
            words.append(units[number / 100]).append(" Hundred and ");
            number %= 100;
        }

        if (number >= 11 && number <= 19) {
            words.append(teens[number - 10]);
        } else {
            words.append(tens[number / 10]).append(" ").append(units[number % 10]);
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        // Example usage:
        int number = 234;
        String words = convertToWords(number);
        System.out.println("Input: " + number);
        System.out.println("Output: " + words);
    }
}
