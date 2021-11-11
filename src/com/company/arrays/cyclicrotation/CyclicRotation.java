package com.company.arrays.cyclicrotation;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] array = {3, 8, 9, 7, 6};

        int rotationTimes = 3;

        for (int i = 0; i < rotationTimes; i++) {
            array = rotateArray(array);
        }

        for (int item : array) {
            System.out.print(" " + item);
        }
    }


    public static int[] rotateArray(int[] numbers) {
        int[] rotatedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {

            rotatedArray[i + 1] = numbers[i];

            if (i > 0) {
                continue;
            }

            rotatedArray[0] = numbers[numbers.length - 1];
        }

        return rotatedArray;
    }
}
