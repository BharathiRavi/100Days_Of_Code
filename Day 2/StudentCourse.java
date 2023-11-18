 /* Create a two-dimensional matrix of student names and their corresponding
subjects, represented as pairs like
[("Alice", "Math"), ("Bob", "Science"), ("Alice", "Physics"), ("Charlie", "Math"),
("Bob", "Math"), ("Alice", "Biology")]
Given a student name, find all the subjects the student is enrolled*/ 
/**
 * StudentCourse
 */
import java.util.HashMap;
import java.util.ArrayList;
public class StudentCourse {

    public static void main(String[] args) {
        String [][] matrix={
            {"Alice", "Math"},
            {"Bob", "Science"},
            {"Alice", "Physics"},
            {"Charlie", "Math"},
            {"Bob", "Math"},
            {"Alice", "Biology"}
        };
        course(matrix,"nnlice");
    }
    public static void course(String[][] matrix,String student){
    //     HashMap<String,ArrayList<String>> mapping=new HashMap<>();
    //     for(int i=0;i<matrix.length;i++){
    //         mapping.putIfAbsent(matrix[i][0],new ArrayList<String>());
    //         mapping.get(matrix[i][0]).add(matrix[i][1]);
    //     }
    //     System.out.println(mapping.get(student)==null?"no studend or course":mapping.get(student));
    // }

    ArrayList<String> result=new ArrayList<>();
        for(String[] sub:matrix){
            System.out.println(sub[0]);
            if(sub[0].equals(student)){
                result.add(sub[1]);
            }
        }
        System.out.println(result); 
}
}