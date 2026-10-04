import java.util.Scanner;
public class posInArr {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        int[] arr = new int[rng];
        for (int i = 0; i < rng; i++) {
            arr[i] = inScan.nextInt();
            if (arr[i] <= 10) {
                System.out.println("A[" + i + "] = " + arr[i]);
            }
        }
    }
}
