import java.util.Scanner;
public class Fifth {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        long a = 0L;
        System.out.println("Enter the byte");
        a = sc.nextLong();
        if (a<1024) {
            System.out.println(a + " byte");
        }else if (a >= 1024 && a < 1048576) {
            System.out.println(a / 1024 + " kb");
        }else if (a >= 1048576 && a < 1073741824) {
            System.out.println(a / 1048576 + " mb");
        }else if (a <= 1073741824 && a < 1099511627776L) {
            System.out.println(a / 1073741824 + "gb");
        }else {
            System.out.println("ıt is too much");
        }
    }
}
