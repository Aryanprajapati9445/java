public class suduko_solver {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 3, 0, 2, 0, 6, 0, 0},
                {0, 9, 0, 0, 0, 5, 0, 0, 0},
                {0, 0, 0, 4, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 2, 8, 0},
                {0, 6, 0, 0, 0, 0, 0, 4, 0},
                {0, 0, 0, 2, 0, 9, 0, 0, 5},
                {0, 0, 7, 0, 0, 0, 3, 0, 0},
                {0, 0, 1, 0, 2, 0, 0, 0, 7},
                {0, 0, 4, 5, 0, 0, 9, 0, 0}};
        solve(board);
        display(board);
    }

    static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyleft = false;
        
        // Find an empty cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptyleft = true;
                    break;
                }
            }
            if (emptyleft) {
                break;
            }
        }
        
        // If no empty cell found, puzzle is solved
        if (!emptyleft) {
            return true;
        }
        
        // Try placing numbers 1-9
        for (int num = 1; num <= 9; num++) {
            if (issafe(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board)) {
                    return true;
                }
                board[row][col] = 0;  // backtrack
            }
        }
        return false;
    }

    static boolean issafe(int[][] board, int row, int col, int num) {
        // Check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }
        
        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }
        
        // Check 3x3 box
        int sqrt = (int)(Math.sqrt(board.length));
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;
        for (int i = startRow; i < startRow + sqrt; i++) {
            for (int j = startCol; j < startCol + sqrt; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}