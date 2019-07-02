package code401Challenges.mergeSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestMergeSort {

    @Test
    public void testMergeSort() {
        int[] inputArr = new int[]{5, 4, 3, 2,1};
        MergeSort testMerge = new MergeSort(inputArr);
        int[] expectedOut = new int[] {1, 2, 3, 4, 5};
        int[] actualOut = testMerge.mergeUtility();

        assertArrayEquals("Both arrays should be equal to 1 2 3 4 5", expectedOut, actualOut);

    }
}
