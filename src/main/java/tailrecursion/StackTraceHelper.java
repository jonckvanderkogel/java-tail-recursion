package tailrecursion;

import static tailrecursion.TailCalls.done;

public class StackTraceHelper {

    public static void printStackTrace() {
        System.out.println(printStackTraceRecursively(new StringBuilder(), Thread.currentThread().getStackTrace(), 0).invoke());
    }

    private static TailCall<StringBuilder> printStackTraceRecursively(final StringBuilder sb, final StackTraceElement[] ste, final int counter) {
        if (ste.length <= counter) {
            return done(sb);
        } else {
            sb.append(ste[counter].toString() + System.lineSeparator());
            int newCounter = counter + 1;
            return () -> printStackTraceRecursively(sb, ste, newCounter);
        }
    }
}
