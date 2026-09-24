import java.util.Scanner;
public class plndrm {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int n = inScanner.nextInt();
        int m = n;

        int rev = 0;
        int mod;

        while (n != 0) {
            mod  = n % 10;
            rev = rev * 10 + mod;
            n = n / 10;
        }

        if (rev == m) {
            System.out.println(rev);
            System.out.print("YES");
        }
        else {
            System.out.println(rev);
            System.out.print("NO");
        }
    }
}
