import java.util.HashMap;
import java.util.Scanner;

public class Main {

  private static HashMap<String, String> slangDictionary = new HashMap<>();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Введите количество слов для поиска: ");
      int m = scanner.nextInt();
      scanner.nextLine();

      for (int i = 0; i < m; i++) {
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine().toUpperCase();
        String definition = slangDictionary.get(searchWord);
        if (definition != null) {
          System.out.println(definition);
        } else {
          System.out.println("Не найдено");
        }
      }
    } catch (Exception e) {
      System.out.println("Произошла ошибка. Попробуйте еще раз.");
    }
  }
}
