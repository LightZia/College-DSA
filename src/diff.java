import java.util.Scanner;
public class diff {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long A = inScan.nextLong();
        long B = inScan.nextLong();
        long C = inScan.nextLong();
        long D = inScan.nextLong();
        long X = (A*B)-(C*D);
        System.out.print("Difference = " + X);
    }
}
