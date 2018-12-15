package tailrecursion;

public class TailCalls {

    public static <T> TailCall<T> done(final T value) {
        return new TailCall<T>() {
            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public T result() {
                return value;
            }

            @Override
            public TailCall apply() {
                throw new Error("not implemented");
            }
        };
    }
}
