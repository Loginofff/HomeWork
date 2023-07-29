import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {
  private static final String SEP = ":";

  private static final Map<String ,String> prices = readFromFile("res/dict.txt");



  private final String word;
  private final String value;


  public Dictionary(String word, String value) {
    this.word = word;
    this.value = value;
  }
  private static Map<String, String> readFromFile(String filename) {
    Map<String,String> result = new HashMap<>();
    File dictionaryFile = new File(filename);
    try {
      Scanner scanner = new Scanner(dictionaryFile);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        String[] cells = line.split(SEP);
        try {
          String dictionary = cells[0];
          String word1 = cells[1];
          if (!result.containsKey(dictionary)) {
            result.put(dictionary,);
          }
          result.get(dictionary).put(word1);
        } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("Некорректная строка файла: " + line);
        }
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Не найден файл: " + e);
    }
    return result;
  }
}



