import java.util.Scanner;
public class evenNum {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int num = inScan.nextInt();


        if (num >= 2) {
            for (int i = 1; i <= num; i++) {
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.print(-1);
        }
    }
}
