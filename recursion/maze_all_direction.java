import java.util.Arrays;

public class maze_all_direction {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] dir=new int[maze.length][maze[0].length];
        allpathstep(0,0,"",maze,dir,1);

    }
    static void allpath(int r, int c, String ans, boolean [][] maze){
        if(r== maze.length-1&&c==maze[0].length-1){
            System.out.println(ans);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            allpath(r+1,c,ans+"R",maze);
        }
        if(c<maze[0].length-1){
            allpath(r,c+1,ans+"D",maze);
        }
        if(r>0){
            allpath(r-1,c,ans+"U",maze);
        }
        if(c>0){
            allpath(r,c-1,ans+"L",maze);
        }
        maze[r][c] = true;
    }
    static void allpathstep(int r, int c, String ans, boolean [][] maze,int [][]dir,int step){
        if(r== maze.length-1&&c==maze[0].length-1){
            System.out.println(ans);

           for(int[]arr:dir){
               System.out.println(Arrays.toString(arr));
           }
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        dir[r][c] = step;
        if(r<maze.length-1){
            allpathstep(r+1,c,ans+"R",maze,dir,step+1);
        }
        if(c<maze[0].length-1){
            allpathstep(r,c+1,ans+"D",maze,dir,step+1);
        }
        if(r>0){
            allpathstep(r-1,c,ans+"U",maze,dir,step+1);
        }
        if(c>0){
            allpathstep(r,c-1,ans+"L",maze,dir,step+1);
        }
        maze[r][c] = true;
        dir[r][c] = 0;
    }
}
