public enum Month { // enumeration - перечисление
  JANUARY("31 день"), // происходит вызов конструктора
  FEBRUARY("28 дней"),
  MARCH("30 день"),
  APRIL("31 день"),
  MAY("30 день"),
  JUNE("28 день"),
  JULY("31 день"),
  AUGUST("30 день"),
  SEPTEMBER("31 день"),
  OCTOBER("30 дней"),
  NOVEMBER("31 день"),
  DECEMBER("31 день");

  // в enum можно добавлять обычные поля и методы, как в любой другой класс
  private final String days;

  Month(String days) {
    this.days = days;
  }

  public String getDays() {
    return days;
  }
}