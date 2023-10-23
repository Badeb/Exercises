import java.util.Scanner;
public class Second {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int b = 0;

        System.out.println("Please enter numbers for dividing for a/b");
        a = sc.nextInt();
        b = sc.nextInt();

        if (b==0) {
            System.out.println("undefined");
        }else  {
           System.out.println((float)a/b);
        }
    }
}
