package com.company.arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //initialize an array by setting the size upfront
        int[] numbersArray = new int[4];
        //initialize an array by setting the values upfront and the size is then inquired from the number of values
        int[] itemsArray = {1,20,4,29,10,7};

        System.out.println("size of items array -> " + itemsArray.length);

        //random accessing which has the constant running time O(1)
        System.out.println("item at position 2 -> " + itemsArray[2]);

        int searchItem = 4;

        //searching for an item in the array has the linear time complexity O(n)
        for (int i = 0; i < itemsArray.length; i++) {
            if (searchItem == itemsArray[i]) {
                System.out.println("item " + searchItem + " found at index " + i);
                break;
            }
        }

        //reversing an array in place
        ArrayReversal.reverseArray(itemsArray);
    }
}
