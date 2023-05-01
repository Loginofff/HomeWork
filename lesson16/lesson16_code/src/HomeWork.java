import java.util.Arrays;

        public class HomeWork {
            public static void main(String[] args) {

                //Задача 1. Задан массив целых чисел:
                // 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
                // Найдите максимальный элемент массива и его индекс.


                int[] array = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};

                // Начальное значение для максимального элемента
                int max = array[0];
                // Начальное значение для индекса максимального элемента
                int maxIndex = 0;

                // Ищем максимальный элемент и его индекс
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        maxIndex = i;
                    }
                }

                System.out.println("Максимальный элемент: " + max);
                System.out.println("Индекс максимального элемента: " + maxIndex);
            }
        }



