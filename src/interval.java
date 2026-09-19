import java.util.Scanner;
public class interval {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        if (num >= 0 && num <= 25) {
            System.out.print("Interval [0,25]");
        }
        if (num > 25 && num <= 50) {
            System.out.print("Interval (25,50]");
        }
        if (num > 50 && num <= 75) {
            System.out.print("Interval (50,75]");
        }
        if (num > 75 && num <= 100) {
            System.out.print("Interval (75,100]");
        }
        if (num < 0 || num > 100) {
            System.out.print("Out of Intervals");
        }

    }
}