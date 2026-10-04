import java.util.Scanner;
public class rvrsng {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        long[] arr = new long[rng];
        for (int i = 0; i < rng; i++) {
            arr[i] = inScan.nextLong();
        }

        long[] arr2 = new long[rng];
        int j = rng - 1;
        for (int i = 0; i < rng; i++) {
            arr2[j--] = arr[i];
        }

        for (int i = 0; i < rng; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
