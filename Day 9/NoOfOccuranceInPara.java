import java.util.HashMap;

/**
 * NoOfOccuranceInPara
 */
public class NoOfOccuranceInPara {

    public static void main(String[] args) {
        String sentence="ba ba ba mu mu cha shin";
        noOfOccuranceInPara(sentence);
    }
    public static void noOfOccuranceInPara(String sentence){
        HashMap<String,Integer> map=new HashMap<>();
        // HashMap<Character,Integer> map=new HashMap<>();
        for(String word:sentence.split(" ")){
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word)+1);
        }
        // for(char ch:sentence.toLowerCase().toCharArray()){
        //     if(ch!=' ' && ch!='.'){
        //         map.putIfAbsent(ch, 0);
        //     map.put(ch,map.get(ch)+1);
        //     }
        // }
        System.out.println(map);
    }
}