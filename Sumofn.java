public class Sumofn {
    public static int funct (int a) {
        int sum =0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
    public static int gauss (int b){
        return b*(b+1)/2;
    }

    public static void main (String [] args){
        System.out.println(funct(10));
        System.out.println(gauss(10));

    }

}