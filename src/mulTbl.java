import java.util.Scanner;
public class mulTbl {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " " + "* " + i + " = " + (num * i));
        }
    }
}
