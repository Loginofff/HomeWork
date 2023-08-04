import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
  private static final String SEP = ":";

  public static void main(String[] args) {
    Map<String, String> dictionary = readDictionaryFromFile();

    Scanner scanner = new Scanner(System.in);
    int m = dictionary.size();

    if (m == 0) {
      System.out.println("Словарь пуст.");
      scanner.close();
      return;
    }

    System.out.println("Количество слов в словаре: " + m);
    System.out.println("Слова из словаря:");

    for (String word : dictionary.keySet()) {
      System.out.println("- " + word);
    }

    System.out.print("Введите количество поисковых слов: ");
    int numSearchWords = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numSearchWords; i++) {
      System.out.print("Введите слово для поиска: ");
      String searchWord = scanner.nextLine().toLowerCase();
      System.out.println(dictionary.getOrDefault(searchWord, "Не найдено"));
    }
    scanner.close();
  }

  private static Map<String, String> readDictionaryFromFile() {
    Map<String, String> dictionary = new HashMap<>();
    try (Scanner scanner = new Scanner(new File("res/dict.txt"))) {
      int n = Integer.parseInt(scanner.nextLine());
      for (int i = 0; i < n; i++) {
        String line = scanner.nextLine();
        String[] parts = line.split(SEP, 2); // Указываем максимальное количество элементов после разделителя
        if (parts.length == 2) {
          String word = parts[0].toLowerCase();
          String value = parts[1];
          dictionary.put(word, value);
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден: " + e);
    }
    return dictionary;
  }
}
