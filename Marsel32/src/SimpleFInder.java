public class SimpleFInder extends AbstractFinder {


    public SimpleFInder(int[] elements){
        super(elements);
    }

    @Override
    public boolean find(int element) {
        System.out.println("Поиск простым перебором");
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) {
                return true;
            }
        }
        return false;
    }
}
