package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int max;

        // Maximum among a, b, c
        max = (first > second) ? first : second;

        // Print the largest number
        System.out.println(max);
    }
}
