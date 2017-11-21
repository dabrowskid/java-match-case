package tech.dabrowski.matcher;

import java.util.function.Function;

public class MatchedMatchingResult<T> implements MatchingResult<T> {

    private final Object o;

    public MatchedMatchingResult(Object o) {
        this.o = o;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <RT> TypeMatcher<RT> thenReturn(Function<T, RT> function) {
        return new MatchedMatcher(o, function);
    }
}
