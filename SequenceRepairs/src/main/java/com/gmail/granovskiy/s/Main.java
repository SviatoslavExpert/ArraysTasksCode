/*  Restore array
Given an unsorted array of positive integers.
The array divided into monotone parts in which some elements replaced by negative values.
Find missing positive integers in the array.
Negative elements can be placed only inside a monotone part.
Negative elements cannot be in neighboring cells.
* monotone part - a sequence where each next number greater(less) than previous.
* e.g. 4 5 6 7 8 is the monotone part, but 5 3 1 6 7 is not monotone.

Input
{array_length}
{array_values}
Output
{restored array}

Example
Input
8
1 2 -1 4 7 6 -2 4
Output
1 2 3 4 7 6 5 4
 */
package com.gmail.granovskiy.s;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the length of the array?");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please, enter element " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("This is the original array: " + Arrays.toString(array));
        SequenceRepair repair = new SequenceRepair();
        repair.repairArray(array);
        System.out.println("This is the corrected array: " + Arrays.toString(array));
    }
}
