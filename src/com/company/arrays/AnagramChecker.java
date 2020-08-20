package com.company.arrays;

import java.util.HashMap;
import java.util.Map;

/*
*   checks if two words(or phrases are anagrams) i.e "adobe" is anagram with "abode" , "binary" with "brainy"
*
*   created by oscar 20/08/2020
*/
public class AnagramChecker {

    public static void main(String[] args) {
        String word1 = "a gentleman";
        String word2 = "elegant man";
        System.out.println("is anagram -> " + checkForAnagram(word1,word2));
    }
    public static boolean checkForAnagram(String firstString, String secondString) {
        //map to uniquely hold each character with the count
        Map<Character, Integer> anagramMap = new HashMap<>();

        //convert the first string to a character array
        char[] values = secondString.trim().toCharArray();

        //populate the map with the unique characters and update the count if already put in the map
        for (int i = 0; i < firstString.trim().length(); i++) {
            if (!anagramMap.containsKey(firstString.charAt(i))) {
                anagramMap.put(firstString.charAt(i), 1);
                continue;
            }
            anagramMap.replace(firstString.charAt(i), anagramMap.get(firstString.charAt(i)) + 1);
        }
        System.out.println("---items in the map---");
        anagramMap.forEach((key,value)->{
            System.out.println("key -> " + key + " value -> " + value);
        });

        //if the character does not exist in the map then return
        for (int i = 0; i < secondString.trim().length(); i++) {
            if (!anagramMap.containsKey(secondString.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
