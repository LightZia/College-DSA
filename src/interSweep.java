import java.util.Scanner;
public class interSweep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if (a - b == 1 || b - a == 1 || a == b && b != 0) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
