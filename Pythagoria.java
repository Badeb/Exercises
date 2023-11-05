import java.util.Scanner;
public class Pythagoria {
    public static double Pytha (double a ,double b) {
        double c=0.0;
        c = (Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        return c;
    }
    public static void main (String [] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println ("please enter the numbers");
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         System.out.println(Pytha(a,b));






    }
}
