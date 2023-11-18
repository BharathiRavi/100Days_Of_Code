/*
 * Given a list of employees and their respective managers, represented as pairs such
as
where each pair represents an employee and their manager, find the number of
employees directly or indirectly managed by a particular manager. For example, if
given "Charlie," you need to find the number of employees directly or indirectly
managed by "Charlie" based on the relationships in the list.
[("Alice", "Bob"), ("Charlie", "Bob"), ("David", "Charlie"), ("Eva", "Charlie"), ("Fr
ank", "Alice"), ("Grace", "Eva")]
 */

import java.util.HashMap;
import java.util.ArrayList;
public class Eanager {
    public static void main(String[] args) {
        String[][] relate={
                {"Alice", "Bob"},
                {"Charlie", "Bob"}, 
                {"David", "Charlie"}, 
                {"Eva", "Charlie"}, 
                {"Frank", "Alice"},
                 {"Grace", "Eva"}
        };
        grouping(relate,"Charlie");
    }
    public static void grouping(String[][] relate,String target){
        HashMap<String,ArrayList<String>> domi=new HashMap<>()  ;
        for(int i=0;i<relate.length;i++){
                domi.putIfAbsent(relate[i][1], new ArrayList<String>());
                domi.get(relate[i][1]).add(relate[i][0]);

        }System.out.println(domi);
            ArrayList<String> empOne=domi.get(target);
            System.out.println(empOne);
            for(String name:empOne){
                System.out.println(name);
                empTwo(domi,name);
            }
            
            
      }
      public static void empTwo(HashMap<String,ArrayList<String>> domi,String target){
        ArrayList<String> employee=domi.get(target);
        if(employee==null)
          return;
          for(String emp:employee){
            System.out.println(emp);
            empTwo(domi,emp);
          }
      }

}
