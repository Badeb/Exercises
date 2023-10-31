import java.util.Scanner;

public class Div {
    public static boolean Divide(int n , int m){
        if(n%m==0) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Divide(n,m));

    }
}
