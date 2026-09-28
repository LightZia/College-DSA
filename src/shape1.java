import java.util.Scanner;
public class shape1 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
