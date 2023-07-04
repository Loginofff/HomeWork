import java.time.LocalDate;

public abstract class ExpirationDocument extends Document {
    protected LocalDate expiredDate; // когда заканчивается доверенность

    public ExpirationDocument (String name) {
        super(name);
    }
    public ExpirationDocument (String name, String createdDate) {
        super(name, createdDate);
    }

    public boolean isExpired() {
        // дата окончания документа до текущей даты
        return expiredDate.isBefore(LocalDate.now());
    }
    public boolean isValid(){
        return expiredDate.isAfter(createdDate);
    }
}
