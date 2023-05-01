import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1. Имеются результаты забега на 100 метров группы бегунов из 10 участников.
        // Внести эти результаты в компьютер согласно протоколу. Отсортировать результаты,
        // напечатать кто занял 1-е и кто занял последнее место.
        // Используйте HashMap для хранения результатов забега и ArrayList для сортировки.


        HashMap<String, Double> runners = new HashMap<String, Double>();
        runners.put("USA", 16.17);
        runners.put("USSR", 16.16);
        runners.put("AFR", 22.76);
        runners.put("DEU", 14.77);
        runners.put("LAT", 23.00);
        runners.put("JAP", 108.92);
        runners.put("DAN", 16.18);
        runners.put("GDR", 18.16);
        runners.put("BGG", 15.66);
        runners.put("BRT", 17.77);
        runners.put("SSC", 17.00);
        runners.put("YTS", 33.47);


       ArrayList<Map.Entry<String, Double>> list = new ArrayList<>(runners.entrySet());





    }
}