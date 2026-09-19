import java.util.Scanner;
import java.util.Arrays;
public class sortNum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int[] arr = new int[3];
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = inScan.nextInt();
            arr1[i] = arr[i];
        }

        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }
    }
}
