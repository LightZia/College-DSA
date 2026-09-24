import java.util.Scanner;
public class fxdPass {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int pass = 0;
        int corctPass = 1999;

        while (pass != corctPass) {
            pass = inScan.nextInt();
            if (pass != corctPass) {
                System.out.println("Wrong");
            }
            else {
                System.out.print("Correct");
                break;
            }
        }
    }
}
