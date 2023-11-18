/* Given a dictionary of words and their meanings such as
{"apple": "a fruit", "banana": "an edible fruit", "cherry": "a small fruit with a sto
ne", "date": "a sweet fruit", "elderberry": "a dark purple fruit"}
If given a word, find its meaning from the dictionary. If the word is not present in the
dictionary, print "Word not found." */


public class Meaning {
    public static void main(String[] args) {
        String[][] massiveWord={
            {"apple", "a fruit"},
            {"banana", "an edible fruit"},
            {"cherry","a small fruit with a stone"},
            {"date", "a sweet fruit"},
            {"elderberry", "a dark purple fruit"}
        };
        dict(massiveWord,"apple");
    }
    public static void dict(String[][] massiveWord,String target){
        for(String[] word:massiveWord){
            if(word[0].equals(target)){
                System.out.println(word[1]);
                return;
            }
        }
        System.out.println("Word not found");
    }
}
