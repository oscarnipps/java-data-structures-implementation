package com.company.arrays;

import java.util.*;

public class ArrayReversal {

    //reverses an array in place
    public static void reverseArray(int[] array) {

        for (int start = 0, end = array.length - 1; start < array.length; start++, end--) {
            if (start > end) {
                System.out.println("reversal finished...");
                break;
            }

            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

        }
    }
}
