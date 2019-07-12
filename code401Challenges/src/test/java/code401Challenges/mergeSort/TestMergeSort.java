package code401Challenges.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMergeSort {

    @Test
    public void testMergeSort() {
        int[] inputArr = new int[]{5, 4, 3, 2, 1};
        MergeSort testMergeSort = new MergeSort(inputArr);
        int[] expectedOut = new int[] {1, 2, 3, 4, 5};
        int[] actualOut = testMergeSort.mergeSortUtility();

        assertArrayEquals("Both arrays should contain the sequence: 1 2 3 4 5", expectedOut, actualOut);

    }

    @Test
    public void testMergeSort_sizeOne() {
        int[] inputArr = new int[]{5};
        MergeSort testMergeSort = new MergeSort(inputArr);
        int[] expectedOut = new int[] {5};
        int[] actualOut = testMergeSort.mergeSortUtility();

        assertArrayEquals("Both arrays should contain the sequence: 5", expectedOut, actualOut);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testMergeSort_empty() {
        int[] inputArr = new int[]{};
        MergeSort testMergeSort = new MergeSort(inputArr);
        int[] expectedOut = new int[] {};
        int[] actualOut = testMergeSort.mergeSortUtility();

        assertArrayEquals("Both arrays should contain the sequence: []", expectedOut, actualOut);

    }
}
