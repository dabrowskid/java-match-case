package tech.dabrowski.matcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MatcherTest {

    @Test
    void testSimpleMatch() {
        // Given
        String test = "hello";

        // When
        Integer val = Matcher
                .match(test)
                .is(String.class).thenReturn(String::length)
                .execute();

        //Then
        assertEquals(val.intValue(), 5);
    }

    @Test
    public void matchOneOfTwo() {
        // Given
        Integer test = 1;

        //When
        Integer val = Matcher
                .match(test)
                .is(String.class).thenReturn(String::length)
                .is(Integer.class).thenReturn(i -> i)
                .execute();


        //Then
        assertEquals(val.intValue(), 1);

    }


}
