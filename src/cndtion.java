import java.util.Scanner;
public class cndtion {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        int B = inScan.nextInt();
        if(A >= B) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}
