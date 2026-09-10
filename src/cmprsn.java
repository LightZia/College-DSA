import java.util.Scanner;
public class cmprsn {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        char op = inScan.next().charAt(0);
        int B = inScan.nextInt();

        if (op == '<') {
            if (A < B) {
                System.out.print("Right");
            }
            else {
                System.out.print("Wrong");
            }
        }
        else if (op == '>') {
            if (A > B) {
                System.out.print("Right");
            }
            else {
                System.out.print("Wrong");
            }
        }
        else {
            if (A == B) {
                System.out.print("Right");
            }
            else {
                System.out.print("Wrong");
            }
        }
    }
}
