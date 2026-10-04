import java.util.Scanner;
public class plndrmArr {
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

        int i = 0;
        for (i = 0; i < rng; i++) {
            if (arr2[i] != arr[i]) {
                System.out.print("NO");
                break;
            }
        }

        if (i == rng) {
            System.out.println("YES");
        }
    }
}
