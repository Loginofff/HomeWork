import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Alphabet!");

        ArrayList<String> Alphabet = new ArrayList<String>();
        for (int i = 0; i < 26; i++) {
            Alphabet.add(i, String.valueOf(( char)(65 + i)));
            System.out.println(Alphabet);

        }


    }
}