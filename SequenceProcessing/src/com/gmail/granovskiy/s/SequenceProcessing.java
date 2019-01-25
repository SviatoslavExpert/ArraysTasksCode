

package com.gmail.granovskiy.s;

public class SequenceProcessing {

    public static void processArray(int[] array) {
        //  moving forward  - iterating the array
        int count;
        for (int i = 0; i < array.length - 1; i++) {
            //  if there is break in the sequence
            if (array[i + 1] != array[i] + 1) {
                count = 0;
                moveBack(array, count, i);
            }
            //  last index situation: if processing is on the index which is before last in the array
            if ((i + 1 == array.length - 1) && (array[i + 1] == array[i] + 1)) {
                moveBackFinal(array, i);
            }
            if ((i + 1 == array.length - 1) && (array[i + 1] != array[i] + 1)) {
                System.out.print("[" + array[i + 1] + "]");
            }
        }
    }

    public static void moveBack(int[] array, int count, int i) {
        //   moving back
        for (int k = i; k >= 0; k--) {
            //   standard sequence situation
            if ((count == 0 && k == 0) || (count == 0 && k != 0 && (array[k] - array[k - 1] != 1))) {
                //  for an odd number
                if(array[k] == array[i]) {
                    System.out.print("[" + array[k] + "]");
                    count++;
                } else {
                    System.out.print("[" + array[k] + "," + array[i] + "]");
                    count++;
                }
            }
        }
    }
    public static void moveBackFinal(int[] array, int i) {
        //   moving back
        for (int j = array.length - 1; j > 0; j--) {
            if (array[j] - array[j - 1] != 1) {
                System.out.print("[" + array[j] + "," + array[i + 1] + "]");
                return;
            }
        }
    }
}