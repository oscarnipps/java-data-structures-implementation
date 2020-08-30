package com.company.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*
 *   encodes a string using run length encoding i.e 'AAABCC' would be encoded to '3AB2C' , 'ABACCCEEEE' would be encoded to 'ABA3C4E'"
 *
 *   created by oscar 20/08/2020
 */

public class RunLengthEncoding {

    public static void main(String[] args) {
        String value = "AABB";
        System.out.println( "encoded value for \"" + value + "\" is : " + getEncodedValue(value) );
    }

    public static String getEncodedValue(String value) {
        //hold the compressed encoded value
        StringBuilder encodedValueBuilder = new StringBuilder();

        //the number of times the code appears
        int codeLength = 0;
        int i = 0;

        //set the initial code
        Character code = value.charAt(0);

        while (i < value.length()) {

            if (code == value.charAt(i)) {
                codeLength++;
                i++;
            } else {
                //append the value and reset the code value and code length
                encodedValueBuilder.append("" + (codeLength == 1 || codeLength == 0 ? "" : codeLength) + code);
                code = value.charAt(i);
                codeLength = 0;
            }

            if (i == value.length()) {
                encodedValueBuilder.append("" + (codeLength == 1 || codeLength == 0 ? "" : codeLength) + code);
            }
        }

        return encodedValueBuilder.toString();
    }


}
