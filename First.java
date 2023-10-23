import java.util.Scanner;

public class Second {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int mhour = 0;
    int minute = 0;
    int msecond=0;
    System.out.println("please enter movie's lengt in hours");
    mhour = sc.nextInt();
    minute = sc.nextInt();
    msecond = sc.nextInt();
    if ( minute <30) {
        System.out.println("Short movie");
    }else if (mhour==1 && minute<=60 && minute>=30) {
        System.out.println ("The movie cdan be broadcast on TV as it is");
    }else if (mhour >=2){
        System.out.println("Not suitable");
    }

    }
}
