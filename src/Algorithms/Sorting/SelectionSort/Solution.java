package Algorithms.Sorting.SelectionSort;

import java.util.Scanner;

/**
 * Created by Prashant on 28-08-2016.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        in.close();


        doSelectionSort(a);

        for( int i : a) {
            System.out.print(i);
            System.out.print(", ");
        }

    }

    private static void doSelectionSort(int[] a) {
        for(int i=0; i < a.length -1 ; i++ ) {

            int index = i;

            for(int j=i+1; j<a.length; j++ ) {
                if(a[j] < a[index])
                    index = j;
            }

            int smallerNumber = a[index];
            a[index] = a[i];
            a[i] = smallerNumber;


        }
    }
}