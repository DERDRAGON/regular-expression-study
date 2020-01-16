package com.der.regularexpression.lessonTwo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertTrue;

/**
 * @program: regular-expression
 * @description: ${description}
 * @author: long
 * @create: 2020-01-16 17:03
 */
public class MetacharacterStudy {

    public static void main(String[] args) {
        testMatchCharacters();
    }

    private static void testMatchCharacters() {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("dbcabccbd");
        if (matcher.find()) {
            assertTrue(3 == matcher.start());
        }

        String quote = Pattern.quote("\\");
        pattern = Pattern.compile(quote);
        matcher = pattern.matcher("sfsf\\fsdfsdf");
        if (matcher.find()) {
            assertTrue(4 == matcher.start());
        }

        pattern = Pattern.compile("\\07");
        matcher = pattern.matcher("abc\007abc");
        if (matcher.find()) {
            assertTrue(3 == matcher.start());
        }
    }
}
