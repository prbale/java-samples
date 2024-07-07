package Algorithms.Search.BinarySearch;

public class BinarySearchTest {

    private int binarySearch(int arr[], int leftIndex, int rightIndex, int itemToSearch) {

        if(leftIndex == rightIndex) {
            return (arr[leftIndex] == itemToSearch) ? leftIndex : -1;
        }

        int middleIndex = (leftIndex + rightIndex) / 2;

        // Check if we are lucky, element found at the middle element.
        if(arr[middleIndex] == itemToSearch) {
            return middleIndex;
        }

        if(arr[middleIndex] > itemToSearch) {
            return binarySearch(arr, leftIndex, middleIndex, itemToSearch);
        }
        else {
            return binarySearch(arr,  middleIndex+1, rightIndex, itemToSearch);
        }
    }

    public static void main(String[] args) {

        // Data to Test
        int a[] = {1, 3, 5, 7, 9, 11, 13, 15, 16};
        int searchItem = 10;

        int result = -1;
        if(a != null && a.length != 0) {
            result = (new BinarySearchTest()).binarySearch(a, 0, a.length - 1, searchItem);
        }
        if(result == -1) {
            System.out.println("Item NOT found using Binary Search");
        }
        else {
            System.out.println("Item found using Binary Search");
        }
    }

}
