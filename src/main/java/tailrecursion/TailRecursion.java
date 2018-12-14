package tailrecursion;

/*
 * All credits go to:
 * https://blog.knoldus.com/tail-recursion-in-java-8
 * http://www.drdobbs.com/jvm/tail-call-optimization-and-java/240167044
 */
public class TailRecursion {
    public static void main(String... args) {
        System.out.println(Factorial.factorialTailRec(1L, 20).invoke());
    }
}
