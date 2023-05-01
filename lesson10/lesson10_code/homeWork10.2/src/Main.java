import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int sum = sc.nextInt();
        int sum2 = sc.nextInt();
        int sum3 = sc.nextInt();

        if ((sum > sum2) && sum > sum3 ) {
            System.out.println("num 1 bigger");
        }
        else if ((sum2 > sum) && (sum2 > sum3 )) {
            System.out.println("num 2 two bigger");
        }
        else if ((sum3 > sum) && (sum3 > sum2)) {
            System.out.println("num 3 bigger");
        }

    }
}