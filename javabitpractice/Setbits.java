public class Setbits {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(countsetbit(n));
    }
    private static int countsetbit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n -= (n & (-n));

        }
        return count;
    }
}
