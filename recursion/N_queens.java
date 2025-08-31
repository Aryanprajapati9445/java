public class N_queens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[n][n];
        System.out.println(print(arr,0));

    }
    static int  print(boolean[][] board,int r)
    {
        if(r== board.length){
    diplay(board);
    return 1;

        }
        int count =0;
        for(int c=0;c<board.length;c++){
            if(isSafe(board,r,c)){
                board[r][c]=true;
                count += print(board,r+1);
                board[r][c]=false;
            }
        }
    return count;

    }
    private static boolean isSafe(boolean[][] board, int r, int c) {
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }

        }
        int maxleft= Math.min(r,c);
        for(int i=1;i<=maxleft;i++){
            if(board[r-i][c-i]==true){
                return false;
            }
        }
        int maxright= Math.min(r,board.length-c-1);
        for(int i=1;i<=maxright;i++){
            if(board[r-i][c+i]==true){
                return false;
            }
        }
        return true;
    }
    private static void diplay(boolean[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==true){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
