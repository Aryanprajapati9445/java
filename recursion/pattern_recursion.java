public class pattern_recursion {
    public static void main(String[] args) {
        printpatern2(4,0);
    }
    static void printpatern(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            printpatern(r,c+1);
        }else {


            System.out.println();
            printpatern(r - 1, 0);
        }
    }
    static void printpatern2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            printpatern2(r,c+1);
            System.out.print("* ");
        }else {


            printpatern2(r - 1, 0);
            System.out.println();
        }
    }
}
