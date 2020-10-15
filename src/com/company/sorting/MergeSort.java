package com.company.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] items = {4, 0,2 ,7, 3,-1};
        int[] result = new int[items.length];

        System.out.println("array to sort :");
        printArrayItems(items);

        mergeSort(items, result, 0, items.length - 1);

        System.out.println("array after sorting with merge sort :");
        printArrayItems(items);
    }

    public static void mergeSort(int[] items, int[] result, int start, int end) {
        //condition would fail and stop the recursive call when a single item is considered i.e a single array is
        //to be "merge-sorted"
        if (start < end) {
            //middle index
            int middle = (start + end) / 2;

            //recursively divide the left portion
            mergeSort(items, result, start, middle);

            //recursively divide the right portion
            mergeSort(items, result, middle + 1, end);

            //merge the splitted arrays
            merge(items, result, start, middle, end);
        }
    }

    private static void merge(int[] items, int[] temp, int start, int middle, int end) {
        //copy items from the source array
        for (int i = start; i <= end; i++) {
            temp[i] = items[i];
        }
        //start of the left array
        int i = start;

        //start of the right array
        int j = middle + 1;

        //start of the temp array
        int k = start;

        //keep comparing the left and right arrays
        while (i <= middle && j <= end) {
            if (temp[i] <= temp[j]) {
                items[k] = temp[i];
                i++;
            } else {
                items[k] = temp[j];
                j++;
            }
            k++;
        }

        //copy any items left over from the left array
        while (i <= middle) {
            items[k] = temp[i];
            i++;
            k++;
        }
    }

    //helper to print the array
    private static void printArrayItems(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("[ " + arr[i]);
                continue;
            }

            if (i + 1 == arr.length) {
                System.out.print(", " + arr[i] + " ]\n");
                continue;
            }

            System.out.print(", " + arr[i]);
        }
    }
}
