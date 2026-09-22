import java.util.Scanner;
public class katryoshka {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        long eyes = inScan.nextLong();
        long mouth = inScan.nextLong();
        long body = inScan.nextLong();

        long count = 0;

        while (body > 0 && eyes > 0) {
            if (2*body < eyes) {
                count = -1;
                System.out.print(body);
                break;
            }
//            System.out.println("Loop In");
            if (mouth > 0) {
//                System.out.println("Mouth IN");
                count++;
                mouth--;
                eyes--;
                body--;
            }
            else if (eyes > 1) {
//                System.out.println("Mouth == 0");
                count++;
                eyes -= 2;
                body--;
            }
            else {
                System.out.println("Break");
                break;
            }
        }
        if (count != -1) {
            System.out.print(count);
        }
    }
}
