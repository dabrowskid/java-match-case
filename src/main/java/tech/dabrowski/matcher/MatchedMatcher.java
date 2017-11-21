package tech.dabrowski.matcher;

import java.util.function.Function;

public class MatchedMatcher<RT> implements TypeMatcher<RT> {

    private final Object o;
    private final Function<Object, RT> function;

    public MatchedMatcher(Object o, Function<Object, RT> function) {
        this.o = o;
        this.function = function;
    }

    @Override
    public <T> StrictMatchingResult<T, RT> is(Class<T> classToCheck) {
        return function -> MatchedMatcher.this;
    }

    @Override
    public RT execute() {
        return function.apply(o);
    }
}
