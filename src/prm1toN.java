import java.util.Scanner;
public class prm1toN {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();
        int i, j;

        for (i = 2; i <= n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(i + " ");
            }
        }
    }
}
