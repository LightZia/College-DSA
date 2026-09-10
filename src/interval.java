import java.util.Scanner;
public class interval {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        float input = inScan.nextFloat();
        if (input > 0 && input <= 24) {
            System.out.print("Interval (0,25]");
        }
        else if (input == 0) {
            System.out.print("Interval [0,25)");
        }
        else if (input == 25) {
            System.out.print("Interval [0,25]");
        }
        else if (input > 24 && input < 25) {
            System.out.print("Interval [0,25]");
        }

        if (input > 25 && input < 50) {
            System.out.print("Interval (25,50]");
        }
        else if (input == 50) {
            System.out.print("Interval (25,50]");
        }

        if (input > 50 && input < 75) {
            System.out.print("Interval (50,75]");
        }
        else if (input == 75) {
            System.out.print("Interval (50,75]");
        }

        if (input > 75 && input < 100) {
            System.out.print("Interval (75,100]");
        }
        else if (input == 100) {
            System.out.print("Interval (75,100]");
        }
        else if (input < 0 || input > 100) {
            System.out.print("Out of Intervals");
        }
    }
}
