package com.company.arrays.oddoccurences;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrence {

    public static void main(String[] args) {
        int[] array = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(String.format("unpaired element : %s", getUnpairedElement(array)));
    }

    public static int getUnpairedElement(int[] numbersArray) {

        Map<Integer, Integer> pairCountMap = new HashMap<>();

        int unPairedElement = 0;

        for (int number : numbersArray) {

            if (!pairCountMap.containsKey(number)) {
                pairCountMap.put(number, 0);
                continue;
            }

            int pairCount = pairCountMap.get(number) + 1;

            pairCountMap.put(number, pairCount);
        }

        for (Map.Entry<Integer, Integer> entry : pairCountMap.entrySet()) {
            if (entry.getValue() == 0) {
                unPairedElement = entry.getKey();
                break;
            }
        }

        return unPairedElement;
    }
}
