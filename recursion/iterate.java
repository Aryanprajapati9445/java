public class iterate {
    public static void main(String[] args) {
        printreverse1(5);
    }

    static void printreverse(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printreverse(n-1);
    }
    static void printreverse1(int n){
        if(n==0){
            return;
        }
        printreverse1(n-1);
        System.out.println(n);
    }
}
