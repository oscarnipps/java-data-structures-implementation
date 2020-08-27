package com.company.strings;

import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String[] items = {"flower","flow","flight", "fly"};
        String[] items = {"flower","flow","flight", "fly"};
        getLongestCommonPrefix(items);
    }

    public static void getLongestCommonPrefix(String[] stringsList) {
        //get the smallest item either by sorting or doing linear search to
        String smallestString = stringsList[0];
        int shortestPrefixLength = Integer.MAX_VALUE;

        for (int i = 0; i < stringsList.length; i++) {
            if (smallestString.length() > stringsList[i].length()) {
                smallestString = stringsList[i];
            }
        }

        //get the prefix list
        List<String> prefixList = StringPrefix.getStringPrefixes(smallestString);

        for (int i = 0; i < stringsList.length; i++) {
            int prefixLength = 0;
            for (int j = 0; j < smallestString.length(); j++) {
                if (smallestString.charAt(j) != stringsList[i].charAt(j)) {
                    break;
                }
                prefixLength++;
            }

            if (prefixLength < shortestPrefixLength) {
                shortestPrefixLength = prefixLength;
            }
        }

        System.out.println("smallest item is : " + shortestPrefixLength);
        System.out.println("smallest item is : " + smallestString.substring(0,shortestPrefixLength));
    }
}
