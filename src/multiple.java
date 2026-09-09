import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        int B = inScan.nextInt();
        if (A % B == 0) {
            System.out.print("Multiples");
        }
        else if (B % A == 0) {
            System.out.print("Multiples");
        }
        else {
            System.out.print("No Multiples");
        }
    }
}
