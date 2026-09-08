import java.util.Scanner;
public class circArea {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        double pi = 3.141592653;
        float rad = inScan.nextFloat();
        double area = pi*(rad*rad);
        System.out.print(area);
    }
}
