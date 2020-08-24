package com.company.strings;

public class StringReversal {
    public static String reverseString(String value) {

        StringBuilder reversedString = new StringBuilder();

        for (int index = value.length() - 1; index >= 0; index--) {
            reversedString.append(value.charAt(index));
        }

        return reversedString.toString();
    }
}
