import java.util.Scanner;

public class Factor {
    public static int factorial (int n ){
        if(n==1) return 1;
        else return n* factorial(n-1);
    }
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        System.out.println("n! is =" + factorial(n));
    }

}