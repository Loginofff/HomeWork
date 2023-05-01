public class chess {
    public static void main(String[] args) {


        //Задача 4 ().* Заполнить двухмерный массив 8 х 8 элементами 0 и 1, как на шахматной достке.
        // 1 - черное поле, 0 - белое поле Вывести массив на печать.


        int [][] chessDesk = new int[8][8];
        // chessDesk [i] [u] - eto elementi dvumernogo massiva{
            for (int i = 0; i < chessDesk.length ; i++) {
                for (int j = 0; j < chessDesk[0].length; j++) {
                    chessDesk[i][j] = (j + i) % 2;
                    System.out.print(chessDesk[i][j] + " | ");
                }
                System.out.println();
            }
        }



}
