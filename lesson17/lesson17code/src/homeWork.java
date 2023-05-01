public class homeWork {
    public static void main(String[] args) {


        //Задача 1. Имитация броска 2-мя кубиками с 6 гранями.
        //Использовать двухмерный массив. Бросить 10 раз подряд.


        int[][] cube = new int[10][2];
        String number = "number";

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[0].length; j++) {
                cube[i][j] = (int)(Math.random() * (6 - 0 + 1) + 0);
                System.out.println(cube[i][j] + " | " + number);
            }


        }


    }
}