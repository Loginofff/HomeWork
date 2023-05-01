import java.util.Arrays;
import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {
        System.out.println("Input string and numbers ONLY");

        Scanner scanner = new Scanner(System.in);

        // ввод имени
        String name  = inputName();
        System.out.println("Hi, " + name + "!");

        // ввод числа
        int nnum = inputNumber();
        System.out.println(" Number is: "+ nnum);

    }
    // ___________ methods ________________

    // метод считывает имя (строку) и защищен от ввода строки в виде чисел с помощью регулярного выражения
      public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        String inputName = "";
          System.out.println("Input name: ");
          inputName = scanner.nextLine();
          while (!inputName.matches("[ a-zA-Z]+")){
              System.out.println("Invalid name, pls try again.");
              inputName = scanner.nextLine();
          }
          return inputName;
      }

    // метод считывает целое число (строку) и защищен от ввода строки из букв с помощью регулярного выражения
        public static int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        String inputNumber = "";
        int number = 0;
            System.out.println("Input number: ");
            inputNumber = scanner.next();
            while (!inputNumber.matches("[0-9]+")) {
                System.out.println("Invalid number, try again");
           inputNumber = scanner.next();
            }
            return Integer.parseInt(inputNumber); // v int
        }



    // ___________ end of methods ________________
}