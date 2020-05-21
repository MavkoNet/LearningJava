package mypackage;

public class For {
    public static void main(String[] args) throws InterruptedException {
        /*
         * Задано число n = 10, где  n - это количество секунд до старта.
         * Произвести отсчет времени до старта: 10..9..8..7..6..5.....0... и выдать сообщение "поехали!"
         */

        for (int i = 10; i >= 0; i--) {
            System.out.println("До запуска: " + i + " секунд");
            Thread.sleep(1000L);
        }
        System.out.println("Поехали!");
    }
}
