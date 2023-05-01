public class homeWork_2 {


    public static void main(String[] args) {


        //       Задача 2.
        //       Заполнить массив данными наблюдениями атмосферного давления за неделю.
        //       Найдите дату, когда было максимальное давление. А когда минимальное?

        int[] array = {750, 800, 700, 650, 700, 600, 850};
        String[] week = {"Mo","Tu","We","Th","Fr","Sa","Su"};
        // Начальное значение для максимального элемента
        int max = array[0];
        int min = array[0];
        // Начальное значение для индекса максимального элемента
        int maxIndex = 0;
        int minIndex = 0;
        // Ищем максимальный элемент и его индекс
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }}

        System.out.println("Максимальное: " + max);
        System.out.println("Индекс максимального элемента: " + week[maxIndex]);

        System.out.println("Минимальное: " + min);
        System.out.println("Индекс максимального элемента: " + week[minIndex]);
    }}