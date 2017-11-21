package tech.dabrowski.matcher;

import java.util.function.Function;

interface MatchingResult<T> {

    <RT> TypeMatcher<RT> thenReturn(Function<T, RT> function);
}
