public class N_Knight {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] visited = new boolean[n][n];
        findknight(visited, 0, 0, 4);
    }

    static void findknight(boolean[][] visited, int r, int c, int n) {
        if (n == 0) {
            display(visited);
            System.out.println();
            return;
        }
        if (r == visited.length-1 ) {
            return;
        }
        if (c == visited.length) {
            findknight(visited, r + 1, 0, n);
            return;
        }
        if (issafe(visited, r, c)) {
            visited[r][c] = true;
            findknight(visited, r, c + 1, n - 1);
            visited[r][c] = false;
        }
        findknight(visited, r, c + 1, n);
    }


    static boolean issafe(boolean[][] visited, int r, int c) {
        if (isValid(visited, r - 2, c - 1)) {
            if (visited[r - 2][c - 1]) {
                return false;
            }
        }

        if (isValid(visited, r - 1, c - 2)) {
            if (visited[r - 1][c - 2]) {
                return false;
            }
        }
        if (isValid(visited, r - 2, c + 1)) {
            if (visited[r - 2][c + 1]) {
                return false;
            }
        }
        if (isValid(visited, r - 1, c + 2)) {
            if (visited[r - 1][c + 2]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] visited, int r, int c) {
        if(r>=0&& r< visited.length && c>=0&& c< visited[0].length){
            return true;
        }
        return false       ;
    }

    static void display(boolean[][] visited) {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited.length; j++) {
                if (visited[i][j] == true) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }


}