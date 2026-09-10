import java.util.Scanner;
public class mathexp {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        char op = inScan.next().charAt(0);
        int B = inScan.nextInt();
        char eq = inScan.next().charAt(0);
        int ans = inScan.nextInt();

        if (op == '+') {
            if (A + B == ans) {
                System.out.print("Yes");
            }
            else {
                System.out.print(A+B);
            }
        }

        if (op == '-') {
            if (A -B == ans) {
                System.out.print("Yes");
            }
            else {
                System.out.print(A-B);
            }
        }

        if (op == '*') {
            if (A * B == ans) {
                System.out.print("Yes");
            }
            else {
                System.out.print(A*B);
            }
        }
    }
}
