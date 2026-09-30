import java.util.Scanner;
public class fbncci {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num =  inScan.nextInt();
        int sum = 0;

        int x = 0;
        int y = 1;
        if (num == 1) {
            System.out.print(x + " ");
        }
        else if (num == 2) {
            System.out.print(x + " ");
            System.out.print(y + " ");
        }
        else {
            System.out.print(x + " ");
            System.out.print(y + " ");
        }

        if (num > 2) {
            for (int i = 0; i < num-2; i++) {
                sum = x + y;
                x = y;
                y = sum;
                System.out.print(sum + " ");
            }
        }
    }
}
