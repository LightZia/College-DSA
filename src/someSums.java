import java.util.Scanner;
public class someSums {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();
        int a = inScan.nextInt();
        int b = inScan.nextInt();
        int sum2 = 0;

        for (int i = 0; i <= n; i++){

            int temp = i;
            int mod = 0;
            int sum = 0;
            while (temp != 0) {
                mod = temp%10;
                temp /= 10;
                sum += mod;
            }

            if (sum >= a && sum <= b) {
                sum2 += i;
            }
        }
        System.out.print(sum2);
    }
}
