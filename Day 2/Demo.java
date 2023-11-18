
/*1. Given a 2D matrix of characters and a target word, determine if the word can be
formed by sequentially traversing adjacent characters in the matrix horizontally or
vertically.
Sample Input:Matrix:
[
['A', 'B', 'C', 'E'],
['S', 'F', 'C', 'S'],
['A', 'D', 'E', 'E']
]
Target Word: "ABCCED"
Sample Output:
TRUE*/

public class Demo {
    public static void main(String[] args) {
              char[][] matrix={
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
                };
                findingWord(matrix,"ABCCED");
    }
    public static void findingWord(char[][] matrix,String target){
        
    }
}