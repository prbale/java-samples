package Algorithms.Sorting.BubbleSort;

import java.util.Scanner;

/**
 * Created by Prashant on 28-08-2016.
 * Bubble Sort.
 */
public class Solution {

    public static void main(String[] args) {

        int a[] = readInputs();

        int swapsCount = 0;
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    swapsCount++;
                }
            }

            // Optimization check
            // If no swaps took place then list is already sorted.
            // Break the loop and come out of it.
            if(swapsCount == 0) {
                break;
            }

        }

        displaySortedArray(a);

    }

    private static void displaySortedArray(int[] a) {
        for( int i : a) {
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private static int[] readInputs() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        in.close();

        return a;
    }
}