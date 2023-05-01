import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество земель в Германии: ");
        int numStates = scanner.nextInt();

        HashSet<String> states = new HashSet<String>();

        for (int i = 0; i < numStates; i++) {
            System.out.print("Введите название земли: ");
            String stateName = scanner.next();
            states.add(stateName);
        }

        System.out.println("Введенные земли: ");
        for (String state : states) {
            System.out.println(state);
        }
    }
}
