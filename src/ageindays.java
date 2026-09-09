import java.util.Scanner;
public class ageindays {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int days = inScan.nextInt();
        int month = 0, year = 0;
        while (days >= 365) {
            year++;
            days -= 365;
        }
        while (days >= 30) {
            month++;
            days -= 30;
        }
        System.out.println(year + " years");
        System.out.println(month + " months");
        System.out.println(days + " days");
    }
}
