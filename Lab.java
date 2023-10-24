import java.util.Scanner;

public class Lab {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int first =1;
    int second = 1;
        do {
            System.out.println(first);
            int sum = first + second;
            first = second;
            second = sum;
        }
        while (first<=100) ;



    }
}
