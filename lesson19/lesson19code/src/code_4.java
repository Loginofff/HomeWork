import java.util.Scanner;
public class code_4 {


    public static void main(String[] args) {
        System.out.println( " Break an Continue examples");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = sum + i;
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(sum);

        }




   /*      Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            System.out.println("Input number: ");
            int a = scanner.nextInt();
            if (a<0) {
                break;
            }


        }


      for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(

        );
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }
        System.out.println(" The end of loop "); */
    }
    }