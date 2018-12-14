package tailrecursion;

public class TailCalls {
    public static <T> TailCall<T> call(final TailCall nextCall) {
        return nextCall;
    }

    public static <T> TailCall done(final T value) {
        return new TailCall() {
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
