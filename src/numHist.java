import java.util.Scanner;
public class numHist {
    public static void main(String[] args) {
        Scanner inScan =  new Scanner(System.in);
        char op = inScan.next().charAt(0);
        int range = inScan.nextInt();

        for (int i = 0; i < range; i++) {
            int num = inScan.nextInt();
            for (int j = 0; j < num; j++) {
                System.out.print(op);
            }
            System.out.println();
        }
    }
}
