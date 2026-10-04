import java.util.Scanner;
public class rplcmnt {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng =  inScan.nextInt();

        int[] num = new int[rng];
        for (int i = 0; i < rng; i++) {
            num[i] = inScan.nextInt();
            if (num[i] < 0) {
                num[i] = 2;
            }
            else if (num[i] > 0) {
                num[i] = 1;
            }
            else num[i] = 0;
        }

        for (int i = 0; i < rng; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
