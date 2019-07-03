package code401Challenges.quicksort;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestQuickSort {

    @Test
    public void testQuickSort() {
        int[] inputArr = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        QuickSort testQS = new QuickSort(inputArr);
        testQS.quickSortUtilityMethod();
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7,8 ,9};

        assertArrayEquals("The array getter and expectedArr should return the same sequence of values",
                expectedArr, testQS.getQuickSortArr());

    }
}
