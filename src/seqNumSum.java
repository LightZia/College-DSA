import java.util.Scanner;
public class seqNumSum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);

        while (true) {
            int n = inScan.nextInt();
            int m = inScan.nextInt();

            if (n > 0 && m > 0) {
                if (n > m) {
                    int sum = 0;
                    for (int i = m; i <= n; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.print("sum =" + sum);
                }
                else {
                    int sum = 0;
                    for (int i = n; i <= m; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.print("sum =" + sum);
                }
                System.out.println();
            }

            else break;
        }
    }
}
