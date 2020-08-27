package com.company.strings;

import java.util.ArrayList;
import java.util.List;

public class StringPrefix {

    public static List<String> getStringPrefixes(String value) {
        List<String> prefixList = new ArrayList<>();

        for (int index = 0; index <=value.length(); index++) {
            prefixList.add(value.substring(0,index));
        }

        return prefixList;
    }
}
