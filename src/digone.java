import java.util.Scanner;
public class digone {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();
        while (num >= 10) {
            num = num/10;
        }
        if (num % 2 == 0) {
            System.out.print("EVEN");
        }
        else {
            System.out.print("ODD");
        }
    }
}
