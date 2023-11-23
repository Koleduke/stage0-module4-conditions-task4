package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {

        int max = (first > second) ? (first > third ? first : third) : (second > third ? second : third);

        // Print the largest number
        System.out.println(max);
    }
}
