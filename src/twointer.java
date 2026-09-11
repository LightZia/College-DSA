import java.util.Scanner;

public class twointer {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long A = inScan.nextInt();
        long B = inScan.nextInt();
        long C = inScan.nextInt();
        long D = inScan.nextInt();

        if (C >= A && C <= B) {
            System.out.print(C + " " + B);
        }
        else {
            System.out.print(-1);
        }
    }
}
