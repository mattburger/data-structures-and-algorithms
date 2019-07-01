package code401Challenges.insertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestInsertionSort {

    @Test
    public void TestInsertionSort() {
        int[] inputArr = new int[] {5, 4, 6, 3, 1, 2};
        InsertionSort insertionSort = new InsertionSort(inputArr);
        int[] outputArr = insertionSort.insertionSortMethod();
        int[] expectedArr = new int[]{1, 2, 3, 4, 5, 6};

        assertArrayEquals("The resulting array should be returned sorted.", expectedArr, outputArr);
    }

    @Test(expected = IllegalStateException.class)
    public void TestInsertionSort_emptyArr() {
        int[] inputArr = new int[] {};
        InsertionSort insertionSort = new InsertionSort(inputArr);
        int[] outputArr = insertionSort.insertionSortMethod();
        int[] expectedArr = new int[]{1, 2, 3, 4, 5, 6};

        assertArrayEquals("The resulting array should be returned sorted.", expectedArr, outputArr);
    }

    @Test
    public void TestInsertionSort_arrOfSizeOne() {
        int[] inputArr = new int[] {5};
        InsertionSort insertionSort = new InsertionSort(inputArr);
        int[] outputArr = insertionSort.insertionSortMethod();

        assertArrayEquals("The resulting array should be returned sorted.", inputArr, outputArr);
    }

    @Test
    public void TestInsertionSort_arrOfSomeIdenticalValues() {
        int[] inputArr = new int[] {5, 4, 3, 3, 2, 6, 7, 1, 1};
        InsertionSort insertionSort = new InsertionSort(inputArr);
        int[] outputArr = insertionSort.insertionSortMethod();
        int[] expectedArr = new int[]{1, 1, 2, 3, 3, 4, 5, 6, 7};

        assertArrayEquals("The resulting array should be returned sorted.", inputArr, outputArr);
    }

    @Test
    public void TestInsertionSort_arrOfTwoIdenticalValues() {
        int[] inputArr = new int[] {5, 5};
        InsertionSort insertionSort = new InsertionSort(inputArr);
        int[] outputArr = insertionSort.insertionSortMethod();
        int[] expectedArr = new int[]{5, 5};

        assertArrayEquals("The resulting array should be returned sorted.", inputArr, outputArr);
    }

    @Test
    public void TestInsertionSort_arrOfTwoValues() {
        int[] inputArr = new int[] {5, 3};
        InsertionSort insertionSort = new InsertionSort(inputArr);
        int[] outputArr = insertionSort.insertionSortMethod();
        int[] expectedArr = new int[]{3, 5};

        assertArrayEquals("The resulting array should be returned sorted.", inputArr, outputArr);
    }
}


