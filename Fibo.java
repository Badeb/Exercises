import java.util.Scanner;

public class Fibo {
    public static int Fib (int n ) {
        if (n == 1 ) return 1;
        if (n == 0) return 0;
        return Fib(n - 1) + Fib(n - 2);
    }
    public static void main (String [] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter number ");
        int n =sc.nextInt();
        System.out.println("fibonacci terim = " + Fib(n));
        if(n>=0) {
            System.out.println("fibonacci terim = " + Fib(n));
        }

    }
}
