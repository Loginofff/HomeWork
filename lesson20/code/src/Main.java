import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

        Scanner scanner = new  Scanner(System.in);
        String choice = "";
        while (true) {

            try {
                System.out.println("Input a:");
                int a = scanner.nextInt();
                System.out.println("Input b:");
                int b = scanner.nextInt();
                int c = divisions(a, b);
                System.out.println("a Divided b = " + c);
            } catch (ArithmeticException e) {
                System.out.println(" error " + e.getMessage());
            }
            catch (InputMismatchException error){
                System.out.println("you entered numbers instead   " + error.getMessage());
            }
            System.out.println("continue? y/n ");
            choice = scanner.next();
            if (choice.equals("n")) {
                System.out.println("thnk...bye");
                break;
            }


        }

    }
    public static int divisions (int x, int y) {
        return x / y;
    }


}