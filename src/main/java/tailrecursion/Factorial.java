package tailrecursion;

import static tailrecursion.TailCalls.call;
import static tailrecursion.TailCalls.done;

public class Factorial{
    public static TailCall<Long> factorialTailRec(final Long factorial, final int number) {
        if (number == 1)
            return done(factorial);
        else
            return call(() -> factorialTailRec(factorial * number, number - 1));
    }
}