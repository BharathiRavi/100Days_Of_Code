// 5. Given a two dimensional array of string like
// <”luke”, “shaw”>
// <”wayne”, “rooney”>
// <”rooney”, “ronaldo”>
// <”shaw”, “rooney”>
// Where the first string is “child”, second string is “Father”. And given “ronaldo” we have to find his
// no of grandchildren Here “ronaldo” has 2 grandchildren. So our output should be 2.
import java.util.HashMap;
import java.util.ArrayList;
public class DemoArray{
    public static void main(String[] args) {
        
        String[][] array={
                {"luke", "shaw"},
                {"wayne", "rooney"},
                {"rooney", "ronaldo"},
                {"shaw", "rooney"}
        };
    tree(array,"rooney");
    }
    public static void tree(String[][] array,String target){
        HashMap<String,ArrayList<String> > mapping=new HashMap<>(); 
        for(int i=0;i<array.length;i++){
            mapping.putIfAbsent(array[i][1],new ArrayList<String>());
            mapping.get(array[i][1]).add(array[i][0]);
        } 
        System.out.println(mapping);  
        int count=0;
        ArrayList<String> child=mapping.get(target);
        System.out.println(child);
        for(int i=0;i<child.size();i++){
            if(mapping.containsKey(child.get(i))){
                System.out.println(child.get(i));
            ArrayList<String> grandChild=mapping.get(child.get(i));
            
            count=count+grandChild.size();
            }
        }
        System.out.println(count);
    }

}