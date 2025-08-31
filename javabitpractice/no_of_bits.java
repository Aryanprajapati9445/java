import java.util.Scanner;

public class no_of_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bits = (int) (Math.log10(n)/Math.log10(2))+1;
        System.out.println(bits);
    }
}
