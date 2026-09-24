import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();

        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                break;
            }
        }

        if (i == n) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}