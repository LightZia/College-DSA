import java.util.Scanner;
public class charSwitch {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        char a = inScan.next().charAt(0);
        int ascii = (int)a;
        if(Character.isUpperCase(a)) {
            ascii = ascii + 32;
            System.out.print((char)ascii);
        }
        else {
            ascii = ascii - 32;
            System.out.print((char)ascii);
        }
    }
}
