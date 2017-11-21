package tech.dabrowski.matcher;

import java.util.function.Function;

public class NotMatchedMatchingResult<T> implements MatchingResult<T>{

    private final Object o;

    public NotMatchedMatchingResult(Object o) {
        this.o = o;
    }

    @Override
    public <RT> TypeMatcher<RT> thenReturn(Function<T, RT> function) {
        return new NotMatchedMatcher<>(o);
    }
}
