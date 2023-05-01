import java.util.Scanner;

public class Home_2 {
    public static void main(String[] args) {

        //Задача 2. Напишите программу, которая запрашивет N имен учащихся группы и выводит список имен в столбик.
        // N запрашивется с клавиатуры, имена вносятся в массив для последующей сортировки по алфавиту.
        // Программа должна быть защищена от ввода чисел вместо имен.

        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];
        String choice = "";


        while (true) {
        System.out.println("Input name: ");
            String name1 = scanner.next();
            System.out.println("continue? y/n ");
            choice = scanner.next();
            if (choice.equals("n")) {
                System.out.println("thnk...bye");
                continue;

            }


        }
    }}