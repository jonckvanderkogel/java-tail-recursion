package tailrecursion;

import static tailrecursion.StackTraceHelper.printStackTrace;

public class NormalRecursion {
    public static void main(String... args) {
        System.out.println(factorial(20));
    }

    static Long fact(Long acc, int i) {
        if ( i == 0 ) {
            return acc;
        } else {
            printStackTrace(); // this shows the stack keeps getting larger
            return fact(acc * i, i - 1);
        }
    }

    static Long factorial(int n) {
        if ( n == 0 ) {
            return 1L;
        } else {
            return fact(1L, n);
        }
    }
}
