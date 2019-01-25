
package com.gmail.granovskiy.s;

import java.util.Arrays;

public class SequenceRepair {
    public static void repairArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i - 1] < array[i + 1]) {
                array[i] = array[i - 1] + 1;
            }
            if (array[i] < 0 && array[i - 1] > array[i + 1]) {
                array[i] = array[i - 1] - 1;
            }
        }
    }
}
