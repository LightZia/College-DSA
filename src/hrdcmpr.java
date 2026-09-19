import java.util.Scanner;
import java.lang.Math;
public class hrdcmpr {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        int B = inScan.nextInt();
        int C = inScan.nextInt();
        int D = inScan.nextInt();

        double lft = Math.pow(A, B);
        double rt = Math.pow(C, D);

//        System.out.println(lft);
//        System.out.println(rt);

        if (lft > Math.pow(10, 18)) {
            lft = lft/100000000;
            rt = rt/1000000000;
        }
        if(lft > rt) {
            if (A < C && B == D) {
                System.out.print("NO");
            }
            else {
                System.out.print("YES");
            }
        }
        else {
            System.out.print("NO");
        }
    }
}
