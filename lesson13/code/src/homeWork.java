import java.util.Scanner;

public class homeWork {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Write word ");
        String word = sc.nextLine();
        System.out.println(" How many times repeat ? ");
        int number = sc.nextInt();
        int i = 0;



        while (i < number) {
            System.out.println(word);
            i ++;
        }


    }}