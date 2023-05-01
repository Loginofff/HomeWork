public class work2 {
    public static void main(String[] args) {
        //... продолжение от урока 16
        //Запустить "Рулетку" 20 раз.
        // В "Рулетке" на круге 36 ячеек, куда может попасть шарик, и два цвета - красный, черный.
        // Результат попытки вывести так: "Выиграл номер NN, четное или нечетное, цвет".
        //Заполнение полей шахматной доски. Двумерный массив.
        //Имитация броска 2-мя кубиками с 6 гранями. Использовать двухмерный массив.


        int[] result =new int[20]; //sjuda polozhim rezultati kolesa
        int[] color = new int[20];
        String[] iven = new String[20];
        String[] color1 = new String[20];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (36 - 0 + 1) + 0); //krutanulu rruletku
            color[i] = (int) (Math.random() * (1 - 0 + 1) + 0); //eto mi zadumivaem cvet}
        if( result[i] % 2 == 0) {
           iven[i] = "chotnoe";
       }else {
           iven[i] = "necjotnoe";
       }
       if (color[i] == 0) {
           color1[i] = "krasnij";
       }
       else {color1[i] = "cornij";

       }
        System.out.println("result number;" + result[i] + " , " + iven[i]  );



        }





    }
}