import java.util.Scanner;
public class last2dig {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long A = inScan.nextInt();
        long B = inScan.nextInt();
        long C = inScan.nextInt();
        long D = inScan.nextInt();

        if (A > 10000) {
            A = A % 100;
        }if (B > 10000) {
            B = B % 100;
        }if (C > 10000) {
            C = C % 100;
        }if (D > 10000) {
            D = D % 100;
        }

        long mul = A*B*C*D;
        int last = (int)mul%10;
        mul = (int)mul/10;
        int last2 = (int)mul%10;
        System.out.print(last2);
        System.out.print(last);
    }
}
