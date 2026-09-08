import java.util.Scanner;
public class sum1toN {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long num = inScan.nextLong();
//        int count = 1;
        long ans = num*(num + 1)/2;
        System.out.print(ans);
    }
}
