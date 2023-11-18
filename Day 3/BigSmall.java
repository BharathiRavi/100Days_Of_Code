public class BigSmall {
    public static void main(String[] args) {
        int[][] big={
            {1,2,3,4},
            {6,7,8,9},
            {4,7,9,0},
            {1,3,9,6}
        };
        int[][] small={
            {4,7},
            {0,0}
        };
        // bigSmall(array,smallArray);
        System.out.println(isbigSmall(big,small));
    }
    public static boolean isbigSmall(int[][] big,int[][] small){
              int m =big.length;
              int n=small.length;
              for(int i=0;i<=m-n;i++){
                for(int j=0;j<=m-n;j++){
                    if(isSubMatrix(big,small,i,j)){
                        return true;
                    }
                }
            }
            return false;
        }
        public static boolean isSubMatrix(int[][] big,int[][] small,int row,int col){
            int n=small.length;
            for(int k=0;k<n;k++){
                for(int l=0;l<n;l++){
                    if(big[row+k][col+l]!=small[k][l]){
                        return false;
                    }
                }
            }
            return true;
        }
}
