package tailrecursion;

public class NormalRecursion {
    public static void main(String... args) {
        System.out.println(factorial(20000));
    }

    static Long fact(Long acc, int i) {
        if ( i == 0 )
            return acc;
        else
            return fact( acc * i, i - 1);
    }

    static Long factorial(int n) {
        if ( n == 0 )
            return 1L;
        else
            return fact(1L, n);
    }

    // fact(5, 1)
    // fact(4, 5)
    // fact(3, 20)
    // fact(2, 60)
    // fact(1, 120)
    // fact(0, 120)
}
