package com.company.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] items = {4, 0, 2, 7, -1};

        System.out.println("array to sort :");
        printArrayItems(items);

        quickSort(items, 0, items.length - 1);

        System.out.println("array after sorting with quick sort :");
        printArrayItems(items);
    }

    public static void quickSort(int[] arr, int start, int end) {
        //base case would stop recursive call when condition is not met
        if (start < end) {
            int pivot = partition(arr, start, end);

            //quicksort left array (do not consider the pivot)
            quickSort(arr, start, pivot - 1);

            //quicksort right array (do not consider the pivot)
            quickSort(arr, pivot + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        //make pivot to be the last item in the array
        int pivot = arr[end];

        int i = start;

        for (int j = start; j <= end - 1; j++) {
            if (arr[j] <= pivot) {
                //swap the items at the positions
                swap(arr, i, j);
                i++;
            }
        }

        //take pivot to it's final position
        swap(arr, i, end);

        return i;
    }

    //helper to swap array items
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
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

