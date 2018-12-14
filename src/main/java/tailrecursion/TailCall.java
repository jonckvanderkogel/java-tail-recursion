package tailrecursion;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall<T> {
    TailCall apply();

    default boolean isComplete() {
        return false;
    }
    default T result() {
        throw new Error("not implemented");
    }
    default T invoke() {
        return Stream.iterate(this, TailCall::apply)
                .filter(TailCall::isComplete)
                .findFirst()
                .get()
                .result();
    }
}
