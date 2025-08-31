public class factorial {
    public static void main(String[] args) {
        System.out.println(findfact(5));
    }
    static int findfact(int n){
        if(n==1){
            return 1;
        }
        return n*findfact(n-1);
    }
}
