import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String st  = sc.next();

        String text = st;
        int t = text.length();
        System.out.println("Количество букв " + t);

        char ch = text.charAt(0);
        System.out.println(" Буква 1: " + ch);

        char ch2 = text.charAt(t - 1); // индекс последней буквы равен l - 1
        System.out.println(" Последняя буква строки : " + ch2);



    }
}