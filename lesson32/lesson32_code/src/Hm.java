import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hm {

//Входной файл: in.txt
//В первой строке дано количество записей.
// Далее, каждая запись содержит фамилию кандидата и число голосов,
// отданных за него в одном из штатов. Подведите итоги выборов: для
// каждого из участника голосования определите число отданных за него голосов.
//Пример ввода:
// 5
//McCain 10
//McCain 5
//Obama 9
//Obama 8
//McCain 1
//Пример вывода:
//McCain 16
//Obama 17


  public static void main(String[]args) throws FileNotFoundException {

    readInput("res/in.txt");
  }
  private static void readInput(String filename) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(filename));
    int n = scanner.nextInt();
    scanner.nextLine();
    System.out.println(" v faile " + filename + "budet " + n + "strok s dannimi");
    for (int i = 0; i < n; i++) {
      String lastname = scanner.next();
      int votes = scanner.nextInt();
      scanner.nextLine();
      System.out.println("Stroka " + (i + 1) + " za kondidata '" + lastname + "' otdano " + votes + " golosov ");



    }

  }

}
