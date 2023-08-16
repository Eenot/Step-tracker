import java.util.Scanner;

public class StepTracker {
    Scanner sc;
    MonthData[] monthToData = new MonthData[12];
    StepTracker(Scanner sc) {
        sc = sc;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца:");
        int monthNumber = sc.nextInt();
        if (monthNumber > 12 || monthNumber < 1) {
            System.out.println("Месяц с таким номером не существует");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно)");
        int dayNumber = sc.nextInt();
        if (dayNumber > 30 || dayNumber < 1) {
            System.out.println("В месяце нет такого дня!");
            return;
        }
        System.out.println("Введите количество шагов");
        int stepNumber = sc.nextInt();
        if (stepNumber < 0) {
            System.out.println("Количество шагов не может быть отрицательным!");
            return;
        }

        monthToData[monthNumber].daysToData[dayNumber] = stepNumber;
        }
    }
