package code401Challenges.quicksort;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestQuickSort {

    @Test
    public void testQuickSort() {
        int[] inputArr = {3, 5, 8, 1, 2, 9, 4, 7, 6};
        QuickSort testQS = new QuickSort(inputArr);
        testQS.quickSortUtilityMethod();
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        for(int i = 0; i < testQS.getQuickSortArr().length; i++) {
            System.out.println(testQS.getQuickSortArr()[i]);
        }

        assertArrayEquals("The array getter and expectedArr should return the same sequence of values",
                expectedArr, testQS.getQuickSortArr());

    }

    @Test
    public void testQuickSort_reversed() {
        int[] inputArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSort testQS = new QuickSort(inputArr);
        testQS.quickSortUtilityMethod();
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8 ,9};
        for(int i = 0; i < testQS.getQuickSortArr().length; i++) {
            System.out.println(testQS.getQuickSortArr()[i]);
        }

        assertArrayEquals("The array getter and expectedArr should return the same sequence of values",
                expectedArr, testQS.getQuickSortArr());

    }

    @Test
    public void testQuickSort_reversed_oneValue() {
        int[] inputArr = {1};
        QuickSort testQS = new QuickSort(inputArr);
        testQS.quickSortUtilityMethod();
        int[] expectedArr = {1};
        for(int i = 0; i < testQS.getQuickSortArr().length; i++) {
            System.out.println(testQS.getQuickSortArr()[i]);
        }

        assertArrayEquals("The array getter and expectedArr should return the same sequence of values",
                expectedArr, testQS.getQuickSortArr());

    }

    @Test
    public void testQuickSort_fewUniques() {
        int[] inputArr = {4, 3, 3, 3, 3, 3, 3, 3, 1};
        QuickSort testQS = new QuickSort(inputArr);
        testQS.quickSortUtilityMethod();
        int[] expectedArr = {1, 3, 3, 3, 3, 3, 3, 3, 4};
        for(int i = 0; i < testQS.getQuickSortArr().length; i++) {
            System.out.println(testQS.getQuickSortArr()[i]);
        }

        assertArrayEquals("The array getter and expectedArr should return the same sequence of values",
                expectedArr, testQS.getQuickSortArr());

    }

    @Test(expected = IllegalStateException.class)
    public void testQuickSort_empty() {
        int[] inputArr = {};
        QuickSort testQS = new QuickSort(inputArr);
        testQS.quickSortUtilityMethod();
        int[] expectedArr = {};
        for(int i = 0; i < testQS.getQuickSortArr().length; i++) {
            System.out.println(testQS.getQuickSortArr()[i]);
        }

        assertArrayEquals("The array getter and expectedArr should return the same sequence of values",
                expectedArr, testQS.getQuickSortArr());

    }
}
