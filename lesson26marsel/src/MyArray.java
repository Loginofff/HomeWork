public class MyArray {


  //На базе класса MyArray реализовать методы:
  //boolean containsAll(MyArray list) - возвращает true,
  // если все элементы списка list содержатся в текущем списке
  //void clear() - очищает список
  //void set(int index, int element) - заменяет элемент в списке под нужным индексом
  //void removeRange(int fromIndex, int toIndex) - удаляет все элементы в заданном диапазоне


  private int[] elements;

  private int count;

  public MyArray() {
    this.elements = new int[10];
    this.count = 0; // количества элементов в массиве
  }

  public void add(int element) {
    if (count == elements.length) {
      resize();
    }
    this.elements[count] = element;
    this.count++;
  }


  public void resize() {
    int[] newArray = new int[elements.length + elements.length / 2];

    for (int i = 0; i < count; i++) {
      newArray[i] = elements[i];
    }
    this.elements = newArray;
  }

  public void remove(int index) {
    if (index <= 0 || index > count) {
      System.err.println("Неверный Индекс : " + index);
      return;
    }
    for (int i = index; i < count - 1; i++) { //
      elements[i] = elements[i + 1];
    }
    count--;
  }
   /* public void removeElem( int element ) {
      for (int i = 0; i < elements.length; i++) {
        if (element == elements[i]) {
          elements[i] = elements[i + 1];
        }
        count--;
      } */



      public int get(int index) {
        if (index <= 0 || index > count) {
          System.err.println(" Неверный индекс: " + index);
          return -1;
        }
        return elements[index];
      }
      public int getCount(){
        return count;
      }

      public int[] toArray(){
        int[] copy = new int[count];
        for (int i = 0; i < count; i++) {
          copy[i] = elements[i];
        }
        return copy;
      }
    }


