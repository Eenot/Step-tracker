public class MonthData {
    int[] days;
    MonthData() {
        days = new int[30];
    }

    void printDaysAndSteps() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i+1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int day : days) {
            sumSteps += day;
        }
        return sumSteps;
    }

    int getMaxSteps() {
        int maxSteps = 0;
        for (int day : days) {
            if (maxSteps < day) {
                maxSteps = day;
            }
        }
        return maxSteps;
    }

    int getBestSeries(int goal) {
        int currentSeries = 0;
        int finalSeries = 0;
        for (int day : days) {
            if (day >= goal) {
                currentSeries++;
            } else {
                if (currentSeries > finalSeries) {
                    finalSeries = currentSeries;
                    currentSeries = 0;
                }
            }
        }
        return finalSeries;
    }
}
