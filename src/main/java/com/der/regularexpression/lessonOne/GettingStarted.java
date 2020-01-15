package com.der.regularexpression.lessonOne;

import java.util.regex.Pattern;

/**
 * @program: regular-expression
 * @description: ${description}
 * @author: long
 * @create: 2020-01-15 15:30
 */
public class GettingStarted {

    private static final String TEST_STR = "hi , sdfjkhistory, this is my high, as always I`m a better man";

    private static final String pattern = "hi\\B";

    public static void main(String[] args) {
        testHiStr();
    }

    private static void testHiStr() {
        System.out.println(Pattern.matches(pattern, TEST_STR));
    }
}
