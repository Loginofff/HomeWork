import java.util.Arrays;
import java.util.Scanner;



public class code2 {

    public static void main(String[] args) {
        System.out.println("Search element in array");

//        Задать массив из 10 случайных чисел в интервале от 10 до 100.
//        Пользователь вводит интересующее его число. Определить,
//        есть ли в массиве такое число. Если есть, то указать на каком оно месте.

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (100 - 10 + 1) + 10);

        }

        System.out.println(Arrays.toString(numbers));


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number to search in array: ");
        int num = scanner.nextInt();

        boolean isPresent = false;
        int pointer = -1;

        for (int i = 0; i < numbers.length; i++) {
            if( num == numbers[i]) {
                isPresent = true;
                pointer = i;
            }

        }
        if (isPresent) {
            System.out.println("Element present, index = " + pointer);
        } else {
            System.out.println("Element not presents");
        }



    }
}