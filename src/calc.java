import java.util.Scanner;
import java.lang.Math;
public class calc {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        String str = inScan.next();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '+') {
                int num1 = 0;
                int num2 = 0;
                int count = 0;
                for (int j = i-1; j >= 0; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num1 = (int)(num1 + B*(Math.pow(10, count)));
                    count++;
                }
                count = 0;
                for (int j = len-1; j > i; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num2 = (int)(num2 + B*(Math.pow(10, count)));
                    count++;
                }
                System.out.println(num1+num2);
            }
            if (str.charAt(i) == '-') {
                int num1 = 0;
                int num2 = 0;
                int count = 0;
                for (int j = i-1; j >= 0; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num1 = (int)(num1 + B*(Math.pow(10, count)));
                    count++;
                }
                count = 0;
                for (int j = len-1; j > i; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num2 = (int)(num2 + B*(Math.pow(10, count)));
                    count++;
                }
                System.out.println(num1-num2);
            }
            if (str.charAt(i) == '*') {
                int num1 = 0;
                int num2 = 0;
                int count = 0;
                for (int j = i-1; j >= 0; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num1 = (int)(num1 + B*(Math.pow(10, count)));
                    count++;
                }
                count = 0;
                for (int j = len-1; j > i; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num2 = (int)(num2 + B*(Math.pow(10, count)));
                    count++;
                }
                System.out.println(num1*num2);
            }
            if (str.charAt(i) == '/') {
                int num1 = 0;
                int num2 = 0;
                int count = 0;
                for (int j = i-1; j >= 0; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num1 = (int)(num1 + B*(Math.pow(10, count)));
                    count++;
                }
                count = 0;
                for (int j = len-1; j > i; j--) {
                    char A = str.charAt(j);
                    int B = A - '0';
                    num2 = (int)(num2 + B*(Math.pow(10, count)));
                    count++;
                }
                System.out.println(num1/num2);
            }
        }
    }
}