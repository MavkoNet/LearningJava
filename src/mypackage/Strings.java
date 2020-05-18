package mypackage;

public class Strings {
    public static void main(String[] args) {

        /*  Задание
        * - заменить в строках символ
        * - удалить пробелы в начале и конце строк
        * - сравнить строки, регистронезависимо
        * - выполнить поиск в строке
        */

        String string1 = " Добро%пожаловать%на%курс%автоматизации ";
        String string2 = new String("ДОБРО ПОЖАЛОВАТЬ НА КУРС АВТОМАТИЗАЦИИ ");

        System.out.println("Оригинальные строки:\n" + string1 + "\n" + string2 + "\n");

        string1 = string1.trim().replace('\u0025', ' ');
        string2 = string2.trim();
        System.out.println("Замена символа и удаление пробелов в начале и в конце строк: \n"
                + string1 + "\n" + string2 + "\n");

        System.out.println("Равны ли строки независимо от регистра?" + "\nОтвет: "
                + string1.equalsIgnoreCase(string2) + "\n");

        System.out.println("Есть ли в строке слово \"курс?\"\n" + "Ответ: "
                + string1.contains("курс") + "\n");

        System.out.println("Есть ли в строке буква \"щ\"?\n" + "Ответ: "
                + string2.contains("щ"));

    }
}
