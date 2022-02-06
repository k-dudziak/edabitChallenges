package org.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompleteTheWord {

    public static boolean canComplete(String initial, String word) {
        char[] initialCharsArray = initial.toCharArray();
        String patternString = new String();
        for (int i = 0; i < initialCharsArray.length; i++) {
        patternString = patternString+"*["+initialCharsArray[i]+"]*";
        }
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }
}
