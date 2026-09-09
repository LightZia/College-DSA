import java.util.Scanner;
public class crdnt {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        float X = inScan.nextFloat();
        float Y = inScan.nextFloat();
        if (X > 0 && Y > 0) {
            System.out.print("Q1");
        }
        else if (X < 0 && Y > 0) {
            System.out.print("Q2");
        }
        else if (X < 0 && Y < 0) {
            System.out.print("Q3");
        }
        else if (X > 0 && Y < 0) {
            System.out.print("Q4");
        }
        else if (X == 0 && Y != 0) {
            System.out.print("Eixo Y");
        }
        else if (Y == 0 && X != 0) {
            System.out.print("Eixo X");
        }
        else if (X == 0 && Y == 0) {
            System.out.print("Origem");
        }
    }
}
