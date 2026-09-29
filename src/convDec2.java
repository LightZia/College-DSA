import java.util.Scanner;
import java.lang.Math;
public class convDec2 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long rng = inScan.nextLong();

        for (long i = 1; i <= rng; i++) {
            int fin = 0;
            long a = inScan.nextLong();
            long mod = 0;
            int count = 0;
            while(a!=0) {
                mod = a%2;
//                System.out.println("remainder: " + mod);
                a /= 2;
//                System.out.println("quotient: " + a);
                if (mod == 1) {
                    count++;
                }
            }

            System.out.println((long)Math.pow(2,count) - 1);
        }
    }
}
