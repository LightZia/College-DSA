import java.util.Scanner;
public class meNmo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long k = in.nextLong();

        if (a % k == 0 && b % k == 0){
            System.out.print("Both");
        }
        else if (a % k == 0){
            System.out.print("Memo");
        }
        else if (b % k == 0){
            System.out.print("Momo");
        }
        else {
            System.out.print("No One");
        }
    }
}
