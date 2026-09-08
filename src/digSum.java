import java.util.Scanner;
public class digSum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long N = inScan.nextLong();
        long M = inScan.nextLong();
        long modN = N % 10;
//        System.out.println(modN);
        long modM = M % 10;
        int sum = (int)(modN + modM);
//        System.out.println(modM);
        System.out.print(sum);
    }
}
