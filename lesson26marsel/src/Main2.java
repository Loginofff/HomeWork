public class Main2 {

 //На базе класса MyArray реализовать методы:
 //boolean containsAll(MyArray list) - возвращает true,
 // если все элементы списка list содержатся в текущем списке
 //void clear() - очищает список
 //void set(int index, int element) - заменяет элемент в списке под нужным индексом
 //void removeRange(int fromIndex, int toIndex) - удаляет все элементы в заданном диапазоне

 public static void main(String[] args) {

  MyArrayList arrayList = new MyArrayList();
  arrayList.add(4);
  arrayList.add(5);
  arrayList.add(6);
  arrayList.add(7);
  arrayList.remove(4);
  arrayList.addFirst(7 );

  System.out.println(arrayList);
 }

}