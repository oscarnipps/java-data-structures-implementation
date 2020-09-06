package com.company.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 *   using a brute force approach to encodes a string using run length encoding i.e 'AAABCC' would be encoded to '3AB2C' ,
 *   'ABACCCEEEE' would be encoded to 'ABA3C4E'"
 *
 *   created by oscar 06/09/2020
 */

public class RunLengthEncoding1 {

    public static void main(String[] args) {
        String value = "AABBD";
        System.out.println("encoded value for \"" + value + "\" is : " + getEncodedValue(value));
    }

    public static String getEncodedValue(String pattern) {
        //hold the compressed encoded value
        StringBuilder compressedValueBuilder = new StringBuilder();

        for (int i = 0; i < pattern.length(); i++) {

            int codeLength = 1;

            while (i + 1 < pattern.length() && pattern.charAt(i) == pattern.charAt(i + 1)) {
                codeLength++;
                i++;
            }

            compressedValueBuilder.append("" + codeLength + pattern.charAt(i));
        }

        return compressedValueBuilder.toString();
    }


}
