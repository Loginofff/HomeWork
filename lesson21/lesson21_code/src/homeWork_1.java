import java.util.ArrayList;
import java.util.Collections;

public class homeWork_1 {
    public static void main(String[] args)


    //Задача 1. Создать собственный ArrayList, выполнить с ним все операции,
    // которые мы делали на занятии:
    //
    //создать список
    //наполнить элементами
    //распечатать
    //узнать размер (длину)
    //узнать индекс какого-либо элемента
    //удалить какой-либо элемент
    //проверка на наличие
    //добавление дубликата
    //печать списка с индексами
    //сортировка
    //Доп. вопрос - как отредактировать элемент списка?
    {
        System.out.println("ArrayListPracticum");


        ArrayList<String> mushroomsList = new ArrayList<String>();

        mushroomsList.add("Моховик");
        mushroomsList.add("Вешенка");
        mushroomsList.add("Опенок");
        mushroomsList.add("Рыжик");
        mushroomsList.add("Лисичка");
        mushroomsList.add("Груздь");
        mushroomsList.add("Волнушка");
        mushroomsList.add("Зеленушка");
        mushroomsList.add("Боровик");
        mushroomsList.add("Сморчок");
        mushroomsList.add("Ежовик");

        System.out.println(mushroomsList);

        int length = mushroomsList.size();
        System.out.println("List size: " + length);

        int index = mushroomsList.indexOf("Сморчок");
        System.out.println("Index of Сморчок is: " + index);

        mushroomsList.remove("Зеленушка");
        System.out.println(mushroomsList);

        boolean MOH = mushroomsList.contains("Моховик");
        System.out.println(MOH);

        for (int i = 0; i < mushroomsList.size(); i++) {
            System.out.println(i + " " + mushroomsList.get(i));
        }
            Collections.sort(mushroomsList);
            System.out.println(mushroomsList);

            mushroomsList.set(1,"Veshenka");
        System.out.println(mushroomsList);




        }




    }
