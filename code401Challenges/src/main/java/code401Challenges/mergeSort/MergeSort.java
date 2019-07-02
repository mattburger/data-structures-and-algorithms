package code401Challenges.mergeSort;

public class MergeSort {
    int[] mergeSortArr;

    public MergeSort(int[] in) {
        this.mergeSortArr = in;
    }


    public void mergeSortMethod(int[] inputArr) {
        int len = inputArr.length;

        if (len > 1) {
            int mid = len / 2;
            int[] firstHalf = new int[mid];
            int[] secondHalf = new int[len - mid];

            for (int i = 0; i < mid; i++) {
                firstHalf[i] = inputArr[i];
            }
            for (int i = mid; i < len - 1; i++) {
                secondHalf[i - mid] = inputArr[i];
            }

            mergeSortMethod(firstHalf);
            mergeSortMethod(secondHalf);
            this.mergeSortArr = merge(firstHalf, secondHalf, new int[len]);
        }
    }

    private int[] merge(int[] firstHalf, int[] secondHalf, int[] newSortedArr) {
        int i = 0, j = 0, k = 0;

        while (i < firstHalf.length && j < secondHalf.length) {
            if (firstHalf[i] <= secondHalf[j]) {
                newSortedArr[k] = firstHalf[i];
                i = i + 1;
            } else {
                newSortedArr[k] = secondHalf[j];
                j = j + 1;
            }

            k = k + 1;
        }

        if (i == firstHalf.length) {
            while (j < secondHalf.length) {
                newSortedArr[k] = secondHalf[j];

                j = j + 1;
                k = k + 1;
            }
        } else {
            while (i < firstHalf.length) {
                newSortedArr[k] = firstHalf[i];

                i = i + 1;
                k = k + 1;
            }
        }

        return newSortedArr;
    }

    public int[] mergeUtility() {
        mergeSortMethod(this.mergeSortArr);

        return this.mergeSortArr;
    }
}