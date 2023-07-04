/**
 * 6/12/2023
 * cohort27
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class DriverLicense extends ExpirationDocument {

    private String driver;
    private String category;
    public DriverLicense(String driver, String category) {
        super("Водительские права");
        this.driver = driver;
        this.category = category;
        // дата окончания = дата создания + 10 лет
        this.expiredDate = this.createdDate.plusYears(10);

    }

    public boolean isValid() {
        return super.isValid() && driver != null && category != null;
    }


    public String getDriver() {
        return driver;
    }

    public String getCategory() {
        return category;
    }
}