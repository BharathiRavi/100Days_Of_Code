/* Given a list of products and their corresponding categories, represented as pairs
like
[("Apple", "Fruit"), ("Spinach", "Vegetable"), ("Banana", "Fruit"), ("Carrot", "Veget
able"), ("Orange", "Fruit")] */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class FruitCate {
    public static void main(String[] args) {
        String[][] family={
            {"Apple", "Fruit"},
            {"Spinach", "Vegetable"},
            {"Banana", "Fruit"},
            {"Carrot", "Vegetable"},
            {"Orange", "Fruit"}
        };
        findCato(family,"Fruit");

        // Scanner scanner=new Scanner(System.in);
        // System.out.println("enter the size : ");
        // int n=scanner.nextInt();
        // String [][] box =new String[n][2];
        // for(int i=0;i<n;i++){
        //     System.out.println("enter the items : ");
        //         String userInput=scanner.next();  
        //         box[i][0]=userInput;
        //     System.out.println("enter the cato : ");
        //         String user2Input=scanner.next();  
        //         box[i][1]=user2Input;
        //     }
        //     for(String [] output:box){
        //         System.out.println(Arrays.toString(output));
        //     }
        // }
    }
    public static void findCato(String[][] family,String target){
        HashMap<String,ArrayList<String>> mapping=new HashMap<>();
        for(int  i=0;i<family.length;i++){
            mapping.putIfAbsent(family[i][1],new ArrayList<String>());
            mapping.get(family[i][1]).add(family[i][0]);
        }
        System.out.println(mapping.get(target)==null?"not found":mapping.get(target));
    }

}
