import java.util.Scanner;
public class aliPuzzle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        long d = input.nextLong();

        if (a+b-c == d || a+b*c == d || a-b+c == d || a-b*c == d || a*b+c == d || a*b-c == d) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
