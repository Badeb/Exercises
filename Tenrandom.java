import java.util.Random;
import java.util.Scanner;
public class Tenrandom {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for(int i=0;i<=10;i++){
            int a =r.nextInt(100);
            System.out.println(a);
        }


    }
}
