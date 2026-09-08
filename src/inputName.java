import java.util.Scanner;
public class inputName {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String S = inScan.next();
        System.out.println("Hello, " + S);
    }
}
