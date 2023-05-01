public class homeWork2 {


  /*Задача 2. В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на
    10 % от предыдущего значения. Определите номер дня, на который пробег спортсмена составит не менее
    target километров. Программа получает на вход действительные числа s и target и должна вывести одно
    натуральное число. */
  public static void main(String[] args) {

 double target = 25;
 double s = 10;   // pervij denj
      int day = 1;

 while (s < target)
 {
     double b = (s * 1.1) + s;// vtoroj denj
     double b1 = b*1.1;
     s ++;}






}}
