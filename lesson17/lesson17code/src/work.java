import java.util.Arrays;

public class work {

    public static void main(String[] args) {
        //Имеется массив данных - остатки на счетах клиентов банка
        // (задать случайными числами в интервале от 10 000 до 100 000000 д.е., количество клиентских счетов = 20).
        // Произошла деноминация, теперь 1 д.е = 1000 старых д.е. Рассчитайте новые остатки денег на счетах клиентов.

     double[] accountSum = new double[20];
     double random, temp;

        for (int i = 0; i < accountSum.length; i++) {
            random = Math.random() * ((100000000L - 10000 + 1) + 10000);
            temp = Math.round(random * 100.0) / 100.0;
            accountSum[i] = temp;
        }
        System.out.println(Arrays.toString(accountSum));

        double[] accountSumDenominated = new double[20];
        for (int i = 0; i < accountSumDenominated.length; i++) {
            temp = accountSum[i] / 1000.0;
            accountSumDenominated[i] = Math.round(temp * 100.0) / 100;
        }

        System.out.println(Arrays.toString(accountSumDenominated));






        }


    }
