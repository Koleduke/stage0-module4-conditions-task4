package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int result;

        result = (first > second) ? 10 : -10;

        // Print the largest number
        System.out.println(result);
    }
}
