package tailrecursion;

public class StackTraceHelper {
    public static void printStackTrace() {
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();

        for (StackTraceElement st : ste) {
            sb.append(st.toString() + System.lineSeparator());
        }
        System.out.println(sb);
    }
}
