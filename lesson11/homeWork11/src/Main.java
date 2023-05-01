import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = sc.next();
        int l = name.length();

        System.out.println("Здавствуйте, " + name.toUpperCase().charAt(0) + name.substring(1, l) + "!");
        String nameCorrect = name.toUpperCase().charAt(0) + name.substring(1, l);


        System.out.println("Вам уже есть 18 лет?");
        String age = sc.next();

        if (age.equalsIgnoreCase("DA") || age.equalsIgnoreCase("Да")) {
            System.out.println("Отлично, " + nameCorrect + " и последний вопрос");
        } else {
            System.out.println(" Ваш возраст пока не обслуживется. Нам очень жаль " + nameCorrect);
            return;
        }

        System.out.println(" Впишите год вашего рождения ");
        int year = sc.nextInt();
        if ( year<2008 ) {
            System.out.println(" Добро пожаловать");
        } else {
            System.out.println("Ваш возраст пока не обслуживется. Нам очень жаль " + nameCorrect);
        }



        }
    }