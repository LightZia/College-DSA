import java.util.Scanner;
public class flrceil {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int A = inScan.nextInt();
        int B = inScan.nextInt();

        int div1 = A/B;
        System.out.println("floor " + A + " / " + B + " = " + div1);

        float div4 = (float)A/B;
        int div5;
        if(div4 > div1) {
            div5 = div1 + 1;
        }
        else {
            div5 = div1;
        }
        System.out.println("ceil " + A + " / " + B + " = " + div5);

        float div2 = (float)A/B;
//        System.out.println("float A/B = " + div2);
        div2 = div2*10;
//        System.out.println("Multiply 10 div2 = " + div2);
        int div3 = (int)div2%10;
//        System.out.println("Mod 10 div3 = " + div3);
        if(div3 >= 5) {
            div3 = div1 + 1;
        }
        else {
            div3 = div1;
        }
        System.out.println("round " + A + " / " + B + " = " + div3);
    }
}
