import java.util.ArrayList;
import java.util.List;

public class maze_problem {
    public static void main(String[] args) {

        System.out.println(maze_obsticle(3, 3, ""));

    }

    static int maze1(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        if (r > 0 && c > 0) {
            return maze1(r - 1, c) + maze1(r, c - 1);
        }
        return 0;
    }

    static int maze2(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = maze2(r, c - 1);
        int right = maze2(r - 1, c);
        return left + right;
    }

    static int maze4(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        return maze4(r - 1, c) + maze4(r, c - 1);
    }

    static List<String> maze(int r, int c, String ans) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(maze(r - 1, c, ans + "D"));
        }

        if (c > 1) {
            list.addAll(maze(r, c - 1, ans + "R"));
        }

        return list;
    }

    static List<String> mazediagonal(int r, int c, String ans) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1 && c > 1) {
            list.addAll(mazediagonal(r - 1, c - 1, ans + "H"));
        }
        if (r > 1) {
            list.addAll(mazediagonal(r - 1, c, ans + "D"));
        }

        if (c > 1) {
            list.addAll(mazediagonal
                    (r, c - 1, ans + "R"));
        }
        return list;


    }    static List<String> maze_obsticle(int r, int c, String ans) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(r!=2||c!=2){

        if (r > 1) {
            list.addAll(maze_obsticle(r - 1, c, ans + "D"));
        }

        if (c > 1) {
            list.addAll(maze_obsticle(r, c - 1, ans + "R"));
        }

        }
        return list;
    }

}
