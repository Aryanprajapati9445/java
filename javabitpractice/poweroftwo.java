public class poweroftwo {
    public static void main(String[] args) {
        int a = 32;
        boolean ans = (a & (a-1))==0;
        System.out.println(ans);
    }
}
