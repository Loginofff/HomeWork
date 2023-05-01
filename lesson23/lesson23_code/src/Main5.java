import java.util.Scanner;
import java.util.HashMap;
public class Main5 {

    public static void main(String[] args) {
        boolean repeat = true;
        String mainCurrencie = "EUR";
        double mainRate = 0.0;

        System.out.println("══════════  Конвертер валют ＄€￡ ══════════");

        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        HashMap<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("GBP", 0.72);
        exchangeRates.put("CAD", 1.25);
        exchangeRates.put("AUD", 1.31);
        exchangeRates.put("JPY", 108.92);


        do {
            printMenu();

            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1: {  // Список доступных валют
                    System.out.println("Список доступных валют: ");
                    printOfAvailableCurrencies(exchangeRates);
                    System.out.println("");
                    break;
                }
                case 2: {  // конвертор
                    do {
                        System.out.println("Input the amount you want to convert: \n");
                        double amount = scanner.nextFloat();
                        validAmount(amount);

                        // searchCurrencie(exchangeRates);
                        System.out.println(searchCurrencie(exchangeRates));

                        //  double result = Math.round(amount*searchCurrencie(exchangeRates));
                        //      System.out.println(result);

                        break;
                    } while (true);

                }
                case 3: { //exit
                    return;
                }
            }
        }
        while (true);
    }

    public static void printMenu() {
        System.out.println("\n    〚 МЕНЮ 〛");
        System.out.println(" 1. Просмотреть список доступных валют \n" +
                " 2. Конвертер валют \n" +
                " 3. Выход\n");
        System.out.print("Введите номер пункта меню: \n");
    }


    // print available currencies
    public static void printOfAvailableCurrencies(HashMap<String, Double> currencies) {
        for (String i : currencies.keySet()) {
            System.out.println("Name currencie: " + i + ". Rate carencie: " + currencies.get(i));
        }
        System.out.println("");
    }

    // search available currencie
    public static Double searchCurrencie(HashMap<String, Double> currencies) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of exchangecurrencies: ");
        String choice = scanner.next();

        if (currencies.containsKey(choice.toUpperCase())) {
            System.out.println(currencies.get(choice));
            return currencies.get(choice);
        }
        return null;
    }

    // method check amount
    public static boolean validAmount(double amount) {
        boolean check = false;
        if (amount <= 0.0) {
            System.out.println("Input amount > zero");
        } else if (amount > 1000000.0) {
            System.out.println(" Sorry, the amount is to Big. ");
        }
        check = true;
        return check;
    }
}