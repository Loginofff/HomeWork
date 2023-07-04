public class Pizza {

  private final String name;

  private int price;

  public Pizza(String name, int price) throws IllegalAccessException {
    this.name = name;
    if (price < 0) {
      throw new IllegalAccessException("Cena ne mozhet bitj nizhe 0");
    }
    this.price = price;

  }

  public void setPrice(int price) throws IllegalAccessException {
    if (price < 0) {
      throw new IllegalAccessException("Cena ne mozhet bitj nizhe 0");
    }
    this.price = price;
  }
}