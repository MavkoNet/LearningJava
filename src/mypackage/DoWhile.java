package mypackage;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        /*
        * Имя вводится с клавиатуры.
        * Цикл должен выполняться до тех пор,
        * пока вводимое пользователем значение не станет равным имени Админа
        */

        Scanner scan = new Scanner(System.in);

        String adminName = "Mavka";
        String name;
        do {
            System.out.print("Введите имя Админа: ");
            name = scan.nextLine();
        } while (!adminName.equals(name));
        System.out.println("Поздравляем! Вы ввели верно имя!");

    }
}
