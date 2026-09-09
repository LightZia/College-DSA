import java.util.Scanner;
public class capsmalldig {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        char input = inScan.next().charAt(0);
        if(Character.isDigit(input)) {
            System.out.print("IS DIGIT");
        }
        else if(Character.isUpperCase(input)) {
            System.out.println("ALPHA");
            System.out.print("IS CAPITAL");
        }
        else if(Character.isLowerCase(input)) {
            System.out.println("ALPHA");
            System.out.print("IS SMALL");
        }
    }
}
