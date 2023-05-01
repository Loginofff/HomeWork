import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readingFromFile {

  public static void main(String[] args) throws IOException {

    //Напишите программу, которая:
    //
    //прочитает целое число из файла res/in.txt
    //переведёт его в двоичную запись
    //запишет его в файл res/out.txt
    //Воспользуйтесь методом decToBin(int number)
    // из задачи 1 предыдущего урока или информацией из разбора домашнего задания.

    File myFile = new File("res/in.txt");
    Scanner scanner = new Scanner(new File("res/in.txt"));
    int fileNumber = scanner.nextInt();
    System.out.println("File number is: " + fileNumber);

    String bin = decToBin(fileNumber);
    System.out.println("FIle in binary is: " + bin);

    FileWriter outputTxt = new FileWriter("res/out.txt");
    outputTxt.write(bin);
    outputTxt.close();


  }


  public static String decToBin(int number) {
    final int radix = 2;
    if (number == 0) {
      return "0";
    }

    StringBuilder result = new StringBuilder(); // String result = "";
    boolean isNegative = number < 0;
    if (isNegative) {
      number = Math.abs(number);
    }

    while (number > 0) {
      result.insert(0, number % radix); // result = number % radix + result;
      number /= radix;
    }
    if (isNegative) {
      result.insert(0, "-"); // result = "-" + result;
    }

    return result.toString();
  }


}







