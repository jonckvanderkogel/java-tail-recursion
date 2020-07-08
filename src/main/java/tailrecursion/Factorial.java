package tailrecursion;

import static tailrecursion.StackTraceHelper.printStackTrace;
import static tailrecursion.TailCalls.done;

public class Factorial {
    public static TailCall<Long> factorialTailRec(final Long factorial, final int number) {
        printStackTrace();
        if (number == 1) {
            return done(factorial);
        } else {
            return () -> factorialTailRec(factorial * number, number - 1);
        }
    }
}