import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

  private static final String SEP = ":";

  private static final Map<String,String> prices = readFromFile("res/dict.txt");

  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
    System.out.print("Введите количество поисковых слов: ");
  int m = Integer.parseInt(scanner.nextLine());
    for (int i = 0; i < m; i++) {
    System.out.print("Введите слово для поиска: ");
    String word = scanner.nextLine().toLowerCase();
    if (Dictionary.containsKey(word)) {
      System.out.println(Dictionary.get(word));
    } else {
      System.out.println("Не найдено");
    }
  }
    scanner.close();
}

  private final String word;
  private final String value;

  public Dictionary(String word, String value) {
    this.word = word;
    this.value = value;
  }

  private static Map<String, String> readFromFile(String filename) {
    Map<String, String> result = new HashMap<>();
    File dictionaryFile = new File(filename);
    try {
      Scanner scanner = new Scanner(dictionaryFile);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] cells = line.split(SEP);
        try {
          if (cells.length >= 2) {
            String word = cells[0];
            String value = cells[1];
            result.put(word, value);
          } else {
            System.out.println("Некорректная строка файла: " + line);
          }
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Некорректная строка файла: " + line);
        }
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Не найден файл: " + filename);
    }
    return result;
  }
}



