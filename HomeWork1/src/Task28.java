public class Task28 {
    public static void main(String[] args) {

        // Делать по аналогии с Table/Pair/Printer +
        // Сделать класс Dictionary (словарь). +
        // В нем можно хранить слово и его перевод:
        // dictionary.put("Hello", "Привет");
        // dictionary.put("Bye", "Пока"); +
        // Сделать вложенный класс WordsPair, который хранит слово и его перевод.+
        // Сделать внутренний класс Translator, который имеет метод
        // public String[] translate(String[] text)
        // String[] text = {"Hello", "Friend", "Bye"};
        // translator.translate(text) -> {"Привет", "Friend", "Пока"}
        // В Main продемонстрировать работу программы.


            Dictionary dictionary = new Dictionary();
            dictionary.put("Hello", "Привет");
            dictionary.put("Bye", "Пока");

            Dictionary.Translator translator = dictionary.new Translator();
            String[] text = {"Hello", "Friend", "Bye"};
            String[] translatedText = translator.translate(text);

            for (String word : translatedText) {
                System.out.println(word);
            }
        }
    }
