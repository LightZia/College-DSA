import java.util.Scanner;
public class lowNum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        int[]  arr = new int[rng];
        for (int i = 0; i < rng; i++) {
            arr[i] = inScan.nextInt();
        }
        int low = arr[0];

        for (int i = 1; i < rng; i++) {
            if (arr[i] < low) {
                low = arr[i];
            }
        }

        int i = 0;
        for (i = 0; i < rng; i++) {
            if (low == arr[i]) {
                break;
            }
        }

        System.out.print(low + " " + (i+1));
    }
}
