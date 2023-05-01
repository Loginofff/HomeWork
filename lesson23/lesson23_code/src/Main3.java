import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {


        System.out.println("Group list with ages");

        //Задача 1: Создать HashMap с именами и возрастом членов нашей группы.
        // Распечатать списоок группы с возрастами.

        HashMap<String, Integer> group26Map = new HashMap<>();

        group26Map.put("Galina", 44);
        group26Map.put("Oleksandr ", 38);
        group26Map.put("Dmitrijs", 32);
        group26Map.put("Luka", 28);
        group26Map.put("Yulia", 52);
        group26Map.put("Christian", 30);
        group26Map.put("Aleksandra", 16);
        group26Map.put("Egor", 29);
        group26Map.put("Vladimir", 31);
        group26Map.put("Marina", 41);

       // System.out.println(group26Map); - eto bistraja pechatj HashMap

        //delaem prohod po vsem kljucham
        for (String name : group26Map.keySet()){
            System.out.println(name); // v operatore dolzhna uchastvovatj peremennaja chikla
        }
        for (int age : group26Map.values()) {
            System.out.print(age + ", "); }

        for (String st : group26Map.keySet()) {
            System.out.println("Key: " + st + "value: " + group26Map.get(st));
        }





    }
}