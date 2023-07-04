public class Human {


  private int[] age; // хранилище элементов
  private String[] name;
  private int count; // количество элементов, которое мы положили

  public Human() {
    this.name = new String[10000];
    this.age = new int[10000];
    this.count = 0;
  }

  public Human(String name, int age) {
    if (name.equals("")) { // если некорректная ситуация
      this.name = new String[]{"NONAME"};
    } else {
      this.name = new String[]{name};
    }

    if (age <= 1 || age >= 120) { // если некорректная ситуация
      this.age = new int[]{1};
    } else {
      this.age = new int[]{age};
    }


  }

  private static double[] generateRandomArray(int length) {
    double[] array = new double[length];
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.random();
    }
    return array;
  }
}


