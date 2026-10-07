import java.util.Scanner;
public class smallPair {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int test =  inScan.nextInt();
        for (int z = 0; z < test; z++) {
            int rng = inScan.nextInt();
            int[] arr = new int[rng];
            for (int y = 0; y < rng; y++) {
                arr[y] = inScan.nextInt();
            }

            int min = Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < rng; i++) {
                for (int j = i+1; j < rng; j++) {
                    sum = (arr[i] + arr[j] + (j - i));
//                    System.out.println(sum);
                    if (min > sum) {
                        min = sum;
    //                    System.out.println(min);
                    }
                }
            }
            System.out.println(min);
        }
    }
}
