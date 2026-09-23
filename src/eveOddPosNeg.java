import java.util.Scanner;
public class eveOddPosNeg {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();

        int even = 0, odd = 0, pos = 0, neg = 0;
        for (int i = 0; i<num; i++){
            int a = inScan.nextInt();
            if (a%2==0){
                even++;
            }
            else {
                odd++;
            }
            if (a > 0) {
                pos++;
            }
            else if (a < 0) {
                neg++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);

    }
}
