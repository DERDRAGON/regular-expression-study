package com.der.regularexpression.lessonOne;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * @document Matcher-Api.md
 * @program: regular-expression
 * @description: ${description}
 * @author: long
 * @create: 2020-01-15 15:30
 */
public class GettingStarted {

    public static void main(final String[] args) {
        testHiStr();
        testmatchers();
        testRegexMatches();
        testAppend();
    }

    private static void testAppend(){
        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoobkkk";
        String REPLACE = "-";

        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,REPLACE);
        }
        m.appendTail(sb);
        assertEquals("-foo-foo-foo-kkk", sb.toString());
    }

    private static void testRegexMatches() {
        String REGEX = "dog";
        String INPUT = "The dog says meow. All dogs say meow.";
        String REPLACE = "cat";
        Pattern p = Pattern.compile(REGEX);
        // get a matcher object
        Matcher m = p.matcher(INPUT);
        INPUT = m.replaceFirst(REPLACE);
        assertEquals("The cat says meow. All dogs say meow.", INPUT);
        INPUT = m.replaceAll(REPLACE);
        assertEquals("The cat says meow. All cats say meow.", INPUT);
    }

    private static void testmatchers() {
        String REGEX = "foo";
        String INPUT = "fooooooooooooooooo";
        String INPUT2 = "ooooofoooooooooooo";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(INPUT);
        Matcher matcher2 = pattern.matcher(INPUT2);

        assertTrue(matcher.lookingAt());
        assertFalse(matcher.matches());
        assertFalse(matcher2.lookingAt());
        assertFalse(matcher2.matches());
    }

    private static void testHiStr() {
        String REGEX = "\\bcat\\b";
        String INPUT = "cat cat cat cattiecat cat";

        final Pattern p = Pattern.compile(REGEX);
        final Matcher m = p.matcher(INPUT); // 获取 matcher 对象
        int count = 0;

        List<Range<Integer>> list = Lists.newArrayList(Range.closed(0, 3), Range.closed(4, 7),
                Range.closed(8, 11), Range.closed(22, 25));

        while (m.find()) {
            Range<Integer> range = list.get(count);
            count++;
            assertTrue(m.start() == range.lowerEndpoint());
            assertTrue(m.end() == range.upperEndpoint());
        }
    }
}
