package tailrecursion;

public class TailRecursion {
    public static void main(String... args) {
        System.out.println(Factorial.factorialTailRec(1L, 20).invoke());
    }
}
