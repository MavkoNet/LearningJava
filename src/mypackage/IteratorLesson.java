package mypackage;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLesson {

    /*
     * Задание.
     * вывести содержимое списка через iterator
     */

    public static void main(String[] args) {
        ArrayList<String> arrayForIterator = new ArrayList<>();
        arrayForIterator.add("Слива");
        arrayForIterator.add("Грецкий орех");
        arrayForIterator.add("Инжир");
        arrayForIterator.add("Груша");
        arrayForIterator.add("Вишня");
        arrayForIterator.add("Айва");
        arrayForIterator.add("Абрикос");
        arrayForIterator.add("Яблоко");

        Iterator<String> iterator = arrayForIterator.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
