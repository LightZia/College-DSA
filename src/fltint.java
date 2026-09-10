import java.util.Scanner;
import java.lang.Math;
public class fltint {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        float num = inScan.nextFloat();
        int numint = (int)num;
        if(numint == num) {
            System.out.print("int " + numint);
        }
        else {
            System.out.print("float " + numint + " ");
            float mulnum = num*1000;
            mulnum = mulnum%10;
            if(mulnum > 0) {
                System.out.format("%.3f", (num-numint));
            }
            else {
                System.out.format("%.2f", (num-numint));
            }
        }
    }
}
