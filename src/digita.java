import java.util.Scanner;
public class digita {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        for (int i = 1; i <= rng; i++) {
            int num = inScan.nextInt();
            do {
                int last = num % 10;
                System.out.print(last + " ");
                num = num / 10;
            }
            while (num != 0);
            System.out.println();
        }
    }
}
