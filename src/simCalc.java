        import java.util.Scanner;
        public class simCalc {
            public static void main(String[] arg) {
                Scanner inScan = new Scanner(System.in);
                int X = inScan.nextInt();
                int Y = inScan.nextInt();
                int sub = X - Y;
                int add = X + Y;
                long mul = (long)X * Y;
                System.out.println(X + " + " + Y + " = " + add);
                System.out.println(X + " * " + Y + " = " + mul);
                System.out.println(X + " - " + Y + " = " + sub);
            }
        }