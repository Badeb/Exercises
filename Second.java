import java.util.Scanner;

public class Second {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int first = 1;
    int second = 1;
        for(int i =1;i<100;++i) {
            if (first <= 100) {
                System.out.println(first);
                int sum = first + second;
                first = second;
                second = sum;
            } else {
                break;
            }
        }
    }
}

