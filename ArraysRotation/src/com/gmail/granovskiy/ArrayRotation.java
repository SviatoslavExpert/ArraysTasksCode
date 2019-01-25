package com.gmail.granovskiy;

public class ArrayRotation {

    public static void leftRotate(int[] arr, int elementsToMove, int arrayLength) {
        for (int i = 0; i < elementsToMove; i++) {
            int j;
            int temp;
            temp = arr[0];
            for (j = 0; j < arrayLength - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[j] = temp;
        }
    }
}
