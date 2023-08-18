import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker tracker = new StepTracker();

        while (true) {
            printMenu();
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    tracker.addNewNumberStepsPerDay(scanner);
                    break;
                case 2:
                    tracker.goalByStepsPerDay(scanner);
                    break;
                case 3:
                    tracker.printStatistic(scanner);
                    break;
                case 0:
                    System.out.println("Пока!");
                    scanner.close();
                    return;
                default:
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
