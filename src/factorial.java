import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner inScan= new Scanner(System.in);
        int test = inScan.nextInt();

        while (test > 0) {
            long num = inScan.nextLong();
            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
            test--;
        }
    }
}
