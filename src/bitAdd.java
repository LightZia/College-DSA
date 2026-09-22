import java.util.Scanner;
import java.lang.Math;
public class bitAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int modA, modB;
        float dif = 0;
        float dif1 = 0;
        float dif2 = 0;
        int i = 1;
        while (a != 0 && b != 0) {
            modA = a%2;
            modB = b%2;

            dif = (float)(modA/Math.pow(10, i) + dif);
            dif1 = (float)(modB/Math.pow(10, i) + dif1);

            dif2 = dif+dif1;

            if (modA + modB == 2) {
                break;
            }

            a %= 2;
            b %= 2;
            i++;
        }

        System.out.println(dif2);
    }
}
