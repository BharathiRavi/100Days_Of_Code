/**
 * SpellingOfNumber
 */
public class SpellingOfNumber {

    public static void main(String[] args) {
        int number=125;
        spellingOfNumber(number);
        System.out.println(spellingOfNumber(number));
    }
    public static String spellingOfNumber(int number){
        String[] units={"","one ","two","three","four","five","six","seven","eight","nine","ten"};
        String[] teens={"","eleeven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
        String word=" ";
        if(number==0){
            return "zero";
        }
        if(number>=1000){
            word +=units[number/1000]+" thousand ";
            number %=1000;
        }
        if(number>=100){
            word +=units[number/100]+" husband ";
            number %=100;
            if(number>0){
                word += " and ";
            }
        }
        if(number>=11 && number<=19){
            word += teens[number-10];
        }else if(number==0 || number>=20){
            word +=tens[number/10];
            number %=10;
        }
        if(number>0){
            word += units[number];
        }
        return word;
    }
}

//  public class SpellingOfNumber {

//     private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//     private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
//     private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

//     public static void main(String[] args) {
//         int number = 201;
//         String wordRepresentation = convertToWord(number);
//         System.out.println(wordRepresentation);
//     }

//     public static String convertToWord(int number) {
//         if (number == 0) {
//             return "Zero";
//         }

//         String word = "";
//         if (number >= 1000) {
//             word += units[number / 1000] + " Thousand ";
//             number %= 1000;
//         }

//         if (number >= 100) {
//             word += units[number / 100] + " Hundred ";
//             number %= 100;
//             if(number>0 ){
//                     word +=" and ";
//             }
//         }

//         if (number >= 11 && number <= 19) {
//             word += teens[number - 10];
//         } else if (number == 10 || number >= 20) {
//             word += tens[number / 10];
//             number %= 10;
//         }

//         if (number > 0) {
//             word += units[number];
//         }

//         return word.trim();
//     }
// }
