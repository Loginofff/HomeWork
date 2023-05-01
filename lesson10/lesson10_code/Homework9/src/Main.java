import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите  число: ");
        double a = sc.nextInt();
        if (a < 0) {
            System.out.println("Число должно быть больше нуля ");
        } else  {
            System.out.println("Корень будет: " + Math.sqrt(a));
        }




    }
}