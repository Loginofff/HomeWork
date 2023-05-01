import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //  Задан массив целых чисел: 46, 13, 1, 10, 67, -4, 20, 56, 11, 35.
        //  Выполнить сортировку массива от меньшего к большему.

        int[] numbers = {46, 13, 1, 10, 67, -4, 20, 56, 11, 35};

        System.out.println(Arrays.toString((numbers)));
        int min, indexOfMin;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            indexOfMin = i;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    indexOfMin = j;
                }

            }
            int temp = numbers[i];
            numbers[i] = numbers[indexOfMin];
            numbers[indexOfMin] = temp;
            System.out.println(Arrays.toString(numbers));

        }

    }
}