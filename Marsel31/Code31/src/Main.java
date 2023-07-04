

public class Main {
    public static void main(String[] args) {

        Attorney a1 = new Attorney("Доверенность на машину",
                "Марсель", "Кенан", "2023-12-31");

        Attorney a2 = new Attorney("Доверенность на холодильник",
                "Валерий", "Кирилл", "2023-01-10", "2023-02-01");

        DriverLicense dl1 =
                new DriverLicense("Кирилл", "A, B");
        DriverLicense dl2 =
                new DriverLicense("Кенан", "B,B1");

        Contract c1 =
                new Contract( "Контакт на проведение курса", "2023-01-15", 1.5);
        Contract c2 =
                new Contract("Контакт на проведение урока","2023-05-31",555);

        Document[] documents = {a1,a2,dl1,dl2,c1,c2}; //массив документов
        ExpirationDocument[] expirationDocuments = {a1,a2,dl1,dl2};

        for (int i = 0; i < documents.length; i++) {
            System.out.println(documents[i].isValid());
        }
        for (int i = 0; i < expirationDocuments.length; i++) {
            System.out.println(expirationDocuments[i].isValid());
        }

    }
}