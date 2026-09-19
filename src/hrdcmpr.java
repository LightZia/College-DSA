import java.util.Scanner;
import java.lang.Math;
public class hrdcmpr {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        long B = inScan.nextLong();
        int C = inScan.nextInt();
        long D = inScan.nextLong();

        double AB = (Math.log(A)*B);
        double CD = (Math.log(C)*D);

        if(AB > CD) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
