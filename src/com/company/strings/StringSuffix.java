package com.company.strings;

import java.util.ArrayList;
import java.util.List;

public class StringSuffix {
    public static List<String> getStringSuffixes(String value) {
        List<String> suffixList = new ArrayList<>();

        for (int index = value.length() - 1; index >= 0; index--) {
            suffixList.add(value.substring(index));
        }

        return suffixList;
    }
}
