public class homeWork15 {



  //  Задача 1. Что на входе:
    //Целые числа int. 1,5,10,25.
    //Ввод числа через scanner.
    //Сумма должна делиться от большей части к меньшей.
    //Использовать метод if,else
    //Любое целое число на 25,10,5 или 1.
    //Выводим количество монет


    public static void main(String[] args) {

//        Задача 2. Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
//                Найти среднюю температуру за прошлую неделю.

        int[] mass = new int[7];
        mass = new int[]{6, 7, 7, 11, 10, 11, 11,};

        int days = 0;
        int j = 0;
        while (j < mass.length) {
            days = days + mass[j];
            j++; }
            double average = (double) (days) / (double) (mass.length);
            System.out.println(average);


        }
    }