/*  Ranges
Given a sorted integer array. Print all ranges in which each next element is increased by one.
The range is defined its minimal and maximal values. If the range contains one element print only its value.
Input
{array_length}
{array_values}
Output
[{min_range1} {max_range1}]...[{min_rangeN} {max_rangeN}]

Example
Input
11
1 2 3 5 8 9 10 13 14 15 16
Output
[1 3][5][8 10][13 16]
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

        SequenceProcessing process = new SequenceProcessing();
        process.processArray(array);
    }
}
