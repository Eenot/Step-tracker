import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            int i = scanner.nextInt();
            if (i == 1) {
                System.out.println("Выполняется компанда 1");
            } else if (i == 2) {
                System.out.println("Выполняется компанда 2");
            } else if (i == 3) {
                System.out.println("Выполняется компанда 3");
            } else if (i == 0) {
                System.out.println("Пока!");
                scanner.close();
                break;
            } else {
                System.out.println("Такой команды нет");
            }

        }
    }

    public static void printMenu() {
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Изменить цель по количеству шагов в день");
        System.out.println("3 - Напечатать статистику за определённый месяц");
        System.out.println("0 - Выйти из приложения");
    }
}
