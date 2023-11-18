import java.util.HashMap;
import java.util.ArrayList;

public class Manager {
    public static void main(String[] args) {
        String[][] relate={
                {"Alice", "Bob"},
                {"Charlie", "Bob"}, 
                {"David", "Charlie"}, 
                {"Eva", "Charlie"}, 
                {"Frank", "Alice"},
                {"Grace", "Eva"}
        };
        grouping(relate, "Charlie");
    }

    public static void grouping(String[][] relate, String target) {
        HashMap<String, ArrayList<String>> domi = new HashMap<>();
        for (int i = 0; i < relate.length; i++) {
            domi.putIfAbsent(relate[i][1], new ArrayList<String>());
            domi.get(relate[i][1]).add(relate[i][0]);
        }
        System.out.println(domi);

        ArrayList<String> empOne = domi.get(target);
        System.out.println(empOne);

        for (String name : empOne) {
            System.out.println("Employees managed by " + name + ":");
            printManagedEmployees(domi, name);
        }
    }

    private static void printManagedEmployees(HashMap<String, ArrayList<String>> domi, String manager) {
        ArrayList<String> employees = domi.get(manager);
        if (employees == null) {
            return;
        }

        for (String employee : employees) {
            System.out.println(employee);
            printManagedEmployees(domi, employee);
        }
    }
}

