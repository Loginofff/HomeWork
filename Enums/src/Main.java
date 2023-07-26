import java.util.Scanner;

public class Main {

  //Усовершенствуйте класс Month из классной работы.
  //Добавьте для каждого месяца количество дней.
  //Спросите у пользователя номер месяца (нумерация начинается с 1, январь - первый месяц!)
  // и выведите по номеру название и количество дней.
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Напишите номер месяца от 1-12: ");

    int mounthNumber = scanner.nextInt();
    scanner.nextLine();

    Month chousenMonth = Month.values()[mounthNumber - 1];
    System.out.println("Выбраный месяц: " + chousenMonth + ", количество дней: " + chousenMonth.getDays());

  }
}