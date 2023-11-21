import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        int hot = 0;
        int cold = 0;
        int pleasant = 0;
        int count = 0;
        int sum = 0;
        int min = temp;
        int max = temp;

        while (temp > -1000) {
            System.out.println("Enter temperature");
            temp = sc.nextInt();

            if (temp >= 30) {
                System.out.println(temp + " is a hot day");
                count++;
                hot++;
                sum += temp;

            } else if (temp <= 29 && temp >= 17) {
                System.out.println(temp + " is a pleasant day");
                count++;
                pleasant++;
                sum += temp;

            } else if (temp <= 16 && temp > -1000) {
                System.out.println(temp + " is a cold day");
                count++;
                cold++;
                sum += temp;

            } else break;
            if(temp>max) max=temp;
            if(temp<min) min=temp;
        }
            System.out.println("Number of cold days:" + cold);
            System.out.println("Number of pleasant days:" + pleasant);
            System.out.println("Number of hot days:" + hot);

            System.out.println("The average temperature is " + (float) sum / count + "degrees Celsius.");
            System.out.println("The lowest temperature is " + min + " degrees Celsius");
            System.out.println("The highest temperature is " + max + " degrees Celsius");

    }
}