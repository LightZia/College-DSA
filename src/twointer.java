import java.util.Scanner;

public class twointer {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long A = inScan.nextInt();
        long B = inScan.nextInt();
        long C = inScan.nextInt();
        long D = inScan.nextInt();

        if (A >= C && B <= D) {
            System.out.print(A + " " + B);
        }
        else if (C >= A && D <= B) {
            System.out.print(C + " " + D);
        }
        else if (C >= A && C <= B ) {
            System.out.print(C + " " + B);
        }
        else if (D >= A && D <= B) {
            System.out.print(A + " " + D);
        }
        else {
            System.out.print(-1);
        }
    }
}
