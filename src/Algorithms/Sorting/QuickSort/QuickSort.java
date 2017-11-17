package Algorithms.Sorting.QuickSort;

/**
 * Created by Prashant on 30-09-2016.
 */

/*
    Reference : http://techieme.in/easy-way-to-understand-quick-sort/

    This is the quickest algorithm considered for sorting.
    It is work on divide and conquer methodology.
    Recursion is used to implement this algorithm.
 */

public class QuickSort {

    public static void main(String args[]) {

        QuickSort qs = new QuickSort();

        // Input
        int[] a = new int[] { 6, 10, 13, 5, 8, 3, 2, 11 };

        qs.quickSort(a, 0, a.length - 1 );

    }


    public int partition(int[] a, int p, int q) {
        int x = a[p];
        int i = p;

        // Keep on checking if any element is less than the pivot.
        // If found, swap it.
        for (int j = i + 1; j <= q; j++) {
            if (a[j] <= x) {
                i += 1;
                swap(a, i, j);
            }
        }

        // Send pivot to its proper position, which is i'th location :)
        swap(a, p, i);

        System.out.println("-------------------------");
        System.out.println("Array after iteration: ");
        System.out.println("Pivot : " + x + " is at proper position ");
        printArray(a);

        // i'th is the partition point. Return this i to split array into sub arrays
        return i;
    }

    /**
     * This method will be called recursively.
     * @param a Input array provided to sort.
     * @param p start index of the array
     * @param q end index of the array
     */
    public void quickSort(int[] a, int p, int q) {
        if (p < q)  {
            int r = partition(a, p, q);
            quickSort(a, p, r - 1);
            quickSort(a, r + 1, q);
        }

    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
