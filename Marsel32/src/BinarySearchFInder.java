import java.util.Arrays;

public class BinarySearchFInder extends AbstractFinder {


    public BinarySearchFInder(int[] elements) {
        super(null);
        int[] newElement = Arrays.copyOf(elements, elements.length);
        this.elements = newElement;
        Arrays.sort(this.elements);
    }

    @Override
    public boolean find(int element) {
        System.out.println("Поиск бинарным поиском");
        int left = 0;
        int right = elements.length - 1;
        int middle = left + (right - left) / 2 ;

        while (left <= right) {
            if (element < elements[middle]) {
                right = middle - 1;
            } else if (element > elements[middle]) {
                left = middle + 1;
            } else {
                return true;
            }
            middle = left + (right - left) / 2;
        }

        return false;
    }
}
