import java.util.Scanner;
public class wntrSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dscnt = sc.nextInt();
        int dscntPrice = sc.nextInt();

        double orgPrice = (double)dscntPrice/(100-dscnt) * 100;

        System.out.printf("%.2f", orgPrice);
    }
}
