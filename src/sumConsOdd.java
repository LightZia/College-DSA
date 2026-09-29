import java.util.Scanner;
public class sumConsOdd {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        for (int i = 1; i <= rng; i++) {
            int x = inScan.nextInt();
            int y = inScan.nextInt();

            if (x > y) {
                int sum = 0;
                for (int j = y+1; j < x; j++) {
                    if (j % 2 != 0) {
                        sum = sum + j;
                    }
                }
                System.out.println(sum);
            }
            else {
                int sum = 0;
                for (int j = x+1; j < y; j++) {
                    if (j % 2 != 0) {
                        sum = sum + j;
                    }
                }
                System.out.println(sum);
            }
        }
    }
}
