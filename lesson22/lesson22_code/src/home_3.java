import java.util.HashSet;

public class home_3 {
    public static void main(String[] args) {


        System.out.println("Hash set: ");
        HashSet<String> alphobetSet = new HashSet<>();

        for (int i = 0; i < 26; i++) {
            alphobetSet.add(String.valueOf((char)(65+i)));
        }
        System.out.println(alphobetSet);
        alphobetSet.add("Z");
        System.out.println(alphobetSet);
        alphobetSet.add("t");
        System.out.println(alphobetSet);
        alphobetSet.add("m");
        System.out.println(alphobetSet);


        boolean isPresent = false;
        String element = "Y";
        isPresent = alphobetSet.contains("Y");
        System.out.println("Set contains " + element + ":" + isPresent);

        element = "y";
        isPresent = alphobetSet.contains(element);
        System.out.println("Set contains " + element + ":" + isPresent);

    }}