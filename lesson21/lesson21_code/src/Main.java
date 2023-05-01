import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("ArrayListPracticum");


        ArrayList<String> autoBrandList = new ArrayList<String>();

        autoBrandList.add("AUDI");
        autoBrandList.add("BMW");
        autoBrandList.add("Lexus");
        autoBrandList.add("Jaguar");
        autoBrandList.add("Opel");
        autoBrandList.add("Peugeot");
        autoBrandList.add("Volvo");
        autoBrandList.add("KIA");
        autoBrandList.add("ZAZ");
        autoBrandList.add("VW");
        autoBrandList.add("Ferrari");

        System.out.println(autoBrandList);

        int length = autoBrandList.size();
        System.out.println("Numbers of brands in List " + length);

        int index = autoBrandList.indexOf("ZAZ");
        System.out.println(" Index ZAZ in the List : " + index);

        boolean brandPresents = autoBrandList.contains("KIA");
        System.out.println(" Kia Presents " + brandPresents);

        boolean brandPresents1 = autoBrandList.contains("Kia");
        System.out.println(" Kia Presents " + brandPresents1);

        autoBrandList.add("Audi");
        System.out.println(autoBrandList);

        autoBrandList.add("AUDI");
        System.out.println(autoBrandList);

        autoBrandList.remove("AUDI");
        System.out.println(autoBrandList);

        int ind1 = autoBrandList.indexOf("Audi");
        autoBrandList.remove(ind1);
        System.out.println(autoBrandList);

       String brand = autoBrandList.get(5);
        System.out.println(brand);

        for (int i = 0; i < autoBrandList.size(); i++) {
            System.out.println( i + " " + autoBrandList.get (i));
        }

        Collections.sort(autoBrandList);
        System.out.println(autoBrandList);



    }
}