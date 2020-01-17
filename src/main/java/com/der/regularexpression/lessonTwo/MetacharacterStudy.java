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
        testPredefinedCharacter();
        testPosixCharacter();
    }

    private static void testPosixCharacter() {
        Pattern pattern = Pattern.compile("\\p{Lower}");
        Matcher matcher = pattern.matcher("ABbdbca12\\tc");
        assertTrue(matcher.find());
        assertTrue(2 == matcher.start());

        pattern = Pattern.compile("\\p{Upper}");
        matcher = pattern.matcher("dbcaABb12\\tc");
        assertTrue(matcher.find());
        assertTrue(4 == matcher.start());

        pattern = Pattern.compile("\\p{ASCII}");
        matcher = pattern.matcher("Bb12\tc");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

        pattern = Pattern.compile("\\p{Alpha}");
        matcher = pattern.matcher("Bb12\tc");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

        pattern = Pattern.compile("\\p{Digit}");
        matcher = pattern.matcher("Bb12\tc");
        assertTrue(matcher.find());
        assertTrue(2 == matcher.start());

        pattern = Pattern.compile("\\p{Alnum}");
        matcher = pattern.matcher("\tBb12c");
        assertTrue(matcher.find());
        assertTrue(1 == matcher.start());

        pattern = Pattern.compile("\\p{Punct}");
        matcher = pattern.matcher("\tBb13@2c");
        assertTrue(matcher.find());
        assertTrue(5 == matcher.start());

        pattern = Pattern.compile("\\p{Graph}");
        matcher = pattern.matcher("Bb12\\tc!");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

        pattern = Pattern.compile("\\p{Print}");
        matcher = pattern.matcher("Bb12\\tc!");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

    }

    private static void testPredefinedCharacter() {
        Pattern pattern = Pattern.compile(".");
        Matcher matcher = pattern.matcher("dbcabcab12\\tc");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

        pattern = Pattern.compile("\\d");
        matcher = pattern.matcher("sfsfgfdf9sdfsdf");
        assertTrue(matcher.find());
        assertTrue(8 == matcher.start());

        pattern = Pattern.compile("\\s");
        matcher = pattern.matcher("dbcabcab12 c");
        assertTrue(matcher.find());
        assertTrue(10 == matcher.start());

        pattern = Pattern.compile("\\S");
        matcher = pattern.matcher("dbcabcab12 c");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

        pattern = Pattern.compile("\\w");
        matcher = pattern.matcher("  dbcabcab12 c");
        assertTrue(matcher.find());
        assertTrue(2 == matcher.start());

        pattern = Pattern.compile("\\W");
        matcher = pattern.matcher("dbcabcab12 c");
        assertTrue(matcher.find());
        assertTrue(10 == matcher.start());

    }

    private static void testMatchCharacters() {
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher("dbcabcabc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        String quote = Pattern.quote("\\");
        pattern = Pattern.compile(quote);
        matcher = pattern.matcher("sfsf\\fsdfsdf");
        assertTrue(matcher.find());
        assertTrue(4 == matcher.start());

        pattern = Pattern.compile("\\07");
        matcher = pattern.matcher("abc\007abc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("\\\\007");
        matcher = pattern.matcher("abc\\007abc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("\\0101");
        matcher = pattern.matcher("abcAabc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("\\x41");
        matcher = pattern.matcher("abcAabc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("\t");
        matcher = pattern.matcher("abc\tAabc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("\n");
        matcher = pattern.matcher("abc\nAabc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("\r");
        matcher = pattern.matcher("abc\rAabc");
        assertTrue(matcher.find());
        assertTrue(3 == matcher.start());

        pattern = Pattern.compile("[abc]");
        matcher = pattern.matcher("dbcabcabc");
        assertTrue(matcher.find());
        assertTrue(1 == matcher.start());

        pattern = Pattern.compile("[^abc]");
        matcher = pattern.matcher("dbcabcabc");
        assertTrue(matcher.find());
        assertTrue(0 == matcher.start());

        pattern = Pattern.compile("[a-zA-Z]");
        matcher = pattern.matcher("2342334289sdf23420dfghjfklgj");
        assertTrue(matcher.find());
        assertTrue(10 == matcher.start());

        pattern = Pattern.compile("[a-d[m-p]]");
        matcher = pattern.matcher("2342334289sdf23420dfghjfklgj");
        assertTrue(matcher.find());
        assertTrue(11 == matcher.start());

        pattern = Pattern.compile("[a-z&&[def]]");
        matcher = pattern.matcher("2342334289sdf23420dfghjfklgj");
        assertTrue(matcher.find());
        assertTrue(11 == matcher.start());

        pattern = Pattern.compile("[a-z&&[^bc]]");
        matcher = pattern.matcher("2342334289bcbcccbbbccsdf23420dfghjfklgj");
        assertTrue(matcher.find());
        assertTrue(21 == matcher.start());

        pattern = Pattern.compile("[a-z&&[^m-p]]");
        matcher = pattern.matcher("2342334289sdf23420dfghjfklgj");
        assertTrue(matcher.find());
        assertTrue(10 == matcher.start());

    }
}
