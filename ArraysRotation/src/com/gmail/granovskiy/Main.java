

/*    Array Rotation
Given an integer array. Move first k elements to the array end.
Input
{array length} {k}
{array values}
Output
{rotated array}

Example
Input
5 2
5 6 1 2 6
Output
1 2 6 5 6
 */
package com.gmail.granovskiy;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is the length of the array?");
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        System.out.println("How many elements should be moved to the array end?");
        int elementsToMove = sc.nextInt();

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Please, enter element " + i);
            array[i] = sc.nextInt();
        }
        System.out.println("This is the original array: " + Arrays.toString(array));
        ArrayRotation rotation = new ArrayRotation();
        rotation.leftRotate(array, elementsToMove, arrayLength);
        System.out.println("This is the result array: " + Arrays.toString(array));
    }
}
