import java.util.ArrayList;
import java.util.Scanner;

public class home_2 {
    public static void main(String[] args) {


//Задача 2. Напишите программу, которая:
//прочитает размер списка (ArrayList) косметических брендов (можно и другие бренды) +
//прочитает элементы списка с клавиатуры +
//выведет список на печать
//"перевернёт" элементы (поменяет местами первый с последним, второй с предпоследним и т.д.)
//выведет изменённый список

        ArrayList<String> autoBrandList = new ArrayList<String>();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();

        System.out.println("Введите элементы списка:");
        for (int i = 0; i < size; i++) {
            String brand = scanner.next();
            autoBrandList.add(brand);
        }

        System.out.println("Исходный список: " + autoBrandList);

        for (int i = 0; i < size / 2; i++) {
            String a = autoBrandList.get(i);
            autoBrandList.set(i,autoBrandList.get(size - i - 1));
            autoBrandList.set(size - i -1, a);
            System.out.println(autoBrandList);

        }


    }
}
