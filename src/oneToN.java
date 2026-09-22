import java.util.Scanner;
public class oneToN {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
