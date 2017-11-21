# java-match-case
Java version of scala match case (of course much simpler)


usage:


Integer test = 1;
Integer val = Matcher
                .match(test)
                .is(String.class).thenReturn(String::length)
                .is(Integer.class).thenReturn(i -> i)
                .execute();
