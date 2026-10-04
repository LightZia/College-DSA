import java.util.Scanner;
public class summation {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        long[] num =  new long[rng];
        for (int i = 0; i < rng; i++) {
            num[i] = inScan.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < rng; i++) {
            sum += num[i];
        }

        if (sum < 0) {
            System.out.println(sum*(-1));
        }
        else System.out.println(sum);
    }
}