package tech.dabrowski.matcher;

import tech.dabrowski.matcher.exceptions.TypeNotMatchedException;

public class NotMatchedMatcher<RT> implements TypeMatcher<RT> {

    private final Object o;

    public NotMatchedMatcher(Object o) {
        this.o = o;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> StrictMatchingResult<T, RT> is(Class<T> classToCheck) {
        if (classToCheck.isAssignableFrom(o.getClass())) {
            return function -> new MatchedMatcher(o, function);
        }
        return function -> new NotMatchedMatcher<>(o);
    }

    @Override
    public RT execute() {
        throw new TypeNotMatchedException();
    }
}
