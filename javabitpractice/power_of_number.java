import java.util.Scanner;

public class power_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int base = sc.nextInt();
        int ans = 1;
        while (power > 0) {
            if((power&1)==1){
                ans *= base;
            }
           base *= base;
            power -= 1;
        }
        System.out.println(ans);
    }
}
