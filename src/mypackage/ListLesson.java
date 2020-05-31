package mypackage;

import java.util.ArrayList;
import java.util.Scanner;


public class ListLesson {

    public static void main(String[] args) {
        /*
         * Задание.
         * - вывести содержимое списка через foreach, index, stream
         * - заменить элемент списка и проверить содержит ли список данный элемент
         * - удалить все элементы и проверить пуст ли список
         */

        ArrayList<String> sourceArray = new ArrayList<>();
        sourceArray.add("Слива");
        sourceArray.add("Грецкий орех");
        sourceArray.add("Инжир");
        sourceArray.add("Груша");
        sourceArray.add("Вишня");
        sourceArray.add("Айва");
        sourceArray.add("Абрикос");
        sourceArray.add("Яблоко");

        System.out.println("Оригинальный список: " + sourceArray + "\n");
        ArrayList<String> copySourceArray = new ArrayList<>(sourceArray);

        //index
        System.out.println("Вывод списка с помощью index:");
        for (int i = 0; i < copySourceArray.size(); i++) {
            System.out.println(copySourceArray.get(i));
        }
        System.out.println();

        //foreach
        System.out.println("Вывод списка с помощью foreach:");
        for (String fruit : copySourceArray) {
            System.out.println(fruit);
        }
        System.out.println();

        //stream
        System.out.println("Вывод списка с помощью stream:");
        copySourceArray.stream().forEach(ListLesson::printItemList);
        System.out.println();

        //заменить элемент списка и проверить содержит ли список данный элемент
        System.out.println("Замена 'Грецкий орех' на 'Киви'");
        copySourceArray.set(1, "Киви");
        System.out.println("Содержит ли список 'Киви' ? " + copySourceArray.contains("Киви"));
        System.out.println();

        //удалить все элементы и проверить пуст ли список
        copySourceArray.clear();
        System.out.println("Размер списка после операции удаления: " + copySourceArray.size());

    }

    private static void printItemList(String fruit) {
        System.out.println(fruit);
    }


    /**
     * Заполнить список элементами введенными с клавиатуры
     * Закончить ввод, если следующий элемент "q"
     * Вывести полученный список на экран
     *
     * @deprecated заменен поэлементным добавлением в список
     * оставила себе для примера, чтобы не повторять ошибку с двойным ожиданием ввода
     * и добавлением в список через один введенный элемент
     */

    public static void fillListFromConsole() {

        ArrayList<String> listFromConcole = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите названия фруктов, окончание ввода 'q' ");

        while (true) {
            String str = sc.nextLine();
            if (str.equals("q"))
                break;
            listFromConcole.add(str);
        }

        System.out.println(listFromConcole);

    }

}
