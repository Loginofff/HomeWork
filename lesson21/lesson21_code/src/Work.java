import java.util.Scanner;


public class Work {
    public static void main(String[] args) {

        System.out.println("наибольший делитель");

        Scanner scanner = new Scanner(System.in);
        int nod = 0 ;

        System.out.println(" Input 1st number");
        int a = scanner.nextInt();
        System.out.println("Input 2st number");
        int b = scanner.nextInt();
        int min = min(a, b);
        int max = max(a, b);

        for (int i = 1; i <=min ; i++) {
            if (min % i == 0){
                if (max % i == 0){
                  nod = i;
                }
            }

        }

        System.out.println(" НОД чисел " + a + " " + b + " = " + nod);

    }
    public static int min ( int x, int y){
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }
    public static int max ( int x, int y){
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}

