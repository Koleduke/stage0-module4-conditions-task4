package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {

        String res;

        // Maximum among a, b, c
        res = (first > second) ? "first" : "second";

        // Print the largest number
        System.out.println(res);
    }
}
