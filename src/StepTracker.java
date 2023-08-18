import java.util.Scanner;

public class StepTracker {
    MonthData[] monthToData;
    int stepsGoal = 10000;
    Converter conv = new Converter();

    StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    int checkDay(Scanner scanner) {
        int day = scanner.nextInt();
        while (true) {
            if (day > 30 || day < 1) {
                System.out.println("В месяце нет такого дня! \nВведите корректный день.");
                day = scanner.nextInt();
            } else {
                break;
            }
        }
        return day;
    }


    int checkMonth(Scanner scanner) {
        int month = scanner.nextInt();
        while (true) {
            if (month > 12 || month < 1) {
                System.out.println("Месяц с таким номером не существует! \nВведите корректный номер месяца.");
                month = scanner.nextInt();
            } else {
                break;
            }
        }
        return month;
    }

    int checkNumber(Scanner scanner) {
        int number = scanner.nextInt();
        while (true) {
            if (number < 0) {
                System.out.println("Количество шагов не может быть отрицательным!" + "\nВведите корректное количество шагов.");
                number = scanner.nextInt();
            } else {
                break;
            }
        }
        return number;
    }

    void addNewNumberStepsPerDay(Scanner scanner) {
        System.out.println("Введите номер желаемого месяца (от 1 до 12 включительно):");
        int monthNumber = checkMonth(scanner);
        System.out.println("Введите день от 1 до 30 (включительно):");
        int dayNumber = checkDay(scanner);
        System.out.println("Введите количество шагов:");
        int stepsNumber = checkNumber(scanner);

        monthToData[monthNumber-1].days[dayNumber-1] = stepsNumber;
        }

    void goalByStepsPerDay(Scanner scanner) {
        System.out.println("Введите новую цель по количеству шагов на день:");
        stepsGoal = checkNumber(scanner);
        while (true) {
            if (stepsGoal == 0) {
                System.out.println("Цель не может быть нулевой! \nВведите корректное значение.");
                stepsGoal = checkNumber(scanner);
            } else {
                break;
            }
        }
        System.out.println("Цель успешно изменена! Ваша новая цель по количеству шагов: " + stepsGoal + ".");
    }

    void printStatistic(Scanner scanner) {
        System.out.println("Введите номер желаемого месяца: ");
        int month = checkMonth(scanner);
        System.out.println("Статистика за " + month + "-й месяц.\nКоличество пройденных шагов по дням:");
        monthToData[month-1].printDaysAndSteps();
        int sumSteps = monthToData[month-1].sumStepsFromMonth();
        System.out.println("Общее количество шагов за выбранный месяц: " + sumSteps);
        System.out.println("Максимальное пройденное количество шагов за месяц: " + monthToData[month-1].getMaxSteps());
        System.out.println("Среднее пройденное количество шагов за месяц: " + (sumSteps / 30));
        System.out.println("Пройденная за месяц дистанция(в километрах): " + conv.convertToKm(sumSteps));
        System.out.println("Количество сожжённых килокалорий за месяц: " + conv.convertStepsToKcal(sumSteps));
        System.out.println("Лучшая серия за выбранный месяц: " + monthToData[month-1].getBestSeries(stepsGoal) + "\n");
    }
}
