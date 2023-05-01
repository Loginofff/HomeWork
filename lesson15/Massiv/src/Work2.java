public class Work2 {


    public static void main(String[] args) {

        System.out.println("Arrays practicum - continue");

        /*Задача 3.
        Даны оценки двух учеников за четверть:
        Ученик1: 5, 3, 3, 4, 5, 4, 5, 5
        Ученик2: 3, 4, 5, 5, 2, 5, 4
        Найдите средний балл для каждого ученика и выясните, кто из них лучше учится.*/

        int[] marks1 = new int[8];
        marks1 = new int[] {5,3,3,4,5,4,5,5};

        int[] marks2 = new int[7];
        marks2 = new int[] {3,4,5,5,2,5,4};

        int sum = 0;
        for (int i = 0; i < marks1.length; i++) {
            sum = sum + marks1[i]; }

            int sum2 = 0;
            int j = 0;
            while (j < marks2.length){
                sum = sum2 + marks2[j];
                j++; }

                double avarage = (double) sum/ (double) marks1.length;
                double avarage2 = (double)sum2/ (double) marks2.length;

                System.out.println(avarage);
                System.out.println(avarage2);

                if (avarage > avarage2) {
                    System.out.println("nr1. besser");
                }

                else {
                    System.out.println("2 oj besser");

                }




                }

            }


