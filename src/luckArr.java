import java.util.Scanner;
public class luckArr {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < rng; i++) {
            int n = inScan.nextInt();
            if (n < min) {
                min = n;
                count = 1;
            }
            else if (n == min) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println("Unlucky");
        }
        else {
            System.out.println("Lucky");
        }
    }
}
