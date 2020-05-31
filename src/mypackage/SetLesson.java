package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/*
 * Задание.
 * вывести содержимое через foreach, iterator
 * проверить, что во множестве нет дублирующих записей
 */

public class SetLesson {
    public static void main(String[] args) {
        ArrayList<String> unsortArray = new ArrayList<>(Arrays.asList("Яблоко", "Апельсин",
                "Груша", "Мандарин", "Банан", "Яблоко", "Апельсин", "Груша", "Мандарин", "Банан"));
        System.out.println("Оригинальный массив: " + unsortArray + "\n");

        //избавиться от дубликатов
        HashSet<String> noDubsArray = new HashSet<>(unsortArray);

        //вывод через iterator, foreach
        Iterator<String> iterNoDubs = noDubsArray.iterator();
        System.out.println("Вывод через Iterator: ");
        while (iterNoDubs.hasNext()) {
            System.out.println(iterNoDubs.next());
        }
        System.out.println();

        System.out.println("Вывод через foreach: ");
        for (String frut : noDubsArray) {
            System.out.println(frut);
        }
        System.out.println();

    }
}
