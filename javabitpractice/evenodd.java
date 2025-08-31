import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = findEvenOdd(n);
        if (ans == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


    }

    private static int findEvenOdd(int n) {
        return n & 1;
    }
}
