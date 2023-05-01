import java.util.Scanner;

public class homeWork_18 {
    public static void main(String[] args) {


        // Задача 1.
        // Написать метод, определяющий максимум из трех натуральных чисел.
        // Метод должен быть защищен от ввода отрицательных чисел.

        int max = maxNumber();
        System.out.println(max);

        //Задача 2. Написать метод, который находит площадь круга для любого заданного радиуса.
        // Метод должен быть защищен от ввода отрицательного числа и выводить результат с точностью
        // до 3-х знаков после десятичного разделителя.

        double s = circleArea();

    }
    // ___________ methods ________________
    public static int maxNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int a = scanner.nextInt();
        System.out.println("Input positive integer number 2: ");
        int b = scanner.nextInt();
        System.out.println("Input positive integer number 3: ");
        int c = scanner.nextInt();
        while (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("The number can't be negative or 0. Pls, try again!");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }

        int max = a;
        if (b > max) {
             max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

       public static double circleArea () {


           Scanner scanner = new Scanner(System.in);
           System.out.println("Enter radius: ");
           double r = scanner.nextDouble();

           while (r <= 0) {
               System.out.println("The number can't be negative or 0. Pls, try again!");
           }

           double s = Math.PI * (r * r);
           System.out.printf("%.3f", s);
           return s;


       }
}



