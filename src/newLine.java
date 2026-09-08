import java.util.Scanner;
public class newLine {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();
        long bigNum = inScan.nextLong();
        char abc = inScan.next().charAt(0);
        float decNum = inScan.nextFloat();
        double bigDecNum = inScan.nextDouble();
        System.out.println(num);
        System.out.println(bigNum);
        System.out.println(abc);
        System.out.println(decNum);
        System.out.println(bigDecNum);
    }
}
