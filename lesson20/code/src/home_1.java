import java.nio.channels.ScatteringByteChannel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class home_1 {

            public static void main(String[] args) {

                //Задача 1. Расчет периметра прямоугольника,
                // защита от ввода символов вместо числа и ввода отрицательных чисел.
                // Запросить у пользователя длину и ширину прямоугольника.

                Scanner scanner = new Scanner(System.in);
                String choice = "";
                while (true) {
                    try {
                        System.out.println("Введите ширину прямоугольника: ");
                        double A = scanner.nextDouble();
                        System.out.println("Введите высоту прямоугольника: ");
                        double B = scanner.nextDouble();
                        double area = (A + B) * 2;
                        System.out.println("Площадь тпрямоугольника равна: " + area );
                    } catch (InputMismatchException error) {
                        System.out.println("you entered numbers instead   " + error.getMessage());
                    }

                    System.out.println("continue? y/n ");
                    choice = scanner.next();
                    if (choice.equals("n")) {
                        System.out.println("thnk...bye");
                        break;
                    }


                }
            }}

