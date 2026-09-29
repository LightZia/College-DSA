import java.util.Scanner;
public class shape2 {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int n = inScan.nextInt();

        int count = 1;
        for (int i = n; i > 0; i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < count; k++){
                System.out.print("*");
            }
            count += 2;
            System.out.println();
        }
    }
}
