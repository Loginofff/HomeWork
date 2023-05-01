import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson20_code {
    public static void main(String[] args) {
        // Задача 1. Расчет периметра прямоугольника,
        // защита от ввода символов вместо числа, ввода отрицательных чисел.
        // Запросить у пользователя длину и ширину прямоугольника.

        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while (true) {
            try {
                System.out.println("Введите ширину прямоугольника: ");
                double A = scanner.nextDouble();
                if (A < 0) {
                    System.out.println("Ошибка! не может быть отрицательным числом.");
                    continue;
                }
                System.out.println("Введите высоту прямоугольника: ");
                double B = scanner.nextDouble();
                if (B < 0) {
                    System.out.println("Ошибка! не может быть отрицательным числом.");
                    continue;
                }
                double area = (A + B) * 2;
                System.out.println("Площадь прямоугольника равна: " + area);
            } catch (InputMismatchException error) {
                System.out.println("Ошибка!" + error.getMessage());
                scanner.next();
                continue;
            }

            System.out.println("continue? y/n ");
            choice = scanner.next();
            if (choice.equals("n")) {
                System.out.println("thnk...bye");
                break;
            }
        }
    }
}
