import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng = inScan.nextInt();

        int[] arr = new int[rng];
        for (int i = 0; i < rng; i++) {
            arr[i] = inScan.nextInt();
        }

        for (int j = 1; j < rng; j++) {
            for (int i = 0; i < rng; i++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i = 0; i < rng; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
