import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];
    StepTracker(Scanner scan) {
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца:");
        int monthNumber = scanner.nextInt();
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Месяц с таким номером не существует");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = scanner.nextInt();
        if (dayNumber > 30 || dayNumber < 1) {
            System.out.println("В месяце нет такого дня!");
            return;
        }
        System.out.println("Введите количество шагов");
        int stepNumber = scanner.nextInt();
        if (stepNumber < 0) {
            System.out.println("Количество шагов не может быть отрицательным!");
            return;
        }
        //MonthData monthData =

        //monthToData[monthNumber].daysToData[dayNumber] = stepNumber;
        }

    }
