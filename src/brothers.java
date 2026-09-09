import java.util.Scanner;
public class brothers {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        String fststr = inScan.next();
        String scdstr = inScan.next();
//        System.out.println(fststr + " " + scdstr);
        String fststr1 = inScan.next();
        String scdstr1 = inScan.next();
//        System.out.println(fststr1 + " " + scdstr1);
        if(scdstr.equals(scdstr1)) {
            System.out.print("ARE Brothers");
        }
        else {
            System.out.print("NOT");
        }
    }
}
