import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Количество дней в году:");
        int sum = scaner.nextInt();

        if (sum % 4 == 0  && sum % 100 != 0 )  {
            System.out.println("Вы ввели число " + sum + " год високосный");
        }
        else if (sum % 100 == 0 && sum % 400 == 0)
        { System.out.println("год " + sum +" високосный");}
        else
        { System.out.print("год " + sum +" не високосный");}


    }
}