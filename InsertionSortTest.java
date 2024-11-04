/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class InsertionSortTest {
    


    // Insertion Sort using Swap Method (Ascending)
    public void insertionSortSwap(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    // Insertion Sort using Swap Method (Descending)
    public void insertionSortSwapDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j - 1] < array[j]; j--) {
                int temp = array[j];
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
        }
    }

    // Optimized Insertion Sort using Replace Method (Ascending)
    public void insertionSortReplace(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Optimized Insertion Sort using Replace Method (Descending)
    public void insertionSortReplaceDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSortTest sorter = new InsertionSortTest();
        int[] array = {5, 2, 9, 1, 5, 6};

        // Test Swap Method (Ascending)
        int[] arrayAscendingSwap = array.clone();
        sorter.insertionSortSwap(arrayAscendingSwap);
        System.out.println("Ascending (Swap Method): " + java.util.Arrays.toString(arrayAscendingSwap));

        // Test Swap Method (Descending)
        int[] arrayDescendingSwap = array.clone();
        sorter.insertionSortSwapDescending(arrayDescendingSwap);
        System.out.println("Descending (Swap Method): " + java.util.Arrays.toString(arrayDescendingSwap));

        // Test Replace Method (Ascending)
        int[] arrayAscendingReplace = array.clone();
        sorter.insertionSortReplace(arrayAscendingReplace);
        System.out.println("Ascending (Replace Method): " + java.util.Arrays.toString(arrayAscendingReplace));

        // Test Replace Method (Descending)
        int[] arrayDescendingReplace = array.clone();
        sorter.insertionSortReplaceDescending(arrayDescendingReplace);
        System.out.println("Descending (Replace Method): " + java.util.Arrays.toString(arrayDescendingReplace));
    }
}

