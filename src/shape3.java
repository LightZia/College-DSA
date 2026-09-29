import java.util.Scanner;
public class shape3 {
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
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = count-2; k > 0; k--){
                System.out.print("*");
            }
            count -= 2;
            System.out.println();
        }
    }
}
