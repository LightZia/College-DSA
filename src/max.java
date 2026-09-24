import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();
        int max = 0;

        while (rng > 0) {
            int num = inScan.nextInt();
            if (num > max) {
                max = num;
            }
            rng--;
        }
        System.out.print(max);
    }
}
