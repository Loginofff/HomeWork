import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {

        System.out.println("Укажите количество часов: ");
        Scanner scanner = new Scanner(System.in);

        // Задача 1. Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        // Необходимо определить, сколько будет амёб через n часов, если первоначально была только одна амёба.

        int hours = scanner.nextInt();
        int amoebas = 1;
        for (int i = 0; i < (hours / 3); i++) {
            amoebas = amoebas * 2;
        }
        System.out.println("За указанное время будет: " + amoebas + " амёб.");
    }
}
