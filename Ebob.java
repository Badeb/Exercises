import java.util.Scanner;
public class Ebob {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
        Random r = new Random();
    int a =r.nextInt(100);;
    int b =r.nextInt(100);;
    int gcd = 1;

    for(int i =1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;

            }
        }
        System.out.println(a + " and "+ b +"'s gcd is" + gcd);

    }
}
