import java.util.Scanner;

public class Div2 {
    public static boolean Divide(int n, int m) {
        if (n % m == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        while (true) {
            if (n > 0 && m > 0) {
                System.out.println(Divide(n, m));
                break;
            }else break;

        }
    }
}
