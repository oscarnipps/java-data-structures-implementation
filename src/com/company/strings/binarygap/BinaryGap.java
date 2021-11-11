package com.company.strings.binarygap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
    public static void main (String[] args) {
        int number = 25;

        String binaryString = getBinaryRepresentationString(number);

        System.out.println(String.format("longest gap : %d", getLongestBinaryGap(binaryString)));
    }

    public static String getBinaryRepresentationString(int number){
        return Integer.toBinaryString(number);
    }

    public static int getLongestBinaryGap(String binaryString){
        int numberOfOnes = 0;

        int numberOfZeros = 0;

        List<Integer> binaryGapList = new ArrayList<>();

        for (char item : binaryString.toCharArray()) {
            if (item == '1') {

                if (numberOfOnes > 1) {
                    binaryGapList.add(numberOfZeros);

                    numberOfZeros = 0;

                    continue;
                }

                numberOfOnes++;

                continue;
            }

            numberOfZeros++;
        }

        //sorts in ascending order
        Collections.sort(binaryGapList);

        int position = binaryGapList.size() - 1;

        int longestBinaryGap = binaryGapList.isEmpty() ? 0 : binaryGapList.get(position);

        return longestBinaryGap;    }
}
