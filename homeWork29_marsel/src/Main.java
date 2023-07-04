import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//        Реализовать класс ArrayUtils
//
//        В данном классе сделать методы для сортировки массива
//        и поиска в нем значений методом бинарного поиска.
//
//        Оба метода должны быть статическими.
//
//                В Main показать работоспособностью

            int[] array = {7, 2, 5, 1, 9, 3};
            ArrayUtils.sort(array);
        System.out.println(Arrays.toString(array));
            ArrayUtils.arraysSort(array);
        System.out.println(Arrays.toString(array));
        int target = 2;
        int index = ArrayUtils.binarySearch(array, target);
        if (index != -1) {
            System.out.println("Значение " + target + " найдено на позиции " + index);
        } else {
            System.out.println("Значение " + target + " не найдено в массиве");
        }


    }
}