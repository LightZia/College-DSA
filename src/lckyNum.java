import java.util.Scanner;
public class lckyNum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();
        int m = inScan.nextInt();

        int cnt = 0;
        for (int i = n; i <= m; i++) {
            int j = i;
            while (j != 0) {
                int count = 0;
                if (j % 10 == 4 || j % 10 == 7) {
                    j = j / 10;
                }
                else break;
            }
            if (j == 0) {
                System.out.print(i + " ");
                cnt++;
            }
            else continue;
        }

        if (cnt == 0) {
            System.out.print(-1);
        }

    }
}