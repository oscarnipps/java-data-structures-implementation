package com.company.strings;

/*
 *   using a brute force approach to get the longest common prefix out of a list of strings
 *   i.e longest common prefix from the list {"flower","flow","flight", "fly"} is "fl"
 *
 *   created by oscar 06/09/2020
 */
public class LongestCommonPrefix1 {

    public static String getLongestCommonPrefix(String[] wordsList) {
        //return an empty string if the input was empty
        if (wordsList.length == 0) {
            return "";
        }

        //this would hold the longest common prefix length
        int prefixLength = 0;

        //get the smallest element either by sorting or doing linear search , in this case
        //linear search in O(n) is used to get the smallest item
        String smallestItem = wordsList[0];

        for (int i = 0; i < wordsList.length; i++) {
            if (smallestItem.length() < wordsList[i].length()) {
                continue;
            }
            smallestItem = wordsList[i];
        }

        //using the characters in the smallest item, compare with each character in each word from the list
        //increasing the prefixLength when the characters are equal in each word from the list or returning
        //the result when they are not equal
        for (int i = 0; i < smallestItem.length(); i++) {

            char currentChar = smallestItem.charAt(i);

            for (int j = 0; j < wordsList.length; j++) {
                if (currentChar != wordsList[j].charAt(i)) {
                    return smallestItem.substring(0, prefixLength);
                }
            }
            prefixLength++;
        }
        return smallestItem.substring(0, prefixLength);
    }
}
