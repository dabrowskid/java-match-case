package tech.dabrowski.matcher;

import java.util.function.Function;

public interface StrictMatchingResult<T, RT> {

    TypeMatcher<RT> thenReturn(Function<T, RT> function);

}
