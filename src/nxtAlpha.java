import java.util.Scanner;
public class nxtAlpha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char alpha =  input.next().charAt(0);
        int alphaNum = (int)alpha;
        if (alphaNum == 122){
            alphaNum = 97;
        }
        else {
            alphaNum++;
        }
        alpha = (char)alphaNum;
        System.out.print(alpha);
    }
}
