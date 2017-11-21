package tech.dabrowski.matcher;

public interface TypeMatcher<RT> {

    <T> StrictMatchingResult <T, RT>  is(Class<T> classToCheck);

    RT execute();

}
