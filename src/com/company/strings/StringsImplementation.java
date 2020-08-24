package com.company.strings;

public class StringsImplementation {
    public static void main(String[] args) {

        //reversing a string
        String value = "hello";
        System.out.println( "reversed string '" + value + "' --->  '" + StringReversal.reverseString("hello") +"'");

        System.out.println();

        //getting suffixes for a string
        value = "house";
        System.out.println("-----getting string suffixes for : '" + value + "'" );
        StringSuffix.getStringSuffixes(value).forEach((suffixValue)-> System.out.println(suffixValue));

        System.out.println();


    }
}
