import java.util.Scanner;
public class sumDig {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();
        long sum = 0;

        String num = inScan.next();
        for (int i = 0; i < rng; i++) {
            int digit = num.charAt(i) - '0';
            sum += digit;
        }

        System.out.println(sum);
    }
}
