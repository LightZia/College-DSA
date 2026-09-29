import java.util.Scanner;
public class pum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();

        for (int i = 1; i <= num*4; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(i + " ");
                i++;
            }
            System.out.print("PUM");
            System.out.println();
        }
    }
}
