import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {4, 5, 65, -6, 8};

        AbstractFinder finder = new SimpleFInder(array);

        System.out.println(finder.find(-6));
        System.out.println(finder.find(80));

        System.out.println(Arrays.toString(array));


    }
}
