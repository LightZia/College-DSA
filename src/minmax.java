import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        int B = inScan.nextInt();
        int C = inScan.nextInt();
        if(A > B && A > C && B > C) {
            System.out.print(C + " ");
            System.out.print(A);
        }
        else if(A >= B && A >= C && C >= B) {
            System.out.print(B + " ");
            System.out.print(A);
        }
        else if(B >= A && B >= C && A >= C) {
            System.out.print(C + " ");
            System.out.print(B);
        }
        else if(B >= A && B >= C && C >= A) {
            System.out.print(A + " ");
            System.out.print(B);
        }
        else if(C >= A && C >= B && B >= A) {
            System.out.print(A + " ");
            System.out.print(C);
        }
        else if(C >= A && C >= B && A >= B) {
            System.out.print(B + " ");
            System.out.print(C);
        }
    }
}
