package tech.dabrowski.matcher;

public class Matcher {

    private final Object object;

    private Matcher(Object object) {
        this.object = object;
    }

    public static Matcher match(Object objectToMatch) {
        return new Matcher(objectToMatch);
    }

    public <T> MatchingResult<T> is(Class<T> classToMatch) {
        if (classToMatch.isAssignableFrom(object.getClass())) {
            return new MatchedMatchingResult<>(object);
        }
        return new NotMatchedMatchingResult<>(object);
    }


}
