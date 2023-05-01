import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String st  = sc.next();
        int l = st.length();

        String st2 = st.substring(0,1);
        String st3 = st.substring(l-1);

        System.out.println("Left Index: " + st2);
        System.out.println("Right Index: " + st3);




    }
}