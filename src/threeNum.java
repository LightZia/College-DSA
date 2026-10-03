import java.util.Scanner;
public class threeNum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int rng =  inScan.nextInt();
        int trgt = inScan.nextInt();

        int count = 0;
        for (int i = 0; i <= rng; i++) {
            for (int j = 0; j <= rng; j++) {
                int k = trgt - (i+j);
                if (i + j <= trgt && k <= rng) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}
