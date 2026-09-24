import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();
        int m = inScan.nextInt();
        int gcd = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                if (i > gcd) {
                    gcd = i;
                }
            }
        }
        System.out.print(gcd);
    }
}
