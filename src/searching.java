import java.util.Scanner;
public class searching {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        long[] num =  new long[rng];
        for (int i = 0; i < rng; i++) {
            num[i] = inScan.nextLong();
        }

        long trgt = inScan.nextLong();
        int i = 0;
        for (i = 0; i < rng; i++) {
            if (num[i] == trgt) {
                System.out.println(i);
                break;
            }
        }
        if (i == rng) {
            System.out.println(-1);
        }
    }
}
