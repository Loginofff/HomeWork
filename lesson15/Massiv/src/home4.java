public class home4 {

    public static void main(String[] args) {

//        Задача 4 ().* Создать массив, в котором храняться даты и температуры.
//        Вывести на печать таблицу с данными по температуре по дням и
//        среднюю температуру за период наблюдения.


        int[] date = new int[7];
        date = new int[]{1, 2, 3, 4, 5, 6, 7,};

        int days = 0;
        int j = 0;
        while (j < date.length) {
            days = days + date[j];
            j++; }
        double average = (double) (days) / (double) (date.length);
        System.out.println(average);


        int[] temp = new int[7];
        temp = new int[]{33, 22, 11, 45, 43, 14, 40,};

        int tem2 = 0;
        int C = 0;
        while (C < temp.length) {
            tem2 = tem2 + temp[C];
            C++; }
        double average2 = tem2 / temp.length;
        System.out.println(average2);

        System.out.println(temp);











    }
}
